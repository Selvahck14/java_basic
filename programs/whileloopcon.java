 package selva;
 import java.util.Scanner;
 

public class whileloopcon {
	int i,n;
	Scanner sc= new Scanner(System.in);
	void get1() 
	{
		System.out.println("Enter n value:");
		n= sc.nextInt();
		
	}
	void get2()
	{
		int i=0;
		while(i<=n) {
			System.out.println("I value is:"+i);
			i++;
		}
	}
	void get3() {
		int n,rem;
		
		int s=0;
		System.out.println("Enter n value:");
		n=sc.nextInt();
		
		
		
		while(n<0)
		{
			
			rem = n % 10;
			s = s + rem*rem*rem;
			n = n / 10;
		}
		if (n == s)
		{
			System.out.println("Armstrong value is" +n);

		}
		else 
		{
			System.out.println("Its not Armstrong:"  +n);

		}
		
	}
	void get4()
	{
		int a=10,b=20;
		
		a=a+b;
		b=b-a;
		a=a-b;
		
		System.out.println("a is"+a+"b is "+b);
	}
	void swap1() {
		 int a,b ,i;
		 System.out.println("enter input value a & b :");
		 a=sc.nextInt();
		 b=sc.nextInt();
		 i=a;
		 a=b;
		 b=i;
		 System.out.println("a value is :  " +a+  "  b value is :  "+b );
	}
	void fibo()
	{
		 int n, first=0,second=1,next,c;
		 System.out.println("Enter n value:");
		 n=sc.nextInt();
		 for(c=0;c<=n;c++)
		 {
			 if(c<=1)
			 {
				 next=c;
			 }
			 else 
			 {
				next=first+second;
				first=second;
				second = next;
			 }
			 System.out.println(next);
		 }
	}

	public static void main(String[] args) {
		
		whileloopcon f1 =new whileloopcon();
		//f1.get1();
		//f1.get2();
		//f1.get3();
		//f1.get4();
		//f1.swap1();
		f1.fibo();

	}

}
