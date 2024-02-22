package selva;

class B3
{
	int pid=1001;
	void get1()
	{
		System.out.println("this is base class");
	}
}
class F extends B3
{
	String pname = "Apple";
	void get2()
	{
		System.out.println("product Id:"+pid);
	}
}
class D4 extends F
{
	int pamt = 1000;
	void get3()
	{
		System.out.println("product name:"+pname);
	}
}
class D3 extends D4
{
	void get4() {
		System.out.println("product amt"+pamt);
	}
}

public class hierarchicalInheritance {

	public static void main(String[] args) {
		
		D3 s1 = new D3();
		s1.get1();
		s1.get2();
		s1.get3();
		s1.get4();

	}

}
