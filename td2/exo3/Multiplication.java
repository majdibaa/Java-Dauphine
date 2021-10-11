package fr.dauphine.javaavance.td2.exo3;
/**
 * Classe Multiplication qui permet de multiplier deux expressions arithmétiques
 * @author Majdax
 *
 */
public class Multiplication extends Expr{
	/**
	 * Constructeur permettant la multiplication de deux expressions
	 * @param e1 la premiere expression
	 * @param e2 la seconde expression
	 */
	public Multiplication(Expr e1, Expr e2) {
		this.setX(e1.eval() * e2.eval());
		System.out.println(e1 + " * " +e2);
	}
}
