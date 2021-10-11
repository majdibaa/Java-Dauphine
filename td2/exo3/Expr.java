package fr.dauphine.javaavance.td2.exo3;
/**
 * Classe Expr repr�sentant une expression arithm�thique
 * @author Majdax
 *
 */
public class Expr {
	/**
	 * Attribut x repr�sentant la valeur de l'expression. J'ai choisi de le mettre en priv� plutot qu'en
	 * protected et j'ai pr�f�r� mettre un setX()
	 */
	private double x=0;
	/**
	 * Constructeur initialisant la variable x � 0
	 */
	public Expr() {
		this.x = 0.0;
	}
	/**
	 * M�thode eval retournant une copie d�fensive de l'attribut x
	 * @return a la copie d�fensive de x
	 */
	public double eval() {
		double a = this.x;
		return a;
	}
	/**
	 * Attribut une nouvelle valeur � x
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
