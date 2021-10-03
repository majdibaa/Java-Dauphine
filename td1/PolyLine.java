package fr.dauphine.javaavance.td1;

import java.util.*;

public class PolyLine {
	//private Point[] myPoints;
	//static final int MAX_CAP=50;
	private LinkedList<Point> myPoints;
	public PolyLine(Point[] pt) {
		this.myPoints = new LinkedList<Point>();
		for(Point p : pt) {
			this.myPoints.add(p);
		}
	}
	
	public void add(Point p) {
		Objects.requireNonNull(p);
//		Point[] newPoints = new Point[this.myPoints.length+1];
//		for(int i=0;i<this.myPoints.length;i++) {
//			newPoints[i] = new Point(this.myPoints[i]);
//		}
//		newPoints[this.myPoints.length] = p; 
//		this.myPoints = newPoints;
		this.myPoints.add(p);
	}
//	public int pointCapacity() {
//		return this.myPoints.length;
//	}
	public int nbPoints() {
//		int compt = 0;
//		for(int i=0;i<this.myPoints.length;i++) {
//			if(this.myPoints[i] instanceof Point) {
//				compt++;
//			}
//		}
		return this.myPoints.size();
	}
	public boolean contains(Point p) {
		Objects.requireNonNull(p);
//		for(Point pt : this.myPoints) {
//			if(pt.equals(p)) {
//				return true;
//			}
//		}
//		return false;
		return this.myPoints.contains(p);
	}
}


/**
 * 														EXO 4
 * 
 * 	
 * 	2) Si on ajoute plus de points que la capacité maximale du tableau, une exception
 * 		java.lang.ArrayIndexOutOfBoundsException se lève. Ce qu'on peut faire c'est 
 * 		qu'à chaque fois que nous voulons ajouter un Point, on recrée un nouveau 
 * 		tableau de points qui sera de taille n+1 avec n = à la capacité du tableau précédent
 * 		et on y ajoute à la fin le nouveau Point. Ou alors on peut faire l'exercice avec une taille
 * 			
 * 
 * 3) 
 * 		public int pointCapacity() {
				return this.myPoints.length;
			}
			public int nbPoints() {
			int compt = 0;
			for(int i=0;i<this.myPoints.length;i++) {
				if(this.myPoints[i] instanceof Point) {
				compt++;
				}
			}
			return compt;
		}
	
 * 
 * 	5) La méthode renvoie alors false, et lorsqu'on ajoute un élément null, la méthode contains fait 
 * 		lever une exception (NullPointerException). On utilise alors Objects.requireNonNull(Point p)
 * 		dans la méthode add pour éviter d'ajouter un Point null.
 * 
 * 	6) Avec une LinkedList, la méthode pointCapacity devient obsolète car c'est tout le but de la classe
 * 		LinkedList. En effet, la liste va plus ou moins s'aggrandir en fonction des ajouts de point.
 * 		Donc c'est beaucoup plus flexible lorsqu'on connait pas la taille exacte du nombre de points.
 * 		nbPoints() est obtenu avec la méthode size() de la classe LinkedList qui renvoie le nombre d'
 * 		éléments. Et contains est obtenu aussi par la méthode contains(Object o) de la classe LinkedList.
 *
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */
