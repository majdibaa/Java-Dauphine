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
 * 1) Ici ça marche car nous sommes dans la même classe et la visibilité private nous permet de voir
 * les éléments dans la même classe
 * 
 * 2) Dans une autre classe, la visibilité de private nous permet pas d'accéder aux attributs x et y,
 * il faudrait alors créer une méthode getX() et getY() pour récupérer les valeurs ou en changeant la
 * visibilté en mettant public (déconseillé).
 * 
 * 3) On doit mettre tous les attributs en private car cela permet de garder un contrôle et de garder
 * une cohérence entre les attributs
 * 
 * 4) C'est une méthode permettant de récupérer la valeur d'un attribut (un get), ici on doit créer la
 * méthode getX() et getY() dans la classe point pour récupérer la valeur des attributs
 * 
 * 5) Le mot clé this est utilisé pour accéder Ã  un champ/méthode de la classe
 * Par exemple en étant dans la classe Point, pour utiliser l'attribut x dans une méthode, il faut utiliser
 * le mot clé this suivi du nom de l'attribut : this.x = 10 par exemple   
 * 
 * Output : fr.dauphine.javaavance.td1.Point@3764951d
 * Cela nous écrit le nom du package suivi du nom de la classe et de l'id de Objet, on peut voir que chaque
 * objet possède un identifiant
 * 
 * 7) 
 * 	private static int nbInstance = 0;
	public Point() {
		this.nbInstance++;
	}
	public int getInstance() {
		return this.nbInstance;
	}  
 * 	On crée un attribut privé mais en ajoutant le mot clé static c'est à  dire qu'il sera partagé à  toutes
 * 	les instances de la classe et non à  chaque instance. Cet attribut doit donc être incrémenté à  chaque
 * 	fois que le constructeur est appelé. On récupère la valeur avec un get. 
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
 *	nous permet uniquement de créer un autre objet point qui a les mêmes coordonnées donc qui a des
 *	attributs de mêmes valeurs.
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
 *	3) La méthode indexOf fait appel à la méthode equals, le problème ici c'est qu'on demande l'index de p1
 *		et vu que on a dit que p2=p1, rechercher p2 revient à rechercher p1. Donc la méthode indexOf ne répond
 *		pas à ce que nous voulons chercher. On peut alors redéfinir la méthode equals 
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
 * 1) On peut définir la méthode translate sous deux formes, translate(double dx, double dy) ou translate(Point p)
 * 
 * 5) Les deux cercles sont alors translatés vu qu'ils sont liés au même point, il faudrait alors mettre
 * 		 x et y et la classe Point en final pour qu'ils ne soient plus modifiés 
 *
 * 6) Il faut alors faire une copie défensive, créer un objet Point qui sera égal et aura les mêmes attributs
 * 		que le centre du cercle à renvoyer et on renvoie l'objet temporaire.
 *
 *	9) On peut rendre la méthode static en plus de publique car nous n'utilisons pas de variables propre à la classe
 *		et on peut utiliser cette méthode dans une autre classe sans instancier forcément un Cercle en faisant 
 *		Circle.contains(....)
 *  
 */