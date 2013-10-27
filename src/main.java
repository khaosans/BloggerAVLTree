/**
 * @author Souriya Khaosanga
 * main.java
 * CS202 HW5
 */

import java.io.*;
import java.util.Scanner;


//This is the main body of the program
public class main {

	/**
	 * @param args
	 */
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		//create the scanner input
		Scanner input=null;
		input = new Scanner(System.in);
		
		//create a new tree
		Tree aTree = new Tree();
		int a = 0;
		
		
		//Display intro to program
		System.out.println("----Program begins below----"+"\n\n");
		
		//create users to add to the system with a created password
		User Jimmy = new User("Jimmy Mak", "pass");
		User John = new User("John","pass");
		User Rick = new User("Rick Roll","pass");
		User RickyRoss = new User("Ricky Ross","pass");
		User VanilaIce = new User("Vanilla Ice", "pass");
		User Micky = new User("Micky Mouse","pass");
		
		//create a new database
		Database a_data = new Database();
		
		//add users to that database
		a_data.addUser2(Jimmy);
		a_data.addUser2(John);
		a_data.addUser2(Rick);
		a_data.addUser2(RickyRoss);
		a_data.addUser2(VanilaIce);
		a_data.addUser2(Micky);
		
		//test for non existent user
		System.out.println("------Test for non existent user--------");
		int test = a_data.findUser("non existent");
		
		
		

		
		 
		//Create the Seaside , cruise or Slopes information that 
		//will be inserted into the tree
		//Objects are created here which are dynamically created depending
		//on the input parameters
		Info obj1 = new Seaside(true, true, "Mcdonalds");
		
		Info obj2 = new Cruise("Cruise2","Lots of old people playing shuffleboard ");
		
		Info obj3 = new Slopes("Great Snow","Timberline",true);
		
		Info obj4 = new Seaside(true, false, "Dairy queen");
		
		Info obj5 = new Cruise("Cruise2","Fun cruise");
		
		Info obj6 = new Slopes("Spring snow", "Meadows", true);
		
		Info obj7 = new Cruise("Carnival", "Super fun cruise");
		
		
		//find user and store that into user number
		int user1 = a_data.findUser("John");
		
		//test for input into the tree
		System.out.println("----------Test for failing password----------");
		a_data.addRant(obj1, user1,"fail");
		a_data.addRant(obj2, user1,"pass");
		a_data.addRant(obj3, user1,"pass");
		
		
		//enter information for the user2
		int user2 = a_data.findUser("Rick Roll");
		a_data.addRant(obj4, user2, "pass");
		a_data.addRant(obj5, user2, "pass");
		a_data.addRant(obj6, user2, "pass");
		
		//enter information for user3
		int user3 = a_data.findUser("Jimmy Mak");
		a_data.addRant(obj7, user3, "pass");
		a_data.addRant(obj5, user3, "pass");
		
		//enter information for user4
		int user4 = a_data.findUser("Ricky Ross");
		a_data.addRant(obj5, user4, "pass");

		
		//function call displays all nodes of the tree and 
		a_data.displayUser(user1);
		a_data.displayUserTree(user1);
		
		//display the user2 data and blog
		a_data.displayUser(user2);
		a_data.displayUserTree(user2);
		
		//display user 3 info and blog
		a_data.displayUser(user3);
		a_data.displayUserTree(user3);
		
		//display user 4 info and blog
		a_data.displayUser(user4);
		a_data.displayUserTree(user4);
		
		//display overall state of current database system
		a_data.numUsers();
		a_data.listUsers();
		a_data.numEntries();
		
		
		
	}

	

}
