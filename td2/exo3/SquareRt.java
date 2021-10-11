package fr.dauphine.javaavance.td2.exo3;
/**
 * Classe SquareRt qui représente une expression arithmétique faisant la racine carré d'une autre expression
 * @author Majdax
 *
 */
public class SquareRt extends Expr{
	/**
	 * Constructeur de l'expression 
	 * @param e1 l'expression dont on souhaite la racine
	 */
	public SquareRt(Expr e1) {
		this.setX(Math.sqrt(e1.eval()));
		System.out.println("\u221a "+e1);
	}
}
