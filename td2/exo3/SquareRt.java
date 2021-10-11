package fr.dauphine.javaavance.td2.exo3;

public class SquareRt extends Expr{
	public SquareRt(Expr e1) {
		this.setX(Math.sqrt(e1.eval()));
		System.out.println("\u221a "+e1);
	}
}
