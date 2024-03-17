package LangPackage;

public class Sample {
	int mark;
	int roll;
	String name;
	Sample(int roll, String name)
	{
		this.roll= roll;
		this.name= name;
	}
	public String toString()
	{
		return "Name: "+name+"roll: "+roll; 
	}
	public boolean equals(Object obj) // to compare content
	{
		Sample s = (Sample)obj;   // downcasting 
		return this.name==s.name && this.roll==s.roll; // checking
	}
	public static void main(String[] args) {
		Sample s1 = new Sample(21,"Krishna");
		Sample s2 = new Sample(22, "Balaram");
		Sample s3 = new Sample(21, "Krishna");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1.equals(s3));// true as s1 is same as s3
		System.out.println(s1.equals(s2)); // false as s1 and s3 content is different
		
	}

}
