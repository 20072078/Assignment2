package controllers;
import java.util.Scanner;

import app.models.Movie;
import app.models.User;


public class Main 
{
	private Scanner input;
	private Recommender rec;
	
	public static void main(String [] args)
	{
		new Main();
	}
	
	public Main()
	{	
		input = new Scanner(System.in);
		rec = new MovieRecommender();
		run();
	}
	
	/**
	 * The Menu which allows the User to navigate through the program
	 */
	private int mainMenu()
	{
		int command = -1;
		System.out.println("\n\nWelcome, Choose Option:");
		System.out.println("1. Show all users");
		System.out.println("2. Add User");
		System.out.println("3. Remove User");
		System.out.println("4. Movie list");
		System.out.println("5. Recommended list");
		System.out.println("0. Quit");
		try{
			command = input.nextInt();
		}
		catch (Exception e) // In case of invalid input
		{
			command = -1;
		}
		return command;
	
	}
	
	/**
	 * This method is used for the menu to input the correct number which will then choose the method to deploy from the list
	 */
	
	private void run()
	{
		int choice = mainMenu();
		while(choice != 0)
		{
			switch(choice)
			{
			case 1:
				showAllUsers();
			break;
			case 2:
				addUser();
			break;
			case 3:
				removeUser();
			break;
			case 4:
				listMovies();
			break;
			case 5:
				//listRecommended();
			break;
			default:
				System.out.println("Invalid Command");
			break;
			}
			
			input.nextLine(); //Scanner buffer bug fix
			choice = mainMenu();
		}
		
		System.out.println("Quiting...");
	}
	
	/**
	 * Shows all users on list
	 */
	
	private void showAllUsers() 
	{
		for(User user : rec.getUsers())
			System.out.println(user);
		
	}
	
	/**
	 * Allows a user to be added to the list
	 */
	
	private void addUser()
	{
		input.nextLine(); //Scanner bug fix
		String firstName;
		String lastName;
		int age;
		String gender;
		String occupation;
		
		System.out.print("First Name: ");
		firstName = input.next();
		System.out.print("Last Name: ");
		lastName = input.next();
		System.out.print("Age: ");
		age = input.nextInt();
		System.out.print("Gender('M' for Male, 'F' for Female: ");
		gender = input.next();
		System.out.print("Occupation: ");
		occupation = input.next();
		
		rec.addUser(firstName, lastName, age, gender, occupation);
	}
	
	/**
	 * This method allows a user to be removed by creating a Array List of the names of the users and selecting a user by number and removing them.
	 */
	
	private void removeUser()
	{
		int userIndex = 0;
		boolean pass = true;
		
		//boolean validate = true;
		
		if (rec.getUsers().size() != 0)
		{
			for (int i=0;i<rec.getUsers().size();i++)
			{
				System.out.println(i + ": "+ ((User) rec.getUsers().get(i)).getFirstName()+" "+((User) rec.getUsers().get(i)).getLastName());
			}
			do
			{
				System.out.print("Select a User to remove: ");
				try{userIndex = input.nextInt(); pass = true;}
				catch(Exception e){pass = false;}
			}
			while (pass != true);
			
			rec.removeUser(userIndex);
			
		}
		else
		{	
			System.out.println("No Users");
		}
	}
	
	/**
	 * List all movies from the list
	 */
	
	private void listMovies() 
	{
		for(Movie movie : rec.getMovies())
			System.out.println(movie);
		
	}
}
		
