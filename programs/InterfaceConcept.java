package selva;
interface B1
{
	int pid = 1001;
	void get1();
}
interface B2 extends B1
{
	String pname ="apple";
	void get2();
}
class D  implements B2
{
	public void get1() {
		System.out.println("this is Product Id:"+pid);
	}
	public void get2()
	{
		System.out.println("this is product name:" +pname);
	}
	public void get3()
	{
		System.out.println("this is  Normal ");
	}
}
public class InterfaceConcept {

	public static void main(String[] args) {
		
		D s1 =new D();
		s1.get1();
		s1.get2();
		s1.get3();

	}

}
