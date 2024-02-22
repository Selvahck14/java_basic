package selva;
import java.util.Scanner;

class Arr1
{
	void get1()
	{
		int i,j;
		Scanner sc = new Scanner(System.in);
		int empid[][] = new int[2][2];
		for(i=0;i<=5;i++)
		{
			for(j=0;j<=10;j++)
			{
				System.out.println("Enter array:");
				empid[i][j]=sc.nextInt();
				
			}
			System.out.println(""+i+""+j);
		}
	}
	
}

public class Arrayp3 {

	public static void main(String[] args) {
		
		Arr1 s1 =new Arr1();
		s1.get1();
		

	}

}
