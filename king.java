package chess;

import java.awt.Color;

public class king extends mycharacter
{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4696274522006008032L;

	public king(int xpos, int ypos, boolean bl, mycharacter[][] t) {
		super(xpos, ypos, bl, t);
		setBackground(Color.YELLOW);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean checkIfValidMove() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void getUserInput(mycharacter y) {
		// TODO Auto-generated method stub
		newXMoveLoc=y.Xpos;
		newYMoveLoc=y.Ypos;
	}
	
}
