package main;

import java.awt.Color;
import java.awt.Graphics;
import java.util.LinkedList;
import java.util.Random;

public class Board extends GameObject{
	
	public static int width = 18, height = 18;
	public static int thiccness = 3;
	LinkedList<Piece> piecesL = new LinkedList<Piece>();
	Piece piecesG[][][];
	
	public Board() {
		Random random = new Random();
		Piece piece;
		
		piecesG = new Piece[width][height][3];
		
		for(int i = 0; i < width; i++) {
			for(int j = 0; j < thiccness; j++) {
				piece = new Piece(i, j, random.nextInt(Piece.size), 0);
				
				piecesG[i][j][0] = piece;
				piecesL.add(piece);
				
				piece = new Piece(i, height-j-1, random.nextInt(Piece.size), 1);
				
				piecesG[i][height-j-1][0] = piece;
				piecesL.add(piece);
			}
		}
		
	}

	@Override
	public void render(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(Color.WHITE);
		
		for(int i = 0; i <= width; i++) {
			g.drawLine((int) (Main.lMargin + (i*Main.bWidth)/width),
					(int) (Main.tMargin),
					(int) (Main.lMargin + (i*Main.bWidth)/width),
					(int) (Main.HEIGHT - Main.bMargin));
		}
		for(int i = 0; i <= height; i++) {
			g.drawLine((int) (Main.lMargin),
					(int) (Main.tMargin + (i*Main.hWidth)/height),
					(int) (Main.WIDTH - Main.rMargin),
					(int) (Main.tMargin + (i*Main.hWidth)/height));
		}
		
		for(int i = 0; i < piecesL.size(); i++) {
			piecesL.get(i).render(g);
		}
	}

	@Override
	public void tick() {
		// TODO Auto-generated method stub
		
	}
	

}
