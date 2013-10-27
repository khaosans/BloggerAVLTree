/**Souriya Khaosanga
 * cs202 HW5
 * Cruise.java
 */

//Class is the cruise class that is the child of info
public class Cruise extends Info{
	
	//data members exist are below
	private String cruise;
	private String advice;
	
	
	//constructor
	public Cruise() {
		// TODO Auto-generated constructor stub
		super("Cruise Information");
		cruise = "";
		advice = "";
		
	}
	
	//constructor with arguments
	public Cruise(String cruise_add, String advice_add){
		// TODO Auto-generated method stub
		super("Cruise Information");
		cruise = cruise_add;
		advice = advice_add;
	}

	
	//dynamic binding function is the same as constructor with arguments
	@Override
	int add(String cruise_add, String advice_add){
		// TODO Auto-generated method stub
		cruise = cruise_add;
		advice = advice_add;
		return 0;
	}
	
	//function is not used, but for dynamic binding
	@Override
	int add(boolean highsurf, boolean foggy, String eat) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	//function is not used, but for dynamic binding
	@Override
	int add(String cond, String hotel, boolean is_open) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	//function is used to print out the cruise data members
	@Override
	void print() {
		// TODO Auto-generated method stub
		System.out.println(type);
		System.out.println("Cruise: " + cruise);
		System.out.println("Advice: " + advice+"\n");
		
	}



	
	
	


}
