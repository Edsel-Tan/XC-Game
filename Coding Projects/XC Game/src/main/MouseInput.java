package main;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MouseInput extends MouseAdapter {
	
	public GameInfo gameInfo;
	
	public MouseInput(GameInfo gameInfo) {
		this.gameInfo = gameInfo;
	}
	
	public void mouseClicked(MouseEvent e) {
		int mx = e.getX(); int my = e.getY();
		
		for(int i = 0; i < gameInfo.board.piecesL.size(); i++) {
			if(gameInfo.board.piecesL.get(i).click(mx, my)) {
				gameInfo.setFocus(gameInfo.board.piecesL.get(i));
			}
		}
	}

}
