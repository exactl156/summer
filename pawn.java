package chess;

public class pawn extends mycharacter {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3005346631429412340L;

	public pawn(int xpos, int ypos, boolean bl, mycharacter[][] t) {
		super(xpos, ypos, bl, t);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean checkIfValidMove() {
		if(isBlack)
		if(z[Xpos][Ypos+1]instanceof emptySquare) 
		{
			
		}
				
		return false;
	}

	@Override
	public void getUserInput(mycharacter y) {
		// TODO Auto-generated method stub
		newXMoveLoc=y.Xpos;
		newYMoveLoc=y.Ypos;
	}

}
