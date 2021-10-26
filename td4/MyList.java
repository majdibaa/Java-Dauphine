package fr.dauphine.javaavance.td4;

public class MyList {
	private Cell first = null;
	private int taille=0;
	
	public MyList(Cell first) {
		this.first = first;
		Cell temp = first;
		while(temp!=null) {
			this.taille++;
			temp=temp.getNext();
		}
		this.taille++;
	}
	
	public MyList() {
		this.first = null;
		this.taille=0;
	}
	
	public void add(Object o) {
		Cell temp = new Cell(o,this.first);
		this.first = temp;
		this.taille++;
	}
	
	public int size() {
		return this.taille;
	}
	
	public void add(Object o, int i) {
		System.out.println(this.taille);
		if(i>this.taille) {
			System.err.println("Changez la valeur de sélection");
			System.exit(1);
		}else if(i==0) {
			this.add(o);
		}else if(i==this.taille) {
			this.addLast(o);
		}else if(i>0 && i<this.taille){
			Cell temp = this.first;
			int compt = 0;
			while(compt < i-1) {
				temp = temp.getNext();
				compt++;
			}
			temp.setNext(new Cell(o,temp.getNext()));
		}
		this.taille++;
	}
	
	public void addLast(Object o) {
		if(this.first == null){
			this.add(o);
		}else {
			Cell temp = first;
			while(temp.getNext()!=null) {
				temp = temp.getNext();
			}
			temp.setNext(new Cell(o));
			this.taille++;
		}
	}
	public int sumLetters() {
		Cell temp = first;
		int compt = 0;
		while(temp!=null) {
			for(int i=0;i<temp.toString().length();i++) {
				if(temp instanceof String) {
					compt++;
				}
			}
			temp=temp.getNext();
		}
		return compt;
	}
	
	public boolean contains(Object o) {
		Cell temp = this.first;
		while(temp!=null) {
			if(temp.toString() == o.toString()) {
				return true;
			}
			temp = temp.getNext();
		}
		return false;
	}
	
	@Override
	public String toString() {
		Cell temp = this.first;
		StringBuilder x = new StringBuilder("");
		do{
			x.append(temp+", ");
			temp = temp.getNext();
		}while (temp.getNext()!=null);
		x.append(temp);
		return x.toString();
	}
	public static void main(String[] args) {
		MyList ml = new MyList();
		ml.addLast("tatu");
		ml.add("toto");
		ml.add("titi");
		ml.add(1);
		ml.addLast("tutu");
		System.out.println(ml.sumLetters());
	}
}
