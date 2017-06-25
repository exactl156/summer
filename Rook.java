package chess;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.swing.ImageIcon;

public class Rook extends mycharacter
{
	
	public Rook(int xpos, int ypos, boolean bl,mycharacter[][] t) {
		super(xpos, ypos, bl, t);
	this.setBackground(Color.black);
	this.setEnabled(true);
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = -7771619322964426430L;

	@Override
	public boolean checkIfValidMove()
	{
		return true;
		/*if(Xpos!=newXMoveLoc&&Ypos!=newYMoveLoc)
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
		return true;*/
	}
	
	public void getUserInput(mycharacter y) {
		newXMoveLoc=y.Xpos;
		newYMoveLoc=y.Ypos;
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		super.move();
		this.setBackground(Color.BLACK);
	}

	

	
	
}