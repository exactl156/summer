package chess;

import java.awt.Color;

public class emptySquare extends mycharacter
{

	public emptySquare(int xpos, int ypos, boolean bl,mycharacter[][] t) {
		super(xpos, ypos, bl, t);
		if((Xpos+Ypos)%2==1)
			this.setBackground(Color.black);
		else
			this.setBackground(Color.BLUE);
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = -7771619322964426430L;

	@Override
	public void move() {
		// TODO Auto-generated method stub
		
	}
	
}
