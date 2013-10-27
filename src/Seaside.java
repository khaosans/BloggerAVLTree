/**Souriya Khaosanga
 * cs202 HW5
 * Seaside.java
 */

//Class is seaside that is a child of info
public class Seaside extends Info {
	
	//data members exist below this 
	private String restaurant;
	private boolean fog;
	private boolean surf;
	
	//constructor
	public Seaside(){
		
		super("Coast information");
		restaurant = "";
		fog = false;
		surf = false;
	}
	
	//overloaded constructor
	public Seaside(boolean highsurf,boolean foggy,String eat){
		
		super("Coast information");
		restaurant = eat;
		fog = foggy;
		surf = highsurf;
		
	}
	
	//function is used to add information seaside
	@Override
	int add(boolean highsurf, boolean foggy, String eat){
		
		restaurant = eat;
		fog = foggy;
		surf = highsurf;
		return 1;
	}
	
	//function is not used, but for dynamic binding
	@Override
	int add(String cruise_add, String advice_add) {
		// TODO Auto-generated method stub
		return 1;
	}
	
	//function is not used, but for dynamic binding
	@Override
	int add(String cond, String hotel, boolean is_open) {
		// TODO Auto-generated method stub
		return 1;
	}
	
	//function is used to display the seaside data members
	@Override
	void print() {
		// TODO Auto-generated method stub
		System.out.println(type);
		System.out.println("Restaurant: " + restaurant);
		System.out.println("Fog Warning in effect: " + fog);
		System.out.println("HighSurf Warning in effect: " + surf +"\n");
	}




}
