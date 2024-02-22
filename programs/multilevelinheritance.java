package selva;

class C
{
	int empid=1001;
	void get1()
	{
		System.out.println("this ios base class");
	}
}
class E1 extends C
{
	String empname="selva";
	void get2()
	{
		System.out.println("this Emp Id:"+empid);
	}
	
}
class D2 extends E1
{
	void get3()
	{
		System.out.println("this our Emp Name:"+empname);
}
}

public class multilevelinheritance {

	public static void main(String[] args) {
		
		D2 s1 = new D2();
		s1.get1();
		s1.get2();
		s1.get3();
	}

}
