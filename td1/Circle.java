package fr.dauphine.javaavance.td1;

public class Circle {

	private static int nbInstance = 0;
	private Point center;
	private double radius;
	
	public Circle(Point p, int radius) {
		Circle.nbInstance++;
		this.center = p;
		this.radius = radius;
	}
	
	public void translate(double dx, double dy) {
		this.center.translate(dx,dy);
	}
	public static int getNbInstance() {
		int x = Circle.nbInstance;
		return x;
	}
	public Point getCenter() {
		Point temp = new Point(this.center);
		return temp;
	}
	public double area() {
		return Math.PI*(radius*radius);
	}
	public double getRadius() {
		double temp = this.radius;
		return temp;
	}
	public static boolean contains(Point p, Circle[] circles) {
		for(int i=0;i<circles.length;i++) {
			if(circles[i].contains(p)) {
				return true;
			}
		}
		return false;
	}
	public boolean contains(Point p) {
		double d = Math.sqrt(Math.pow(this.center.getX()-p.getX(),2.0)+Math.pow(this.center.getY()-p.getY(),2.0));
		if(d<=this.radius) {
			return true;
		}
		return false;
	}
	
	@Override
	public String toString() {
		return "Center : "+this.center+" Radius : "+this.radius+ " Area : "+this.area();
	}
}
