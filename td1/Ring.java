package fr.dauphine.javaavance.td1;

public class Ring {
	private Point center;
	private double inRadius;
	private double outRadius;
	
	public Ring(Point center, double inRadius, double outRadius) {
		this.center = center;
		if(inRadius<outRadius) {
			this.inRadius = inRadius;
			this.outRadius = outRadius;
		}else {
			System.err.println("Le rayon intérieur doit être inférieur à l'extérieur");
			System.exit(1);
		}
	}
	public Point getCenter() {
		Point temp = this.center;
		return temp;
	}
	public double getInRadius() {
		double temp = this.inRadius;
		return temp;
	}
	public double getOutRadius() {
		double temp = this.outRadius;
		return temp;
	}
	
	@Override
	public boolean equals(Object j) {
		if(j instanceof Ring) {
			Ring temp = (Ring) j;
			if(temp.getCenter().equals(this.center) && (this.inRadius == temp.getInRadius()) && (this.outRadius == temp.getOutRadius())) {
				return true;
			}
			return false;
		}
		return false;
	}
	@Override
	public String toString() {
		return this.center+" Rayon intérieur : "+this.inRadius+"  Rayon extérieur : "+this.outRadius;
	}
	public boolean contains(Point p) {
		double d = Math.sqrt(Math.pow(this.center.getX()-p.getX(),2.0)+Math.pow(this.center.getY()-p.getY(),2.0));
		if((d<=this.inRadius) || (d<=this.outRadius)) {
			return true;
		}
		return false;
	}
	public static boolean contains(Point p, Ring[] rings) {
		for(int i=0;i<rings.length;i++) {
			if(rings[i].contains(p)) {
				return true;
			}
		}
		return false;
	}
}




/*									EXO 6
 * 
 * 
 * 	1) Un anneau n'est ni un point, ni un cercle ou ni une Polyligne donc il ne faut pas utiliser
 * 		l'héritage
 * 
 * 	4) fr.dauphine.javaavance.td1.Ring@2a33fae0
		Il faut redéfinir la fonction toString
 * 
 * 
 * *
 */
