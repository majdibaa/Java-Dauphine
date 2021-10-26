package fr.dauphine.javaavance.td4;

public class Cell {
	private final Object o;
	private Cell suiv = null;
	
	public Cell(Object o, Cell next) {
		this.o = o;
		this.suiv = next;
	}
	public Cell(Object o) {
		this.o = o;
	}
	public Cell getNext() {
		return this.suiv;
	}
	public void setNext(Cell next) {
		this.suiv = next;
	}
	
	@Override
	public String toString() {
		return o.toString();
	}
	
}
