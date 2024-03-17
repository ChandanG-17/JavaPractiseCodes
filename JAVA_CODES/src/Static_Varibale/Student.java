package Static_Varibale;



//Static variable

//The static variable can be used to refer to the common property of all 
//objects (which is not unique for each object), for example, the company name of employees,
//college name of students, etc.

//Advantages of static variable:
//It makes your program memory efficient (i.e., it saves memory).
public class Student {
	int roll;
	String name;
	String college;
	public Student(int roll, String name, String college) {
	
		this.roll = roll;
		this.name = name;
		this.college = college;
	}
	public void display() {
		System.out.println(roll+" "+name+" "+college);
	}
	public static void main(String[] args) {
		Student s1 = new Student(123,"ABC","AMC");
		Student s2 = new Student(345,"XYX","AMC");
		//Since the college name is same for every student , we can make the college name as Static
		s1.display();
		s2.display();
	}

}
