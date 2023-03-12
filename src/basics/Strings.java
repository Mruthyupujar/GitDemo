package basics;

public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// STrings is an object  // String literal
		String s = "Autonmation";
		String s1 = "Manual";
		
		//another way to create String  by using new  for creating memory allocated 
		
		String s2 = new String("Qwerty");
		String s3 = new String("CONVO");
		String s5 = "Get ready to fight";
		//SPlit method in java 
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s);
		System.out.println(s1);
		String [] splittedString = s5.split(" ");
		System.out.println(splittedString[0]);
		System.out.println(splittedString[1]);
		System.out.println(splittedString[1].trim());
		for (int i = 0; i<s5.length(); i++) //splitting all chars each line 
		{
			System.out.println(s5.charAt(i));
		} 
		//reverse order
		for (int i=s5.length()-1;i>=0 ;i--) {
			System.out.println(s5.charAt(i));
			
		}
		
	}

}
