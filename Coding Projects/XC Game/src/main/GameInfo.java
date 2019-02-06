package main;

import java.awt.Color;
import java.awt.Graphics;

public class GameInfo {
	
	public Board board;
	public Handler handler;
	public int currPlayer = 0;
	public Piece focus = null;
	
	public GameInfo(Handler handler) {
		this.handler = handler;
		board = new Board();
		handler.add(board);
	}
	
	public void render(Graphics g) {
		g.setColor(Color.WHITE);
		//g.fillRect((int) (Main.WIDTH - Main.rMargin), (int) (Main.HEIGHT * 0.1),
		//		(int) (Main.rMargin), (int) (Main.HEIGHT * 0.2));
		g.drawString("Current Player: " + Integer.toString(currPlayer),
				(int) ((Main.WIDTH - Main.rMargin * 0.9)), (int) (Main.tMargin * 2));
		if(focus != null) {
			focus.renderDetails(g);
		}
	}
	
	public void setFocus(Piece piece) {
		focus = piece;
	}

}
