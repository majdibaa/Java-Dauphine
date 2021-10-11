package fr.dauphine.javaavance.td2.exo3;

public class Expr {

	private double x=0;
	public Expr() {
		this.x = 0;
	}
	public double eval() {
		double a = this.x;
		return a;
	}
	public void setX(double a ) {
		this.x = a;
	}
	@Override
	public String toString() {
		return this.x+"";
	}
}
