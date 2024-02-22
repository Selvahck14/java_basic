
package selva;
import java.util.Scanner;

public class Demo4 {
	int i,j,n,m;
	Scanner sc =new Scanner(System.in);
	void forloop()
	{
		System.out.println("Enter the n value:");
		n=sc.nextInt();
		
		for(i=0;i<=n;i++)
		{
			if(i%2==0)
			{
				System.out.println("Even is:"+i);
			
			}
			else
			{
				System.out.println("Odd is:"+i);
			}
		}
	}
	void forcalc()
	
	{
		System.out.println("Enter n value:");
		n=sc.nextInt();
		
		int sum=0,multi=1;
		
		for(i=0;i<=n;i++)
		{
			if(i%2==0)
			{
				sum=sum+i;
				System.out.println("value:"+sum);
			
			}
			else
			{
				multi=multi*i;
				System.out.println("Odd value:"+multi);
			}
		}
	}
	void nestested()
	{
		int i,j,n;
		System.out.println("Enter n value:");
		n=sc.nextInt();
	
		
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				System.out.println("I value is:"+i+"  J value is:"+j);
				
			}
		}
	}
	void factorialfn()
	{
		int i,n,fact=1;
		System.out.println("Enetr n value:");
		n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			fact=fact*i;

		}
	
		 System.out.println("Factorial value:"+fact);

	}	
	void forloopod() {
		int i,n,sum=0,multi=1;
		System.out.println("Ente n value:");
		n=sc.nextInt();
		for(i=0;i<=n;i++)
		{
			if(i%2==0) {
				System.out.println();
			}
		}
	}

	

	public static void main(String[] args) {
		
		Demo4 f1=new Demo4();
		f1.forloop();
		f1.forcalc();
		f1.nestested();
		f1.factorialfn();
	
	}

}
