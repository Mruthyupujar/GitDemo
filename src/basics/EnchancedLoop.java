package basics;

public class EnchancedLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			// conditions apply on for loop
//working with if/else condition
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
		}
	}

}
