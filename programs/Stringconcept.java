package selva;

public class Stringconcept {

	public static void main(String[] args) {
		  
		String s1= "welcome";
		String s2 = new String("welcome");
		
		
		System.out.println("S1 value :"+s1);
		System.out.println("S2 value: " +s2);
		System.out.println("S1 length is:" +s1.length());
		System.out.println("S1 value CharAt:" +s1.charAt(2));
		System.out.println("Equal of concept:");
		if (s1.equals("welcome")&&s2.equals("welcome"))
		{
			System.out.println("Login success....");
		}
		else {
			System.out.println("Login fail....");
		}
		
		System.out.println("CompareTo:"+s2.compareTo(s1));
		System.out.println("StartsWith" +s1.startsWith("w"));
		System.out.println("Endswith"+s1.endsWith("e"));
		System.out.println("Indexof"+s1.indexOf("c"));
		System.out.println("LastIndexof"+s1.lastIndexOf("o"));
		System.out.println("String concat:" +s1.concat(s2));
		System.out.println("To uppercase:" +s1.toUpperCase());
		System.out.println("String Trim:"+s1.trim());
		System.out.println("valueof:"+s1.valueOf(s2));

	}

}
