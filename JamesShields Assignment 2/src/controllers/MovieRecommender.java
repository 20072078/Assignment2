package controllers;
import java.util.List;

import app.models.Movie;
import app.models.User;
import app.utils.Load;

public class MovieRecommender  implements Recommender{

	private List<User> users;
	private List<Movie> movies;
	//private List<Rating> ratings;
	
	
	/**
	 * Loads in the data from the files into the program
	 */
	public MovieRecommender()
	{
		Load loader = new Load();
		try {
			users = loader.loadUsers("moviedata_small/users5.dat");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/*
		for(User user : users)
			System.out.println(user);
		*/
		try {
			movies = loader.loadMovies("moviedata_small/items5.dat");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/*
		for(Movie movie : movies)
			System.out.println(movie); 
		*/
	}
	
	/**
	 * Adds User to list
	 */
	@Override
	public void addUser(String firstName, String lastName, int age, String gender, String occupation)
	{
		int id = users.size() +1;
		User newUser = new User(id,firstName,lastName,age,gender,occupation);
		users.add(newUser);
		
	}

	/**
	 * Removes a user from list
	 */
	@Override
	public void removeUser(int userID) 
	{
		users.remove(userID);
		
	}

	/*@Override
	public void addMovie(String title, int year, String url) {
		// TODO Auto-generated method stub
		
	}*/

	@Override
	public void addRating(int userID, int movieID, int rating) {
		// TODO Auto-generated method stub
		
	}

	/**
	 * Prints list of Movies
	 *
	 */
	@Override
	public List<Movie> getMovies() {
		return movies;	
	}
	
	public Movie getMovie(int movieID)
	{
		return null;
	}

	@Override
	public void getUserRatings(int userID) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getUserRecommendations(int userID) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getTopTenMovies() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void load() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void write() {
		// TODO Auto-generated method stub
		
	}
	
	/**
	 * Prints list of users
	 */

	@Override
	public List<User> getUsers() {
		return users;
	}

	@Override
	public void addMovie(String title, int year, String url) {
		// TODO Auto-generated method stub
		
	}

}
