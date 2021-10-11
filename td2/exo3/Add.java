package fr.dauphine.javaavance.td2.exo3;
/**
 * Class Add qui permet d'additionner deux expressions arithmétiques
 * @author Majdax
 *
 */
public class Add extends Expr{
	/**
	 * Constructeur qui prend en argument les deux expressions à additionner
	 * @param e1 la première valeur
	 * @param e2 la seconde valeur
	 */
	public Add(Expr e1, Expr e2) {
		this.setX(e1.eval() + e2.eval());
		System.out.println(e1 + " + " +e2);
	}
	
}
