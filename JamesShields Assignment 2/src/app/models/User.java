package app.models;
public class User 
{

	private int userID;
	private String firstName;
	private String lastName;
	private int age;
	private String gender;
	private String occupation;

	/**
	 * Constructor for User class
	 * @param userID
	 * @param firstName
	 * @param lastName
	 * @param age
	 * @param gender
	 * @param occupation
	 */
	
	public User(int userID, String firstName, String lastName, int age, String gender, String occupation)
	{
		this.userID = userID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.gender = gender;
		this.occupation = occupation;
	}
	
	/**
	 * Getters
	 * @return
	 */
	
	public int getUserID()
	{
		return userID;
	}
	
	public String getFirstName()
	{
		return firstName;
	}
	
	public String getLastName()
	{
		return lastName;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public String getGender()
	{
		return gender;
	}
	
	public String getOccupation()
	{
		return occupation;
	}
	
	/**
	 * Setters
	 * @param userID
	 */
	
	public void setUserID(int userID)
	{
		this.userID = userID;
	}
	
	public void setFirstName(String firstName) 
	{
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}
	
	public void setAge(int age)
	{
		this.age = age;
	}
	
	public void setGender(String gender)
	{
		this.gender = gender;
	}
	
	public void setOccupation(String occupation)
	{
		this.occupation = occupation;
	}

	@Override
	public String toString() {
		String returnString = firstName+" "+lastName+":\nUserID: "+userID+"\nAge: "+age+"\nGender: "+gender+"\nOccupation: "+occupation+"\n\n";
		return returnString; //"User [userID = " + userID + ", first Name = " + firstName + ", lastName = " + lastName + ", age = " + age
				//+ ", gender = " + gender + ", occupation = " + occupation + "]";
	}
}
