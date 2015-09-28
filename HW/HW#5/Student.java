public class Student {
	public String firstName;
	public String lastName;
	public int osis;
	public int age;
	public double gpa;
	
	
	public Student(String first, String last, int ID, int years) {
		firstName = first;
		lastName = last;
		osis = ID;
		age = years;
	}
	
	void printStudent() {
		System.out.println(this.firstName);
		System.out.println(this.lastName);
		System.out.println(this.osis);
		System.out.println(this.age);
		System.out.println(this.gpa);
	}
	
	void lowerGPA(int points) {
		this.gpa -= points;
	}
	
	void raiseGPA(int points) {
		this.gpa += points;
	}
}