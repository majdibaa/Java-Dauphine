package fr.dauphine.javaavance.td2;
import java.io.*;
/**
 * Cette classe permet de créer un objet Mere avec toutes ses méthodes
 * @author Majdax
 *
 */
class Mere {
	/**
	 * Affiche Mere_a
	 */
	public void a() {System.out.println("Mere_a"); }
	/**
	 * Affiche une fille
	 * @param fille la fille à afficher
	 */
	void b(Fille fille) {System.out.println("Mere_b(Fille)");}
	/**
	 * Affiche Mere_c
	 */
	void c() {System.out.println("Mere_c");}
	/**
	 * Affiche une Mere
	 * @param mere la mère à afficher
	 */
	void c(Mere mere) {System.out.println("Mere_c(Mere)"); }
	/**
	 * Affiche static Mere_d
	 */
	static void d() {System.out.println("static Mere_d");}
	/**
	 * Affiche Mere_e
	 */
	protected void e() {System.out.println("Mere_e");}
	/**
	 * Affiche Mere_f
	 */
	private void f() {System.out.println("Mere_f");}
	/**
	 * Fais appel à la méthode f()
	 */
	public void printF() { f(); }
	/**
	 * Affiche Mere_g
	 * @return 2 encapsulé dans un objet
	 */
	Object g() {System.out.println("Mere_g"); return 2;}
	/**
	 * Affiche Mere_h
	 * @return 2 
	 */
	int h() {System.out.println("Mere_h"); return 2;}
	/**
	 * Affiche Mere_i
	 */
	void i() {System.out.println("Mere_i");}
	/**
	 * Affiche Mere_j
	 * @throws Exception 
	 */
	void j() throws Exception {System.out.println("Mere_j"); }
	/**
	 * Affiche Mere_k
	 * @throws IOException
	 */
	void k() throws IOException {System.out.println("Mere_k"); }
	/**
	 * Affiche Mere_l
	 * @throws Exception
	 */
	void l() throws Exception {System.out.println("Mere_l"); }
	/**
	 * Affiche Mere_m
	 * @throws Exception
	 * @throws ArrayIndexOutOfBoundsException
	 */
	void m() throws Exception, ArrayIndexOutOfBoundsException {System.out.println("Mere_m"); }

}
/**
 * Classe Fille qui hérite d'une mère
 * @author Majdax
 *
 */
class Fille extends Mere{
	/**
	 * 
	 */
	void miage() {System.out.println("Miage");}

	//Redéfinition
	public void a() {System.out.println("Fille_a"); }
	
	//Redéfinition
	protected void b(Fille fille) {System.out.println("Fille_b(Fille)");}
	
	//Redéfinition
	public void c(Mere mere) {System.out.println("Fille_c(Mere)");}
	//Surcharge
	void c(Fille b) {System.out.println("Fille_c(Fille)"); }
	
	//Redéfinition
	static void d() {System.out.println("static Fille_d");}
	//Surcharge
	static void d(Mere mere) {System.out.println("Fille_d(Mere)");}

	//Redéfinition
	protected void f() {System.out.println("Fille_f");}
	
	//Redéfinition
	String g() {System.out.println("Fille_g"); return "c";}
	//Redéfinition
	void k() throws IOException {System.out.println("Fille_k"); }
	//Redéfinition
	void l() {System.out.println("Fille_l");}
	//Redéfinition
	void m() throws IOException, IllegalArgumentException {System.out.println("Fille_m"); }
}

public class Main {
	/**
	 * 
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		Mere mere=new Mere();
		Mere mereFille=new Fille();
		Fille fille=new Fille();
		//fais appel à la méthode miage de la fille output : Miage
		fille.miage();
		//cast explicite donc on appel la méthode miage de la fille output : Miage
		((Fille)mereFille).miage();
		//fais appel à la méthode de la mere output : Mere_a
		mere.a();
		//fais appel à la méthode de la fille output : Fille_a
		mereFille.a();
		//fais appel à la méthode de la fille output : Fille_a
		fille.a();
		//fais appel à la méthode de la fille quand meme output : Fille_a
		((Mere)mereFille).a();
		//fais appel à la méthode de la fille et malgré le paramètre null  output : Fille_b(Fille)
		mereFille.b(null);
		//fais appel à la méthode de la fille
		mereFille.c();
		//fais appel à la méthode de la fille avec une Mere comme argument
		mereFille.c(mere);
		//fais appel à la méthode de la fille mais mereFille est considérée comme une Mere
		mereFille.c(mereFille);
		//fais appel à la méthode de la fille mais avec une fille comme argument
		mereFille.c(fille);
		//fais appel à la méthode de la fille mais avec une fille comme argument
		fille.c(fille);
		
		//ça n'appelle que d() de la mère car la méthode est static
		mere.d();
		mereFille.d();
	
		//Output pour les deux Mere_f car ce sont les méthodes de la mère qui sont appelées
		mere.printF();
		mereFille.printF();
		
		//Méthode de la mère output : Mere_j
		mereFille.j();
		//Méthode de la fille car redéfinie output : Fille_k
		mereFille.k();
		//Méthode de la fille car redéfinie output : Fille_l
		mereFille.l();
		//Méthode de la fille car redéfinie output : Fille_m
		mereFille.m();
	}
}