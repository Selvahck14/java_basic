package selva;
import java.util.Scanner;

public class hollowpattern1 {

	public static void main(String[] args) {
		 
		int i,j,n;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter n value:");
		n=sc.nextInt();
		for(i=1;i<=n;i++)
	{
			for(j=1;j<=n;j++)
				{
					System.out.print(" * ");
				}
			System.out.println(" ");
		}
		


	}

}
