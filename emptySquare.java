package chess;

import java.awt.Color;
import java.awt.event.ActionEvent;

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
		setBackground(Color.GRAY);
		
	}

	@Override
	public void getUserInput(mycharacter y) {
		// TODO Auto-generated method stub
		this.newXMoveLoc=y.Xpos;
		this.newYMoveLoc=y.Ypos;
	}

	@Override
	public boolean checkIfValidMove() {
		// TODO Auto-generated method stub
		return false;
	}

	


	
}
