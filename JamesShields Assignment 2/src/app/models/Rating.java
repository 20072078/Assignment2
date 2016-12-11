package app.models;

public class Rating 
{
	private int userID;
	private int movieID;
	private int rating;
	private int timestamp;
	
	/**Constructor for Rating Class
	 * 
	 * @param userID
	 * @param movieID
	 * @param rating
	 * @param timestamp
	 */
	
	public Rating(int userID, int movieID, int rating, int timestamp)
	{
		this.setUserID(userID);
		this.setMovieID(movieID);
		this.rating = rating;
		this.timestamp = timestamp;
	}
	
	public int getRating() {
		return rating;
	}
	
	public int getTimestamp() {
		return timestamp;
	}
	
	
	public void setRating(int rating) {
		this.rating = rating;
	}
	
	public void setTimestamp(int timestamp) {
		this.timestamp = timestamp;
	}

	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public int getMovieID() {
		return movieID;
	}

	public void setMovieID(int movieID) {
		this.movieID = movieID;
	}
}
