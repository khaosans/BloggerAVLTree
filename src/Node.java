/**Souriya Khaosanga
 * cs202 HW5
 * Node.java
 */


//This is the node class used for each node in the avl tree
public class Node {

	/*
	 * Data members of the data exist below this section
	 */
	protected int data; // index of the node
	protected Node left; // left side
	protected Node right; // Right side
	protected int height; // Height of the node 
	protected Info review;

	/*
	 * Constructor of the node
	 */
	public Node(int index) 
	{
		this(index, null, null);//sets the index of the node and it's children to null
	}
	
	/*
	 * Constructor with arguments
	 */
	public Node(int index, Node lt, Node rt) {
		
		data = index;
		left = lt;
		right = rt;
		height = 0;
		review = null;
	}
	

	//function returns the index of the node
	public int Data()
	{
		return data;//returns the index
	}
	
	
	/*
	 * Function is used to add information regarding the ski items
	 * Condition of the snow resort, what is the best hotel and if the
	 * road to the resort is open
	 */
	public void addSki(String condition, String hotel, boolean open)
	{
		
		review = new Slopes();
		review.add(condition, hotel, open);
		
	}
	
	/*
	 * Function is used to add coast information regarding the fog
	 * if there is a high surf warning and where the best place to
	 * eat is.
	 * 
	 */
	public void addCoast(boolean highsurf, boolean foggy, String eat)
	{
		review = new Seaside();
		review.add(highsurf, foggy, eat);
		
	}
	
	/*
	 * Function is used to add a cruise information.  The first argument
	 * is the cruise name and second is the advice that is given.
	 */
	public void addCruise(String cruise, String advice)
	{
		review = new Cruise();
		review.add(cruise, advice);
		
	}
	
	
	

}
