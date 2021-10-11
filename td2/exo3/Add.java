package fr.dauphine.javaavance.td2.exo3;

public class Add extends Expr{
	public Add(Expr e1, Expr e2) {
		this.setX(e1.eval() + e2.eval());
		System.out.println(e1 + " + " +e2);
	}
	
}
