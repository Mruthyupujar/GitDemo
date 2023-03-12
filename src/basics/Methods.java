package basics;

public class Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Methods m = new Methods ();
		String name = m.getData();
		System.out.println(name);
		Methods2 s = new Methods2 ();
		s.getUserData();
		getData2();
		
		
		
		
		
	}
		public String getData()
		{
			System.out.println("calling get data method");
			return  "Automation Scripts";
			
		}
		//static data 
		public static String getData2() {
			System.out.println("static data appeARS");
			return "Static method appears";
			
		}
		
}
