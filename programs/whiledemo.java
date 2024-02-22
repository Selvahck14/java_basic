package selva;
import java.util.Scanner;


public class whiledemo {
	int n;
	Scanner sc= new Scanner(System.in);
	
	void Reverse()
	{
		System.out.println("Enter n value");
		n = sc.nextInt();
		int rev=0;
		
		while(n!=0)
		{
			rev= rev*10;
			rev = rev + n%10;
			n=n/10;
			System.out.println("N value is :"+n);
		}
		System.out.println("Reversed value is:"+rev);
	}
	void get2()
	{
		int  rem ,s=0;
		System.out.println("Enter n value:");
		n=sc.nextInt();
		while (n>0)
		{
			rem=n%10;
			s = s+rem*rem*rem;
			n=n/10;
			System.out.println(" value is:"+s);
			
		}
		if (n==s)
		{
			System.out.println(" Armstron value is:"+n);

		}
		else
		{
			System.out.println("Its not Armstrong"+n );
		}
	}
	void get3() {
		
		int i ,rem,sum=0;
		System.out.println("Enter i value:");
		i=sc.nextInt();
		while(i!=0)
		{
			rem=i % 10;
			sum=sum+rem;
			i=i/10;
			System.out.println("Remainder is "+i);

		}
		System.out.println("sum of "+sum);

	}

	public static void main(String[] args) {
		
		whiledemo s1 = new whiledemo();
		//s1.Reverse();
		s1.get2();
		//s1.get3();

	}

}
