package fr.dauphine.javaavance.td3.controller;

import java.awt.event.*;

import fr.dauphine.javaavance.td3.model.MyDisplay;

public class MouseController implements MouseMotionListener{
	private MyDisplay md;
	public MouseController(MyDisplay x) {
		this.md = x;
	}
	@Override
	public void mouseDragged(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		this.md.move(e.getX(), e.getY());
		
	}

}
