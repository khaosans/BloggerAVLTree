/**Souriya Khaosanga
 * cs202 HW5
 * Slopes.java
 */


//Slopes is the child of info
public class Slopes extends Info {
	
	//data members exist below
	private String condition;
	private String besthotel;
	private boolean open;
	
	
	//constructor
	public Slopes(){
		super("Ski information");
		condition = "";
		besthotel = "";
		open = true;
	}
	
	//constructor with arguments
	public Slopes(String cond, String hotel, boolean is_open){
		
		super("Ski information");
		condition = cond;
		besthotel = hotel;
		open = is_open;
		
	}
	
	//add function is similiar to constructor with arguments
	public int add(String cond, String hotel, boolean is_open){
		
		condition = cond;
		besthotel = hotel;
		open = is_open;
		return 2;
		
	}

	//function is not used, but for dynamic binding
	@Override
	int add(String cruise_add, String advice_add) {
		// TODO Auto-generated method stub
		return 2;
	}
	
	//function is not used, but for dynamic binding
	@Override
	int add(boolean highsurf, boolean foggy, String eat) {
		// TODO Auto-generated method stub
		return 2;
	}

	//function is used to display Slopes members
	@Override
	void print() {
		// TODO Auto-generated method stub
		//Pint out each member
		System.out.println(type);
		System.out.println("Hotel: " + besthotel);
		System.out.println("Road is open: " + open);
		System.out.println("Condition: " + condition+"\n");
		
	}


}
