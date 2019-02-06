package main;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class Piece extends GameObject{
	
	public int wPos, hPos, player;
	public String pieceType;
	public static int size = 22;
	public String pieces[] = {"Bird", "Gun", "Cocaine", "Watermelon", 
			"Airpods", "Soul", "Thanos", "Friend", "Shaggy", "Pawn 2",
			"Chell", "Cookie", "Gardener", "Cactus", "WoodCutter",
			"Trump", "Fork", "Spoon", "Spork", "Queen", "Electron", "Positron", ""};
	
	
	
	public Piece(int wPos, int hPos, int piece, int player) {
		this.wPos = wPos; this.hPos = hPos;
		this.player = player;
		pieceType = pieces[piece];
		
		sWidth = Main.bWidth / Board.width; sHeight = Main.hWidth / Board.width;
	}
	
	public void renderDetails(Graphics g) {
		g.drawString("Piece: " + pieceType, 
				(int) ((Main.WIDTH - Main.rMargin * 0.9)), (int) (Main.tMargin * 2.4));
		g.drawString("Player: " + Integer.toString(player),
				(int) ((Main.WIDTH - Main.rMargin * 0.9)), (int) (Main.tMargin * 2.8));
		
		execute(0, g);
	}
	
	public void render(Graphics g) {
		g.setColor(Color.WHITE);
		g.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 12));
		String name = pieceType;
		if(pieceType.length() > 4) {
			name = pieceType.substring(0, 4);
		}
		g.drawString(name, (int) convertWidthS(), (int) convertHeight());
		
		
	}
	
	public boolean click(int x, int y) {
		return Math.abs(x - convertWidth()) < sWidth && Math.abs(y - convertHeight()) < sHeight;
	}
	
	public void execute(int move, Graphics g) {
		if (pieceType == pieces[0]) {
			if(move == 0) {
				g.setColor(Color.BLUE);
				g.drawString("Move 1: Fly.",
						(int) ((Main.WIDTH - Main.rMargin * 0.9)), (int) (Main.tMargin * 4.4));
				g.drawString("Move 2: Swoop.",
						(int) ((Main.WIDTH - Main.rMargin * 0.9)), (int) (Main.tMargin * 4.8));
			}
			
		} else if (pieceType == pieces[1]) {
			if(move == 0) {
				g.setColor(Color.BLUE);
				g.drawString("This item has no moves.",
						(int) ((Main.WIDTH - Main.rMargin * 0.9)), (int) (Main.tMargin * 4.4));
			}
			
		} else if (pieceType == pieces[2]) {
			if(move == 0) {
				g.setColor(Color.BLUE);
				g.drawString("This item has no moves.",
						(int) ((Main.WIDTH - Main.rMargin * 0.9)), (int) (Main.tMargin * 4.4));
			}
			
		} else if (pieceType == pieces[3]) {
			if(move == 0) {
				g.setColor(Color.BLUE);
				g.drawString("Move 1: Move to any square.",
						(int) ((Main.WIDTH - Main.rMargin * 0.9)), (int) (Main.tMargin * 4.4));
			}			
		} else if (pieceType == pieces[4]) {
			if(move == 0) {
				g.setColor(Color.BLUE);
				g.drawString("This item has a deadly aura...",
						(int) ((Main.WIDTH - Main.rMargin * 0.9)), (int) (Main.tMargin * 4.4));
			}			
		} else if (pieceType == pieces[5]) {
			if(move == 0) {
				g.setColor(Color.BLUE);
				g.drawString("Yo I'm not sure how to program this.",
						(int) ((Main.WIDTH - Main.rMargin * 0.9)), (int) (Main.tMargin * 4.4));
			}			
		} else if (pieceType == pieces[6]) {
			if(move == 0) {
				g.setColor(Color.BLUE);
				g.drawString("Move 1: Kill half the pieces randomly",
						(int) ((Main.WIDTH - Main.rMargin * 0.9)), (int) (Main.tMargin * 4.4));
			}			
		} else if (pieceType == pieces[7]) {
			if(move == 0) {
				g.setColor(Color.BLUE);
				g.drawString("Move 1: Kill himself (for the sake of others :(  )",
						(int) ((Main.WIDTH - Main.rMargin * 0.9)), (int) (Main.tMargin * 4.4));
			}			
		} else if (pieceType == pieces[8]) {
			if(move == 0) {
				g.setColor(Color.BLUE);
				g.drawString("Move 1: Unlock 1% of His power.",
						(int) ((Main.WIDTH - Main.rMargin * 0.9)), (int) (Main.tMargin * 4.4));
				g.drawString("Move 2: Move to any square.",
						(int) ((Main.WIDTH - Main.rMargin * 0.9)), (int) (Main.tMargin * 4.8));
				g.drawString("Move 3: (Requires 3% power and a gun.)",
						(int) ((Main.WIDTH - Main.rMargin * 0.9)), (int) (Main.tMargin * 5.2));
				g.drawString("Destroy enemies in the same row and column.",
						(int) ((Main.WIDTH - Main.rMargin * 0.9)), (int) (Main.tMargin * 5.6));
			}			
		} else if (pieceType == pieces[9]) {
			if(move == 0) {
				g.setColor(Color.BLUE);
				g.drawString("Move 1: Is better than pawn.",
						(int) ((Main.WIDTH - Main.rMargin * 0.9)), (int) (Main.tMargin * 4.4));
			}			
		} else if (pieceType == pieces[10]) {
			if(move == 0) {
				g.setColor(Color.BLUE);
				g.drawString("Move 1: Move to any square in line of sight.",
						(int) ((Main.WIDTH - Main.rMargin * 0.9)), (int) (Main.tMargin * 4.4));
			}			
		} else if (pieceType == pieces[11]) {
			if(move == 0) {
				g.setColor(Color.BLUE);
				g.drawString("Move 1: Add another cookie :).",
						(int) ((Main.WIDTH - Main.rMargin * 0.9)), (int) (Main.tMargin * 4.4));
			}			
		} else if (pieceType == pieces[12]) {
			if(move == 0) {
				g.setColor(Color.BLUE);
				g.drawString("Move 1: Plant a tree :).",
						(int) ((Main.WIDTH - Main.rMargin * 0.9)), (int) (Main.tMargin * 4.4));
			}			
		} else if (pieceType == pieces[13]) {
			if(move == 0) {
				g.setColor(Color.BLUE);
				g.drawString("This is a spiky boi.",
						(int) ((Main.WIDTH - Main.rMargin * 0.9)), (int) (Main.tMargin * 4.4));
			}			
		} else if (pieceType == pieces[14]) {
			if(move == 0) {
				g.setColor(Color.BLUE);
				g.drawString("Move 1: Cuts a neighbouring tree :(.",
						(int) ((Main.WIDTH - Main.rMargin * 0.9)), (int) (Main.tMargin * 4.4));
			}			
		} else if (pieceType == pieces[15]) {
			if(move == 0) {
				g.setColor(Color.BLUE);
				g.drawString("Move 1: Build a wall.",
						(int) ((Main.WIDTH - Main.rMargin * 0.9)), (int) (Main.tMargin * 4.4));
			}			
		} else if (pieceType == pieces[16]) {
			if(move == 0) {
				g.setColor(Color.BLUE);
				g.drawString("Move 1: Combine with spoon.",
						(int) ((Main.WIDTH - Main.rMargin * 0.9)), (int) (Main.tMargin * 4.4));
			}	
		} else if (pieceType == pieces[17]) {
			if(move == 0) {
				g.setColor(Color.BLUE);
				g.drawString("Move 1: Combine with fork.",
						(int) ((Main.WIDTH - Main.rMargin * 0.9)), (int) (Main.tMargin * 4.4));
			}	
			
		} else if (pieceType == pieces[18]) {
			if(move == 0) {
				g.setColor(Color.BLUE);
				g.drawString("A combination of fork and spoon",
						(int) ((Main.WIDTH - Main.rMargin * 0.9)), (int) (Main.tMargin * 4.4));
			}	
			
		} else if (pieceType == pieces[19]) {
			if(move == 0) {
				g.setColor(Color.BLUE);
				g.drawString("Move 1: Move 1 square in any direction.",
						(int) ((Main.WIDTH - Main.rMargin * 0.9)), (int) (Main.tMargin * 4.4));
			}	
			
		} else if (pieceType == pieces[20]) {
			if(move == 0) {
				g.setColor(Color.BLUE);
				g.drawString("Move 1: Move to a random spot.",
						(int) ((Main.WIDTH - Main.rMargin * 0.9)), (int) (Main.tMargin * 4.4));
				g.drawString("May be dangerous...",
						(int) ((Main.WIDTH - Main.rMargin * 0.9)), (int) (Main.tMargin * 4.8));
			}	
			
		} else if (pieceType == pieces[21]) {
			if(move == 0) {
				g.setColor(Color.BLUE);
				g.drawString("Move 1: Move to a random spot.",
						(int) ((Main.WIDTH - Main.rMargin * 0.9)), (int) (Main.tMargin * 4.4));
				g.drawString("May be dangerous...",
						(int) ((Main.WIDTH - Main.rMargin * 0.9)), (int) (Main.tMargin * 4.8));
			}	
			
		} else if (pieceType == pieces[22]) {
			if(move == 0) {
				g.setColor(Color.BLUE);
				
			}	
			
		}
	}
	
	public double convertWidthS() {
		return ((double) wPos + 0.01) * Main.bWidth/Board.width + Main.lMargin;
	}
	
	public double convertHeightS() {
		return ((double) hPos + 0.5) * Main.hWidth/Board.height + Main.tMargin;
	}
	
	public double convertWidth() {
		return (((double) wPos + 0.5) * Main.bWidth/Board.width + Main.lMargin);
	}
	
	public double convertHeight() {
		return (((double) hPos + 0.5) * Main.hWidth/Board.height + Main.tMargin);
	}


	@Override
	public void tick() {
		// TODO Auto-generated method stub
		
	}

}
