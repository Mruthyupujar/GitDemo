package basics;


public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			// for loops
		int[] arr = new int[7]; //size for memory allocation 
		arr [0]= 1;
		arr [1]= 2;
		arr [2]= 3;
		arr [3]= 4;
		arr [4]= 5;
		int [] array = {1,2,3,4,5,6,7};
		//for lop arraykength = 5
		for (int i = 0; i< arr.length; i++) {
			//arr[5]
			System.out.println(arr[i]);
		}
		for(int i=1; i> array.length; i++) {
			System.out.println(array[i]);
		}
		//string variable declared by array
		String [] name = {"Muttu", "Mruthyunjay", "automation"};
		for (int i =0; i <name.length; i++) {
			System.out.println(name[2]); 
		}
		//enchanced array for loop
		for (String s:name) {
			System.out.println(s);
		}
	
	for (int  M :array) {
		System.out.println(M);
	}
	}
	

}
