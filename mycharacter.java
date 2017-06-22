package chess;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class mycharacter extends JButton {
/**
	 * 
	 */
	private static final long serialVersionUID = -1077474492673682496L;
protected int Xpos;
protected int Ypos;
protected int typeOfpiece;
public boolean isSelected;
private ActionListener l;


	public mycharacter(int xpos, int ypos, int typeOfpiece) {
	super();
	this.setForeground(Color.ORANGE);
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
	
	this.typeOfpiece=typeOfpiece;
	isSelected = false;	
	l = new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			
			if(!isSelected)
			{
				isSelected=true;
			}
		}
	};
	this.addActionListener(l);
	}

	public void move()
	{
		
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

public void setYpos(int ypos) 
{
	Ypos = ypos;
}

	public mycharacter getUserInput(mycharacter y) 
	{
		// TODO Auto-generated method stub
		return null;
	}
	
}
