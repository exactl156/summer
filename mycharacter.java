package chess;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;

public abstract class mycharacter extends JButton {
/**
	 * 
	 */
	private static final long serialVersionUID = -1077474492673682496L;
protected int Xpos;
protected int Ypos;
protected boolean gameOver;
protected mycharacter[][] z;
protected boolean isSelected;
protected mycharacter isSelectedObject;
protected ArrayList<mycharacter> ValidMoves;
protected static ActionListener l;
protected boolean isBlack;
protected int newXMoveLoc;
protected int newYMoveLoc;
protected boolean hasmoved;

	public mycharacter(int xpos, int ypos, boolean bl,mycharacter[][] t) {
	super();
	ValidMoves= new ArrayList<mycharacter>();
	gameOver=false;
	isSelectedObject=null;
	isBlack=bl;
	this.setForeground(Color.ORANGE);
	z=t;
	Xpos = xpos;
	Ypos = ypos;
	if((Xpos+Ypos)%2==1)
	this.setBackground(Color.BLACK);
	if(xpos==0)
	{
		String st = ""+(char)((int)'a'+ypos);
		this.setText(st);
	}
	if(Ypos==0)
	{
		String st =""+Xpos;
		this.setText(st);
	}
	if(Ypos==0&& Xpos==0)
	{
		String st ="";
		this.setText(st);
	}
	
	
	isSelected = false;	
	l = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("666");
			System.out.println("666"+isSelected);
			if (!gameOver) {
				if (!isSelected && isSelectedObject == null) {
					isSelected = true;
					setSelfIsSelectedObject();
					System.out.println("676");
					for (mycharacter[] x : z) {
						for (mycharacter y : x) {
							y.isSelectedObject = getIsSelectedObject();
							isSelected = true;
						}
					}
					HighlightPossibleMoves();
				} else {
					isSelected = false;
					mycharacter t = getIsSelectedObject();
					t.getUserInput(getSelf());

					t.move();
					System.out.println("678" + t.Xpos);
					isSelectedObject = null;
					hasmoved = true;
				} 
			}
			
		}
	};
	
	this.addActionListener(l);
	}

	protected void HighlightPossibleMoves() {
		for (mycharacter[] x : z) {
			for (mycharacter y : x) {
				if(checkIfValidMove(y)&&(!y.equals(this)))
				{
					y.setBackground(Color.PINK);
				}
			}
		}
	}
	public boolean equals(mycharacter r)
	{
		if(Xpos==r.Xpos&&Ypos==r.Ypos)
		{
			return true;
		}
		return false;
	}
	public void move()
	{
		if(checkIfValidMove())
		{
			emptySquare	A=	new emptySquare(Ypos,Xpos,false,z);
			System.out.print("1");
			if((Xpos+Ypos)%2==1)
				A.setBackground(Color.black);
			else
				A.setBackground(Color.BLUE);
			z[Ypos][Xpos]=A;
			Xpos=newXMoveLoc;
			Ypos=newYMoveLoc;
			z[Ypos][Xpos]=this;
		}
	
	}

	public int getXpos() 
	{
	return Xpos;
	}

public void setXpos(int xpos) 
{
	Xpos = xpos;
}

public int getYpos() 
{
	return Ypos;
}

public mycharacter getIsSelectedObject() {
	return isSelectedObject;
}

public void setIsSelectedObject(mycharacter isSelectedObject) {
	this.isSelectedObject = isSelectedObject;
}
public void setSelfIsSelectedObject() {
	this.isSelectedObject = this;
}

public void setYpos(int ypos) 
{
	Ypos = ypos;
}
public mycharacter getSelf() {
	return this;
}
public boolean checkIfValidMove(mycharacter y)
{
	int	temp1=newXMoveLoc,temp2=newYMoveLoc;
	newXMoveLoc=y.Xpos;
	newYMoveLoc=y.Ypos;
	if(checkIfValidMove())
	{
		newXMoveLoc=temp1;
		newYMoveLoc=temp2;
		return true;
	}
	else
	{
		newXMoveLoc=temp1;
		newYMoveLoc=temp2;
	return false;
	}
}
public void getUserInput(mycharacter y)
{
	newXMoveLoc=y.Xpos;
	newYMoveLoc=y.Ypos;
}

public abstract boolean checkIfValidMove();	
}
