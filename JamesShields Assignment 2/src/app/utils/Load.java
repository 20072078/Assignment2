package app.utils;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

import app.models.Movie;
import app.models.User;
import edu.princeton.cs.introcs.In;

public class Load {

	private List<String> genres;
	
	public Load()
	{
		try
		{
			loadGenres();
		}catch(Exception e)
		{
			System.err.println("Couldn't load genres :(");
			e.printStackTrace();
		}
	}
	
	/**
	 * Given in Assignment how to import the file informations
	 * @throws Exception
	 */
	private void loadGenres() throws Exception {
		
		File genreFile = new File("moviedata_small/genre.dat");
		genres = new ArrayList<String>();
        In inGenre = new In(genreFile);
          //each field is separated(delimited) by a '|'
        String delims = "[|]";
        while (!inGenre.isEmpty()) {
            // get user and rating from data source
            String genreDetails = inGenre.readLine();

            // parse user details string
            String[] genreTokens = genreDetails.split(delims);

            // output user data to console.
            if (genreTokens.length == 2) {
                genres.add(genreTokens[0]);
            }else
            {
                throw new Exception("Invalid member length: "+genreTokens.length);
            }
        }
	}

	public List<User> loadUsers(String url) throws Exception
	{
		File usersFile = new File(url);
		List<User> users = new ArrayList<User>();
        In inUsers = new In(usersFile);
          //each field is separated(delimited) by a '|'
        String delims = "[|]";
        while (!inUsers.isEmpty()) {
            // get user and rating from data source
            String userDetails = inUsers.readLine();

            // parse user details string
            String[] userTokens = userDetails.split(delims);

            // output user data to console.
            if (userTokens.length == 7) {
                User newUser = new User(Integer.parseInt(userTokens[0]),userTokens[1],userTokens[2],Integer.parseInt(userTokens[3]),userTokens[4],userTokens[5]);
                users.add(newUser);
            }else
            {
                throw new Exception("Invalid member length: "+userTokens.length);
            }
        }
        return users;
	}

	public List<Movie> loadMovies(String url) throws Exception 
	{
		File moviesFile = new File(url);
		List<Movie> movies = new ArrayList<Movie>();
        In inMovies = new In(moviesFile);
          //each field is separated(delimited) by a '|'
        String delims = "[|]";
        while (!inMovies.isEmpty()) {
            // get user and rating from data source
            String movieDetails = inMovies.readLine();

            // parse user details string
            String[] movieTokens = movieDetails.split(delims);

            // output user data to console.
            if (movieTokens.length == 23) {
            	
            	List<String> thisMovieGenres = new ArrayList<String>();
            	/**
            	 * This part is to work out which genres fit for which movie by using a nested loop and an array
            	 */
            	for(int i=4; i<23;i++)
            	{
            		if(Integer.parseInt(movieTokens[i]) == 1)
            		{
            			int genreKey = i - 4;
            			String genre = genres.get(genreKey);
            			thisMovieGenres.add(genre);
            		}
            	}
            	
                Movie newMovie = new Movie(Integer.parseInt(movieTokens[0]), movieTokens[1],movieTokens[2], movieTokens[3], thisMovieGenres);
                movies.add(newMovie);
            }else
            {
                throw new Exception("Invalid member length: " + movieTokens.length);
            }
        }
        return movies;
		
	}
}
