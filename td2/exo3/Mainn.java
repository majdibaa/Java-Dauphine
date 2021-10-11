package fr.dauphine.javaavance.td2.exo3;

public class Mainn {
	public static void main(String[] args) {
		Expr val = new Value(1337.0);
		System.out.println(val); //affiche 1337.0
		Expr add = new Add(new Value(327.0), val);
		System.out.println(add); //affiche 1664.0
		Expr e = new Add(new Value(350.0), add);
		System.out.println(e); //affiche 2014.0
		Expr f = new Multiplication(new Value(2.0), e);
		System.out.println(f); //affiche 4028.0
		Expr g = new SquareRt(new Value(16.0));
		System.out.println(g); //affiche 4.0
	}
}
