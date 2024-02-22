package selva;
enum Employee
{
	mohamed(31),azar(15),raja(24);
	private  int age;
	Employee(int p)
	{
		age = p;
		
	}
	int getAge()
	{
		return age;
	}
}

public class enumconcept {

	public static void main(String[] args) {
		
		
		Employee p= Employee.mohamed;
		System.out.println(p.getAge());
	}

}
