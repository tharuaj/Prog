/**
 * 
 * @author sw
 *
 */
 
public class Person {
	
	private String name;
	private int gebJahr;
	
	public Person(String n, int g) {
		this.name = n;
		this.gebJahr = g;
	}
	
	public String name() {
		return this.name;
	}
	
	public int gebJahr() {
		return this.gebJahr;
	}
	
	@Override
	public String toString() {
		return this.name + " (" + this.gebJahr + ")";
	}

	@Override
	public boolean equals(Object obj){
		if(this == obj) return true;//vergleicht Speicheraddresse
		if(obj == null || getClass() != obj.getClass()) return false;//anderer Typ
		Person ander = (Person) obj;
		return this.gebJahr == ander.gebJahr && this.name.equals(ander.name);
	}
	
}
