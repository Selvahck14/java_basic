package selva;
import java.util.Scanner;

class Demo1{
	
		int i,j,n,m;
		Scanner sc = new Scanner(System.in);
		int Empid[][] = new int[2][2];
		int empid[] = new int[3];
		void get1() 
		{
			System.out.println("Enter n and m values:");
			n=sc.nextInt();
			m=sc.nextInt();
			
		}
		void get2()
		{
			for(i=0;i<n;i++)
			{
				for(j=0;j<m;j++)
				{
					System.out.println("Enter array value:");
					Empid[i][j]=sc.nextInt();
				}
			}
		}
		void get3()
		{
			for(i=0;i<n;i++)
			{
				for(j=0;j<m;j++)
				{
					System.out.println("Your value is :"+Empid[i][j]);
					
				}
			}
		}
		void arrrev()
		{
			System.out.println("Enter n value:");
			
			n=sc.nextInt();
			for(i=0;i<n;i++)
			{
				System.out.println("enter array value:");
				empid[i]=sc.nextInt();
				
			}
			
			
		}
		void get4() {
			
			for(i=0;i<n;i++)
			{
				System.out.println("your value is:"+empid[i]);
			}
		}

}

public class Arrayp2 {

	public static void main(String[] args) {
		
		Demo1 s1 = new Demo1();
		//s1.get1();
		//s1.get2();
		//s1.get3();
		s1.arrrev();

		
	}

}
