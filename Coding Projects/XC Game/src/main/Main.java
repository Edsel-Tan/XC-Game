package main;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import java.util.Scanner;

public class Main extends Canvas implements Runnable {
	
	public boolean running = true;
	public Thread thread;
	public static int WIDTH = -1, HEIGHT = -1;
	public static double lmargin = 0.01, rmargin = 0.29, tmargin = 0.05, bmargin = 0.05;
	public static double lMargin, rMargin, tMargin, bMargin, bWidth, hWidth;
	public Window window;
	public Handler handler;
	public GameInfo gameInfo;

	/**
	 * 
	 */
	private static final long serialVersionUID = 3650246170018746785L;
	
	public static void main(String args[]) {
		
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.println("Please input preffered window width. Recommended: 800");
			String answer = scanner.nextLine();
			try {
				WIDTH = Integer.parseInt(answer);
			} catch(Exception e) {
				System.out.println("Please input a positive integer.");
			}
		} while(WIDTH < 0);
		
		do {
			System.out.println("Please input preffered window height. Recommended: 600");
			String answer = scanner.nextLine();
			try {
				HEIGHT = Integer.parseInt(answer);
			} catch(Exception e) {
				System.out.println("Please input a positive integer.");
			}
		} while(HEIGHT < 0);
		
		scanner.close();
		lMargin = Main.WIDTH * lmargin; rMargin = Main.WIDTH * rmargin;
		tMargin = Main.HEIGHT * tmargin; bMargin = Main.HEIGHT * bmargin;
		bWidth = Main.WIDTH - lMargin - rMargin;
		hWidth = Main.HEIGHT - tMargin - bMargin;
		//System.out.println(tMargin);
		new Main();
	}
	
	public Main(){
		handler = new Handler();
		gameInfo = new GameInfo(handler);
		this.addMouseListener(new MouseInput(gameInfo));
		window = new Window(WIDTH, HEIGHT, "XC GAME", this);
	}
	
	private void render() {
		
		BufferStrategy bs = this.getBufferStrategy();
		if(bs==null){
			this.createBufferStrategy(3);
			return;
		}
		Graphics g = bs.getDrawGraphics();
		
		
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, WIDTH, HEIGHT);
		
		handler.render(g);
		gameInfo.render(g);
		
		g.dispose();
		bs.show();
		
	}
	
	private void tick() {
		
	}
	
	public synchronized void start() {
		thread = new Thread(this);
		running = true;
		System.out.println("Started");
		thread.start();
	}
	
	public synchronized void stop() {
		running = false;
		System.out.println("Stopped");
		try{
			thread.join();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		this.requestFocus();
		long lastTime = System.nanoTime();
		double delta = 0;
		int amountOfTicks = 60;
		long timer = System.currentTimeMillis();
		int frames = 0;
		long now = System.nanoTime();
		long ns = 1000000000 / amountOfTicks;
		
		while(running){
			now = System.nanoTime();
			delta += (double) (now - lastTime) / ns;
			lastTime = now;
			
			while(delta >= 1) {
				tick();
				delta--;
			}
			if (running){
				render();
			}
			frames++;
			
			if(System.currentTimeMillis() - timer > 1000){
				timer += 1000;
				System.out.println("FPS: " + frames);
				//System.out.println(frames);
				frames = 0;
			}
		}
		stop();
	}

}
