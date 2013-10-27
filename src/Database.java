/**Souriya Khaosanga
 * cs202 HW5
 * Database.java
 */


/*
 * this is the database class which is used to manage
 * the overlying database of users and avl trees
 */
public class Database {

	//create an array of users
	protected User[] a_user;

	//constructor
	public Database() {
		// TODO Auto-generated constructor stub
		a_user = new User[100];

		for (int i = 0; i < 100; ++i) {
			a_user[i] = null;
		}

	}

	//adds a user to the database
	public Database(User to_add, int id) {

		a_user[id] = new User();
		a_user[id].name = to_add.name;
		a_user[id].password = to_add.password;

	}

	//add user to the database
	public void addUser(User to_add, int id) {

		a_user[id] = new User();
		a_user[id].name = to_add.name;
		a_user[id].password = to_add.password;

	}

	//add a user to the database but without any id
	public int addUser2(User to_add) {
		for (int i = 0; i < a_user.length; ++i) {
			if (a_user[i] == null) {
				a_user[i] = new User();
				a_user[i].name = to_add.name;
				a_user[i].password = to_add.password;
				return i;
			}

		}
		System.out.println("Full of users");
		return 101;
	}

	//search for a user using the string
	public int findUser(String to_find) {

		for (int i = 0; i < a_user.length; ++i) {
			if (a_user[i] == null) {
				System.out.println("User name: " + to_find + " does not exist!"
						+ "\n\n");
				return 1000;
			}

			if (a_user[i].name == to_find) {
				return i;
			}

		}
		return 1000;

	}

	//display the user based on the id
	public void displayUser(int id) {
		if (id > 100) {
			System.out.println("User does not exist" + "\n\n");
			return;
		}
		a_user[id].displayInfo();
	}

	//display the user tree based on the id
	public void displayUserTree(int id) {
		if (id > a_user.length) {
			return;
		} else
			a_user[id].displayUserBlog();
	}

	//add blog entries through user ID and user password
	public void addRant(Info to_add, int id, String pass) {
		if (id > a_user.length) {
			return;
		} else if (a_user[id].password != pass) {
			System.out.println("Password incorrect" + "\n\n");
			return;
		} else
			a_user[id].addInfo(to_add);

	}
	
	//display the list of users
	public void listUsers(){
		for(int i = 0; i<a_user.length;++i)
		{
			if(a_user[i] == null)
				return;
			else
				System.out.println(a_user[i].name + " ");
		}
	}

	//display the number of users
	public int numUsers() {
		int i = 0;

		for ( i = 0; i < a_user.length; ++i) {
			if (a_user[i] == null) {
				System.out.println("Current number of users on system: "+i);
			
				return i;
			}


		}

		return i;

	}
	
	//function counts the number of entries on the entire system
	public int numEntries(){
		int i  = 0;
		int numEntry =0;
		for ( i = 0; i < a_user.length; ++i) {
			if (a_user[i] != null) {
				
				numEntry += a_user[i].entries;
			}


		}
		System.out.println("Number of entries on system: "+numEntry);
		return numEntry;
	}
}