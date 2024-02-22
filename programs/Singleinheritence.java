package selva;

class B
{
	int empid=1001;
	void get1() 
	{
		System.out.println("this is base class");
	}
	
}
class D1 extends B 
{
	void get2() {
		System.out.println("this is dervied class" +empid);
	}
}

public class Singleinheritence {

	public static void main(String[] args) {
		
		D1 f1 = new D1();
		f1.get1();
		f1.get2();

	}

}
