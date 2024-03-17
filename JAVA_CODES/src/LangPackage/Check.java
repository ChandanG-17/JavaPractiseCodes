package LangPackage;

public class Check {
	int age;
	Check(int age)
	{
		this.age=age;
	}
	public boolean equals(Object o) // checks the actual content in the object  | object O = new Check();  
	{
		Check c = (Check)o;
		return this.age==c.age;
	}
	public static void main(String[] args) {
		Check c1 = new Check(22);
		Check c2 = new Check(22);
		System.out.println(c1.equals(c2));
		
	}

}
