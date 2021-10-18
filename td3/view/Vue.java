package fr.dauphine.javaavance.td3.view;

import java.awt.*;
import javax.swing.*;

import fr.dauphine.javaavance.td3.controller.MouseController;
import fr.dauphine.javaavance.td3.model.MyDisplay;

//View

public class Vue extends JPanel{
	private int x=400;
	private int y=500;
	public Vue(int x, int y) {
		JFrame frame = new JFrame("TP3");
		frame.setSize(new Dimension(x,y));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MyDisplay md = new MyDisplay(this);
		this.addMouseMotionListener(new MouseController(md));
		frame.add(this);
		frame.setVisible(true);
	}	
	@Override
	protected void paintComponent(Graphics g) {
		g.setColor(Color.BLUE);
		g.drawLine(50, 50, 200, 190);
		g.setColor(Color.RED);
		g.fillRect(this.x, this.y, 15, 15);
	}
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
}
