package chess;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class emptySquare extends mycharacter
{

	public emptySquare(int xpos, int ypos, boolean bl,mycharacter[][] t) {
		super(xpos, ypos, bl, t);
	
		if((Xpos+Ypos)%2==1)
			this.setBackground(Color.black);
		else
			this.setBackground(Color.BLUE);
		this.removeActionListener(l);
		this.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = -7771619322964426430L;

	@Override
	public void move() {
		// TODO Auto-generated method stub
		setBackground(Color.GRAY);
		
	}


	@Override
	public boolean checkIfValidMove() {
		// TODO Auto-generated method stub
		return false;
	}



	


	
}
