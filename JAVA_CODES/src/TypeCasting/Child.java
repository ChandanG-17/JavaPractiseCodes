package TypeCasting;

public class Child extends Parent {
	int Balance=34;
	int ChildAcc;
	public String  setAcc(int Acc)
	{
		this.ChildAcc = Acc;
		return " child Successfully set";
		
	}

	public int getAcc()
	{
		return ChildAcc;
	}
	public static void main(String[] args) {
		
	}

}



