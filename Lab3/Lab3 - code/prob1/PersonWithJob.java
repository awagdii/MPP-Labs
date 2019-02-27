public class PersonWithJob implements PersonName {
	
	private Person person;
	private double salary;
	
	public double getSalary() {
		return salary;
	}
	
	@Override
	public String getName() {
		return person.getName();
	}
	
	PersonWithJob(String n, double s) {
		person = new Person(n);
		salary = s;
	}
	
	@Override
	public boolean equals(Object aPerson) {
		if (aPerson == null) return false;
		if (!(aPerson instanceof PersonName)) return false;
		PersonName p = (PersonName)aPerson;
		return this.getName().equals(p.getName());
	}
	
	public static void main(String[] args) {
		PersonWithJob p1 = new PersonWithJob("Joe", 30000);
		Person p2 = new Person("Joe");
		//As PersonsWithJobs, p1 should be equal to p2
		System.out.println("p1.equals(p2)? " + p1.equals(p2));
		System.out.println("p2.equals(p1)? " + p2.equals(p1));
	}


}
