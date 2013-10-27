/**Souriya Khaosanga
 * cs202 HW5
 * Info.java
 */

//this is the abstract base class
//the children are Slopes, Seaside and cruise
abstract class Info {
	
	//private data members exist below here
	protected String type;
	
	//constructor
	public Info(String to_add){
		type = to_add;
		
	}

	//these functions are overloaded depending on which arguments are placed
	//in the function
	abstract int add(String cruise_add, String advice_add);
	//adding for a cruise
	abstract int add(boolean highsurf, boolean foggy, String eat);
	//adding for seaside
	abstract int add(String cond, String hotel, boolean is_open);
	//adding for skiing
	abstract void print();
	
}
