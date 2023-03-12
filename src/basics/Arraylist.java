package basics;

import java.util.ArrayList;

public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array = {1,2,3,4,5,6,7,8,9,11,22,122};
		//writing a logic for even num 
		for (int i =0; i<array.length;i++)
		{
			if (array[i] % 2 == 0)
			{
				System.out.println(array[i]);
				break;
				
				
			}else {
				System.out.println(array[i]+"these numbers are noy multiple of 2");
			}
			ArrayList<String> a = new ArrayList<String>();
			//this array list stores only string values 
			a.add("Muttu");
			a.add("automation");
			a.add("qwerty");
			a.remove(1);
			System.out.println(a.get(1));
			
			//Create object of the class - object.method
		}
		
		
		
	}
		
	
	}


