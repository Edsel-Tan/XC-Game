package main;

import java.awt.Graphics;

public abstract class GameObject {
	
	public double sWidth, sHeight;
	
	public abstract void render(Graphics g);
	
	public abstract void tick();

}
