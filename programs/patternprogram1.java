package selva;
import java.util.Scanner;

class pattern1
{
	void get1()
	{
		int i,j,n;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter n value:");
		n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			for(j=1;j<i;j++)
			{
				System.out.print(" ");
		
			}
			for(j=1;j<n;j++)
			{
				if(j==i || j==n || i==1) {
					
					
				System.out.print("*");
			}
				else
				{
					System.out.println(" ");
				}
		
			}
			System.out.println();
		}
		
		
	}
}
public class patternprogram1 {

	public static void main(String[] args) {
		
		pattern1 f1= new pattern1();
		f1.get1();

	}

}
