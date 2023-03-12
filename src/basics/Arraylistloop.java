package basics;

import java.util.ArrayList;

public class Arraylistloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a = new ArrayList<String>();
		//this array list stores only string values 
		a.add("Muttu");
		a.add("automation");
		a.add("qwerty");
		a.remove(1);
		System.out.println(a.get(1));
		for(int i =0; i<a.size();i++) {
			System.out.println(a.get(i));
		}
		System.out.println("************");
		for (String val :a) {
			System.out.println(val);
		}//item present in arraylist
		System.out.println(a.contains("qwerty"));
		//String[] name= {"House", "laptop","mouse"};
		//List<String> nameArrayList= Arrays.asList (name);
		
		
		
	}
	
	
	

}
