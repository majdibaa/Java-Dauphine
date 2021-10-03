package fr.dauphine.javaavance.td1;

public final class Point {
	private static int nbInstance = 0;
	private double x, y;
	public Point() {
		Point.nbInstance++;
	}
	public Point(double px, double py) {
		Point.nbInstance++;
		this.x = px;
		this.y = py;
	}
	
	public Point(Point p2) {
		Point.nbInstance++;
		this.x = p2.getX();
		this.y = p2.getY();
	}
	
	public void setX(double x) {
		this.x = x;
	}
	
	public void setY(double y) {
		this.y = y;
	}
	public int getInstance() {
		int temp = Point.nbInstance;
		return temp;
	}
	public double getX() {
		double temp = this.x;
		return temp;
	}
	public double getY() {
		double temp = this.y;
		return temp;
	}
	public boolean isSameAs(Point p3) {
		if((this.x == p3.getX()) && (this.y == p3.getY())) {
			return true;
		}
		return false;
	}
	
	public void translate(double dx, double dy) {
		this.setX(this.x+dx);
		this.setY(this.y+dy);
	}
	public void translate(Point p) {
		this.setX(this.x+p.getX());
		this.setY(this.y+p.getY());
	}
	@Override
	public String toString() {
		return "("+this.x+","+this.y+")";
	}
	
	@Override
	public boolean equals(Object j) {
		if(j instanceof Point) {
			Point temp = (Point) j;
			if((this.x == temp.getX()) && (this.y == temp.getY())) {
				return true;
			}
			return false;
		}
		return false;
	}
}
/* 												EXO 2
 * 
 * 
 *
 * 1) Ici �a marche car nous sommes dans la m�me classe et la visibilit� private nous permet de voir
 * les �l�ments dans la m�me classe
 * 
 * 2) Dans une autre classe, la visibilit� de private nous permet pas d'acc�der aux attributs x et y,
 * il faudrait alors cr�er une m�thode getX() et getY() pour r�cup�rer les valeurs ou en changeant la
 * visibilt� en mettant public (d�conseill�).
 * 
 * 3) On doit mettre tous les attributs en private car cela permet de garder un contr�le et de garder
 * une coh�rence entre les attributs
 * 
 * 4) C'est une m�thode permettant de r�cup�rer la valeur d'un attribut (un get), ici on doit cr�er la
 * m�thode getX() et getY() dans la classe point pour r�cup�rer la valeur des attributs
 * 
 * 5) Le mot cl� this est utilis� pour acc�der à un champ/m�thode de la classe
 * Par exemple en �tant dans la classe Point, pour utiliser l'attribut x dans une m�thode, il faut utiliser
 * le mot cl� this suivi du nom de l'attribut : this.x = 10 par exemple   
 * 
 * Output : fr.dauphine.javaavance.td1.Point@3764951d
 * Cela nous �crit le nom du package suivi du nom de la classe et de l'id de Objet, on peut voir que chaque
 * objet poss�de un identifiant
 * 
 * 7) 
 * 	private static int nbInstance = 0;
	public Point() {
		this.nbInstance++;
	}
	public int getInstance() {
		return this.nbInstance;
	}  
 * 	On cr�e un attribut priv� mais en ajoutant le mot cl� static c'est � dire qu'il sera partag� � toutes
 * 	les instances de la classe et non � chaque instance. Cet attribut doit donc �tre incr�ment� � chaque
 * 	fois que le constructeur est appel�. On r�cup�re la valeur avec un get. 
 * 
 * 8) public Point(Point p2) {
		this.nbInstance++;
		this.x = p2.getX();
		this.y = p2.getY();
	}
 *	Il sait quel constructeur appeler en fonction des arguments
 *
 *	9) 
 *	@Override
	public String toString() {
		return "("+this.x+","+this.y+")";
	}
 *
 *														
 *													EXO 3
 *
 *
 *	1) Output : true
 *				false
 *	Point p2=p1 nous permet de faire une copie exacte de l'objet, alors que Point p3=new Point(1,2);
 *	nous permet uniquement de cr�er un autre objet point qui a les m�mes coordonn�es donc qui a des
 *	attributs de m�mes valeurs.
 *
 *	2)	 
 *		public boolean isSameAs(Point p3) {
		if((this.x == p3.getX()) && (this.y == p3.getY())) {
			return true;
		}
		return false;
	}
 *	
		System.out.println(p1.isSameAs(p3));
 *	Output : true
 *
 *	3) La m�thode indexOf fait appel � la m�thode equals, le probl�me ici c'est qu'on demande l'index de p1
 *		et vu que on a dit que p2=p1, rechercher p2 revient � rechercher p1. Donc la m�thode indexOf ne r�pond
 *		pas � ce que nous voulons chercher. On peut alors red�finir la m�thode equals 
 *		@Override
		public boolean equals(Object j) {
			if(j instanceof Point) {
				Point temp = (Point) j;
				if((this.x == temp.getX()) && (this.y == temp.getY())) {
					return true;
				}
				return false;
			}
			return false;
		}

 *			
 *														EXO 5
 *
 *
 * 1) On peut d�finir la m�thode translate sous deux formes, translate(double dx, double dy) ou translate(Point p)
 * 
 * 5) Les deux cercles sont alors translat�s vu qu'ils sont li�s au m�me point, il faudrait alors mettre
 * 		 x et y et la classe Point en final pour qu'ils ne soient plus modifi�s 
 *
 * 6) Il faut alors faire une copie d�fensive, cr�er un objet Point qui sera �gal et aura les m�mes attributs
 * 		que le centre du cercle � renvoyer et on renvoie l'objet temporaire.
 *
 *	9) On peut rendre la m�thode static en plus de publique car nous n'utilisons pas de variables propre � la classe
 *		et on peut utiliser cette m�thode dans une autre classe sans instancier forc�ment un Cercle en faisant 
 *		Circle.contains(....)
 *  
 */