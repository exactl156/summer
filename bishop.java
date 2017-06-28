package chess;

import java.awt.Color;

public class bishop extends mycharacter
{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8359645879905860212L;

	public bishop(int xpos, int ypos, boolean bl, mycharacter[][] t) {
		super(xpos, ypos, bl, t);
		this.setBackground(Color.GREEN);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean checkIfValidMove() {
		// TODO Auto-generated method stub
		return false;
	}
	
}
