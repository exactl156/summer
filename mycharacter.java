package chess;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public abstract class mycharacter extends JButton {
protected int Xpos;
protected int Ypos;

protected boolean isSelected;
private ActionListener l;


	public mycharacter(int xpos, int ypos) {
	super();
	Xpos = xpos;
	Ypos = ypos;
	isSelected = false;	
	l = new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
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
		
	};

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
