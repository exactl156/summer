package chess;

import java.awt.Color;

public class Queen extends mycharacter 
{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6803903311686410236L;

	public Queen(int xpos, int ypos, boolean bl, mycharacter[][] t) {
		super(xpos, ypos, bl, t);
		this.setBackground(Color.magenta);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean checkIfValidMove() {
		//horizontal and vertical
		if(Xpos==newXMoveLoc||Ypos==newYMoveLoc)
		{
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
			if(z[newXMoveLoc][newYMoveLoc].isBlack==this.isBlack)
			{
				return false;
			}
			return true;
		}
		
		
		
		//diagonals
		if(Math.abs((newXMoveLoc-Xpos))==Math.abs((newYMoveLoc-Ypos)))
		{
			if(newXMoveLoc>Xpos)
			{
				if(newYMoveLoc>Ypos)
				{
				for(int i=1;i<Math.abs(newXMoveLoc-Ypos);i++ )
					{
						if(!(z[Ypos+i][Xpos+i]instanceof emptySquare))
						{
							return false;
						}
					}
				}
				else
				{
					for(int i=1;i<Math.abs(newXMoveLoc-Ypos);i++ )
					{
						if(!(z[Ypos-i][Xpos+i]instanceof emptySquare))
						{
							return false;
						}
					}
				}
				
			}
		}
		else
		{
			if(newYMoveLoc>Ypos)
			{
			for(int i=1;i<Math.abs(newXMoveLoc-Ypos);i++ )
				{
					if(!(z[Ypos+i][Xpos-i]instanceof emptySquare))
					{
						return false;
					}
				}
			}
			else
			{
				for(int i=1;i<Math.abs(newXMoveLoc-Ypos);i++ )
				{
					if(!(z[Ypos-i][Xpos-i]instanceof emptySquare))
					{
						return false;
					}
				}
			}
		}
		return false;
	}
}
