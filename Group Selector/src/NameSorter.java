import java.util.Comparator;

public class NameSorter implements Comparator<Student>
	{
	public int compare(Student s1, Student s2)
		{
		return s1.getLastName().compareTo(s2.getLastname());
		}

	}
