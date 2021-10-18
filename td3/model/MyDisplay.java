package fr.dauphine.javaavance.td3.model;


import fr.dauphine.javaavance.td3.view.Vue;

//Model

public class MyDisplay{
	private Vue view;
	public MyDisplay(Vue x) {
		this.view = x;
	}
	public void move(int x, int y) {
		this.view.setX(x);
		this.view.setY(y);
		this.view.repaint();
	}
}
