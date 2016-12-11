package controllers;
import java.util.List;

import app.models.Movie;
import app.models.User;

/**
 * Interface to be implemented in MovieRecommender Class
 * @author James College
 *
 */
public interface Recommender 
{
	void addUser(String firstName, String lastName,int age, String gender, String occupation);
	void removeUser(int userID);
	void addMovie(String title, int year, String url);
	void addRating(int userID, int movieID, int rating);
	List<Movie> getMovies();
	Movie getMovie(int movieID);
	void getUserRatings(int userID);
	void getUserRecommendations(int userID);
	void getTopTenMovies();
	List<User> getUsers();
	void load();
	void write();
}
