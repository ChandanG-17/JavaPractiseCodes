package LangPackage;

public class Student {
	int roll;
	String name;
	String city;
	
	
	Student(int roll, String name, String city)
	{
		this.roll= roll;
		this.name= name;
		this.city=city;
	}
	public String toString()  // used to define user defined string values 
	{
		return roll+" "+name+" "+city;
	}
	
	public static void main(String[] args) {
		Student s1 = new Student(12,"Naveen","Banglore");
		Student s2 = new Student(15,"Vinay", "Manglore");
		System.out.println(s1);
		System.out.println(s2);
	}
	{
		
	}

}
