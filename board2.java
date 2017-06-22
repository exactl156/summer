package chess;
import javax.swing.JPanel;
import javax.swing.Timer;

import java.awt.GridLayout;
import java.awt.Image;

import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.GridBagLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class board2 extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Timer time;
	/**
	 * Create the panel.
	 * @param e 
	 * @param d 
	 */
	mycharacter A;

	private double xsize;

	private double ysize;
	private mycharacter[][]  buttons;


	public board2() throws IOException 
	{
	
		buttons= new mycharacter[8][8];
		
		xsize = getToolkit().getScreenSize().getWidth();
		ysize = getToolkit().getScreenSize().getHeight();
		setBackground(Color.CYAN);
		setBounds(0, 0, (int)xsize, (int)ysize);
		
	
		setLayout(null);
		
		
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
			A=	new mycharacter(i,j,0);
				 A.setBounds((int)xsize/10*i,(int) ysize*j/10,(int) xsize/10,(int) ysize/10);
				
				buttons[i][j]=A;	
				add(A);
			}
			
		}
		time = new Timer(10000, new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Update();
			}
		});
		time.start();
	}
	public void Update()
	{		
		
		
		

		for (int i = 0; i < 8; i++) 
		{
			for (int j = 0; j < 8; j++) 
			{
				System.out.print(buttons.length);
				if(buttons.length>0){		
					mycharacter temp= buttons[i][j];
					if(temp.isSelected)
				{
					temp.setIcon(new ImageIcon("ty.jpg"));
					
				}
				
				}
				
			}
		}
		
	}


}
