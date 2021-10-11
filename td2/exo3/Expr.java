package fr.dauphine.javaavance.td2.exo3;
/**
 * Classe Expr représentant une expression arithméthique
 * @author Majdax
 *
 */
public class Expr {
	/**
	 * Attribut x représentant la valeur de l'expression. J'ai choisi de le mettre en privé plutot qu'en
	 * protected et j'ai préféré mettre un setX()
	 */
	private double x=0;
	/**
	 * Constructeur initialisant la variable x à 0
	 */
	public Expr() {
		this.x = 0.0;
	}
	/**
	 * Méthode eval retournant une copie défensive de l'attribut x
	 * @return a la copie défensive de x
	 */
	public double eval() {
		double a = this.x;
		return a;
	}
	/**
	 * Attribut une nouvelle valeur à x
	 * @param a la nouvelle valeur
	 */
	public void setX(double a ) {
		this.x = a;
	}
	@Override
	public String toString() {
		return this.x+"";
	}
}
