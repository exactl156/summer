package chess;

import java.awt.Color;

public class pawn extends mycharacter {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3005346631429412340L;

	public pawn(int xpos, int ypos, boolean bl, mycharacter[][] t) {
		super(xpos, ypos, bl, t);
		this.setBackground(Color.cyan);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean checkIfValidMove() {
		if(isBlack)
		if(z[newXMoveLoc][newYMoveLoc-1]instanceof emptySquare) 
		{
			return true;
		}
				
		return false;
	}
}
