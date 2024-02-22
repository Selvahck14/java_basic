package selva;
import java.util.Scanner;

class Demo{ 
	
	int i,n;
	int empId[] = new int[5];
	Scanner sc= new Scanner(System.in);
	void get1() 
	{
		System.out.println("Enter n value is::");
		n=sc.nextInt();
		
		
	}
	void get2()
	{
		for(i=0;i<=n;i++)
		{
			System.out.println("Enter Employee:");
			empId[i] = sc.nextInt();		
		}
	}
	void get3()
	{
		for (i=0;i<=n;i++)
		{
			System.out.println("Your value is:"+empId[i]);
		}
	}
	
	
}
public class Arrayp1 {

	public static void main(String[] args) {
		
		Demo s1 =new Demo();
		s1.get1();
		s1.get2();
		s1.get3();

	}

}
