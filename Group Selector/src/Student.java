
public class Student
	{
	private String firstName;
	private String lastName;
	private double score;

	public Student (String fn, String ln, double s)
		{
		firstName = fn;
		lastName = ln;
		score = s;
		}

	public String getFirstName()
		{
		return firstName;
		}

	public void setFirstName(String firstName)
		{
		this.firstName = firstName;
		}

	public String getLastName()
		{
		return lastName;
		}

	public void setLastName(String lastName)
		{
		this.lastName = lastName;
		}

	public double getScore()
		{
		return score;
		}

	public void setScore(double score)
		{
		this.score = score;
		}

	@Override
	public String toString()
		{
		return "Student [firstName=" + firstName + ", lastName=" + lastName
				+ ", score=" + score + "]";
		}
	
	}
