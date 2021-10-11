package fr.dauphine.javaavance.td2.exo3;
/**
 * Classe SquareRt qui repr�sente une expression arithm�tique faisant la racine carr� d'une autre expression
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
