package selva;

enum empname{mohamed,azar,raja};


public class enum1 {

	public static void main(String[] args) {
		
		for(empname e1 : empname.values()) 
		{
			
			System.out.println("your employee:"+e1);
			
		}

	}

}
