public class Person implements PersonName {

	private String name;
	Person(String n) {
		name = n;
	}
	
	@Override
	public String getName() {
		return name;
	}
	
	@Override
	public boolean equals(Object aPerson) {
		if(aPerson == null) return false; 
		if (!(aPerson instanceof PersonName)) return false;
		PersonName p = (PersonName)aPerson;
		return this.name.equals(p.getName());
	}
	
	public static void main(String[] args) {
		
	}

}
