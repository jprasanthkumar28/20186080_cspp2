public class Student {
	
	public Student() {

	}

	public static void main(String[] args) {

		StudentDetails prashu = new StudentDetails("Prashu", "13BQ1A0561", 8.9, 8.0, 9.0);
		System.out.println(prashu.calci());
		StudentDetails krish = new StudentDetails("krish", "13BQ1A0567", 7.9, 8.0, 9.8);
		System.out.println(krish.calci());
		StudentDetails vijay = new StudentDetails("Vijay", "13BQ1A0555", 7.9, 7.0, 9.0);
		System.out.println(vijay.calci());

	}
}
class StudentDetails {

	private String name;
	private String rollnumber;
	private double m1;
	private double m2;
	private double m3;

	public StudentDetails(String name, String rollnumber, double m1, double m2, double m3) {
		this.name = name;
		this.rollnumber = rollnumber;
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
	}

	public double calci() {
		return Math.round((m1 + m2 + m3)) / 3;
	}
}
