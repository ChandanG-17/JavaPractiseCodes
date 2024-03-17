package Exception;

public class Sample1 {
	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4};
		try {
		for(int i=0;i<=5;i++)
		{
			System.out.println(arr[i]);
			
		}
		}
		
		catch(ArrayIndexOutOfBoundsException a)
		{
			a.printStackTrace();
		}
		finally{
			System.out.println("hello");
		}
		
		
		
		
		
		
		
	}

}
