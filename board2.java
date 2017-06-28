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
	private boolean needsUpdating;


	public board2() throws IOException 
	{
	
		buttons= new mycharacter[9][9];
		
		xsize = getToolkit().getScreenSize().getWidth();
		ysize = getToolkit().getScreenSize().getHeight();
		setBackground(Color.CYAN);
		setBounds(0, 0, (int)xsize, (int)ysize);
		
	
		setLayout(null);
		
		
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
			
			A=	new emptySquare(i,j,false,buttons);
				 A.setBounds((int)xsize/10*i,(int) ysize*j/10,(int) xsize/10,(int) ysize/10);
					//White pieces
				 if(i==8&&(j==5))
					{
						A= new Queen(j,i,true,buttons);
						A.setBounds((int)xsize/10*i,(int) ysize*j/10,(int) xsize/10,(int) ysize/10);
					}
				 if(i==8&&(j==4))
					{
						A= new king(j,i,true,buttons);
						A.setBounds((int)xsize/10*i,(int) ysize*j/10,(int) xsize/10,(int) ysize/10);
					}	
				 if(i==8&&(j==3||j==6))
					{
						A= new bishop(j,i,true,buttons);
						A.setBounds((int)xsize/10*i,(int) ysize*j/10,(int) xsize/10,(int) ysize/10);
					}
				 	if(i==8&&(j==2||j==7))
					{
						A= new knight(j,i,true,buttons);
						A.setBounds((int)xsize/10*i,(int) ysize*j/10,(int) xsize/10,(int) ysize/10);
					}
					if(i==8&&(j==8||j==1))
					{
						A= new Rook(j,i,true,buttons);
						A.setBounds((int)xsize/10*i,(int) ysize*j/10,(int) xsize/10,(int) ysize/10);
					}
					if((i==2)&&(j>0))
					{
						A=new pawn(j, i, true, buttons);
					}
					// black pieces
					 if(i==1&&(j==5))
						{
							A= new Queen(j,i,false,buttons);
							A.setBounds((int)xsize/10*i,(int) ysize*j/10,(int) xsize/10,(int) ysize/10);
						}
					 if(i==1&&(j==4))
						{
							A= new king(j,i,false,buttons);
							A.setBounds((int)xsize/10*i,(int) ysize*j/10,(int) xsize/10,(int) ysize/10);
						}	
					 if(i==1&&(j==3||j==6))
						{
							A= new bishop(j,i,false,buttons);
							A.setBounds((int)xsize/10*i,(int) ysize*j/10,(int) xsize/10,(int) ysize/10);
						}
					if(i==1&&(j==2||j==7))
					{
						A= new knight(j,i,false,buttons);
						A.setBounds((int)xsize/10*i,(int) ysize*j/10,(int) xsize/10,(int) ysize/10);
					}
					if(i==1&&(j==8||j==1))
					{
						A= new Rook(j,i,false,buttons);
						A.setBounds((int)xsize/10*i,(int) ysize*j/10,(int) xsize/10,(int) ysize/10);
					}
					if((i==7)&&(j>0))
					{
						A=new pawn(j, i, true, buttons);
					}
				
				buttons[j][i]=A;	
				add(A);
			}
			
		}
		time = new Timer(10, new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Update();
			}
		});
		time.start();
	}
	public void Update()
	{		
		removeAll();
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
			
				A=	buttons[i][j];
				 A.setBounds((int)xsize/10*i,(int) ysize*j/10,(int) xsize/10,(int) ysize/10);	
				add(A);
				revalidate();
				
			}
			
		}
		repaint();
	
	/*	for (int i = 0; i < 9; i++) 
		{
			for (int j = 0; j < 9; j++) 
			{		
					mycharacter temp= buttons[i][j];
					if(temp.hasmoved)
				{
					temp.hasmoved=false;
					needsUpdating=true;		 
					removeAll();
					revalidate();
					repaint();
					
				}
					
				
			}
		}
		if(needsUpdating)
		{
		for(mycharacter[] x: buttons)
		{
			for(mycharacter y:x)
			{
				add(y);
				y.revalidate();
				y.repaint();
				revalidate();
				repaint();
			}
		}
		needsUpdating= false;
		}*/
	
	}

}



