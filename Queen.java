package chess;

public class Queen extends mycharacter 
{

	public Queen(int xpos, int ypos, boolean bl, mycharacter[][] t) {
		super(xpos, ypos, bl, t);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean checkIfValidMove() {
		if(Xpos==newXMoveLoc||Ypos==newYMoveLoc)
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
		if(Math.abs((newXMoveLoc-Xpos))==Math.abs((newYMoveLoc-Ypos)))
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