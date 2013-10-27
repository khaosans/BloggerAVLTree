/**Souriya Khaosanga
 * cs202 HW5
 * User.java
 */


/*
 * The purpose of this class is to control the u
 * user and store password and a user tree
 */
public class User {
	
	//data members exist below
	protected int entries;
	protected String name;
	protected String password;
	protected Tree userTree;

	//constructor
	public User() {
		// TODO Auto-generated constructor stub
		name = "";
		password = "";
		userTree = new Tree();
		entries = 0;
	}
	
	//construtor with arguments
	public User(String to_name, String aPassword)
	{
		name = to_name;
		password = aPassword;
	}

	//function used to add a tree
	public void addTree(Tree to_add)
	{
		userTree = to_add;
	}
	
	//function used to create users
	public void addUser(String to_name, String aPassword)
	{
		name = to_name;
		password = aPassword;
		
	}
	
	//function used to add entries
	public void addInfo(Info to_add)
	{
		userTree.insert(to_add,entries);
		++entries;
	}
	
	//function used to display the user information
	public void displayInfo()
	{
		System.out.println(name+" "+password);
	}
	
	//function used to display the user tree
	public void displayUserBlog()
	{
		userTree.printTree();
	}
}
