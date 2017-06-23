package chess;

public class Rook extends mycharacter
{
	private static int newXMoveLoc;
	private static int newYMoveLoc;
	public Rook(int xpos, int ypos, boolean bl,mycharacter[][] t) {
		super(xpos, ypos, bl, t);
		
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = -7771619322964426430L;

	@Override
	public void move() 
	{
		if(checkIfValidMove())
		{
			Xpos=newXMoveLoc;
			Ypos=newYMoveLoc;
		}
		
	}
	public boolean checkIfValidMove()
	{
		if(Xpos!=newXMoveLoc&&Ypos!=newYMoveLoc)
		{
			return false;
		}
		if(Xpos==newXMoveLoc)
		{
			if(Ypos<newYMoveLoc)
			{
			for(int i=Ypos+1;i<newYMoveLoc;i++)
			{
				if(!(z[Xpos][i] instanceof emptySquare))
				{
					return false;
				}
			}
			if(z[Xpos][newYMoveLoc].isBlack==this.isBlack)
			{
				return false;
			}
			}
			else
			{
				for(int i=Ypos-1;i>newYMoveLoc;i--)
				{
					if(!(z[Xpos][i] instanceof emptySquare))
					{
						return false;
					}
				}
				if(z[Xpos][newYMoveLoc].isBlack==this.isBlack)
				{
					return false;
				}
			}
		}
		
		if(Ypos==newYMoveLoc)
		{
			if(Xpos<newXMoveLoc)
			{
			for(int i=Xpos+1;i<newXMoveLoc;i++)
			{
				if(!(z[i][Ypos] instanceof emptySquare))
				{
					return false;
				}
			}
			if(z[newXMoveLoc][Ypos].isBlack==this.isBlack)
			{
				return false;
			}
			}
			else
			{
				for(int i=Xpos-1;i>newXMoveLoc;i--)
				{
					if(!(z[i][Ypos] instanceof emptySquare))
					{
						return false;
					}
				}
				if(z[newXMoveLoc][Ypos].isBlack==this.isBlack)
				{
					return false;
				}
			}
		}
		return true;
	}
	
	public void getUserInput(mycharacter y) {
		newXMoveLoc=y.Xpos;
		newYMoveLoc=y.Ypos;
	}
}
