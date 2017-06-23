package chess;

public class knight extends mycharacter {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static int newXMoveLoc;
	private static int newYMoveLoc;

	public knight(int x, int y,boolean black,mycharacter[][] t) {
		// TODO Auto-generated constructor stub
		super(x,y,black,t);
	
	}

	@Override
	public void move() 
	{
		Xpos=newXMoveLoc;
		Ypos=newYMoveLoc;
	}
	public boolean checkIfValidMove()
	{
		return (newXMoveLoc<9&&newXMoveLoc>0)
				&&(newYMoveLoc<9&&newYMoveLoc>0)
				&&((newXMoveLoc-Xpos)*(newXMoveLoc-Xpos)+(newYMoveLoc-Ypos)*(newYMoveLoc-Ypos)==5)
				&&(!(z[newXMoveLoc][newYMoveLoc].isBlack!=this.isBlack));
	}
	
	public void getUserInput(mycharacter y) {
		// TODO Auto-generated method stub
		newXMoveLoc=y.Xpos;
		newYMoveLoc=y.Ypos;
	}
	

}
