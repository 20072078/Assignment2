package app.models;
import java.util.List;

public class Movie 
{
	private int movieID;
	private String title;
	private String year;
	private String url;
	private List<String> genres;
	
	/**
	 * Constructor for Movie Class
	 * @param movieID
	 * @param title
	 * @param year
	 * @param url
	 * @param genres
	 */
	
	public Movie(int movieID, String title, String year, String url, List<String> genres)
	{
		this.setMovieID(movieID);
		this.setTitle(title);
		this.setYear(year);
		this.setUrl(url);
		this.genres = genres;
	}

	/**
	 * Getters
	 * @return
	 */
	
	public List<String> getGenres() {
		return genres;
	}

	public int getMovieID() {
		return movieID;
	}

	public String getTitle() {
		return title;
	}

	public String getYear() {
		return year;
	}

	public String getUrl() {
		return url;
	}
	
	/**
	 * Setters
	 * @param movieID
	 */
	
	public void setMovieID(int movieID) {
		this.movieID = movieID;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setYear(String year) {
		this.year = year;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	
	/**
	 * Return String
	 */
	
	public String toString() 
	{
		String returnString = "MovieID = " + movieID + ", Title = " + title + ", Year = " + year + ", URL = " + url +", Genres = ";
		for(String genre : genres)
		{
			returnString+= genre+" | ";
		}
		return returnString;
	}
}
