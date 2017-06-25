package chess;

import java.awt.Color;
import java.awt.event.ActionEvent;

public class knight extends mycharacter {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	public knight(int x, int y,boolean black,mycharacter[][] t) {
		// TODO Auto-generated constructor stub
		super(x,y,black,t);
		this.setVisible(true);
		this.setBackground(Color.RED);
	}

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
