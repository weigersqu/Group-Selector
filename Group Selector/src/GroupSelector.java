import java.util.*;
import java.util.Scanner;
import java.io.*;
public class GroupSelector
	{
	public int numberOfLines;
	public static int numberOfGroups;
	static ArrayList <Student> roster = new ArrayList <Student>();
	
	
//	create Student constructor
//	firstName,lastName, score
//import classRoster.txt
//instantiate an ArrayList
//get the number of students
//for loop - 0 to numberOfStudent
//	firstName = file.next()
//	lastName = file.next()
//	score = file.nextDouble()
//	add info to the array list
//sort by score
//deal into groups
	//Collections.sort(gradebook, new ScoreSorter());
	//classroster.add(new Student(firstName, lastName, score ));
	public static void main(String[] args) throws IOException
		{
		System.out.println("How many groups would you like?");
		Scanner file = new Scanner(new File ("classroster 2.txt"));
		int numberOfStudents = file.nextInt();
			{
	for(int i = 0; i < numberOfStudents; i++)
		{
		String firstName = file.next();
		String lastName = file.next();
		double score = file.nextDouble();
		roster.add(new Student(firstName, lastName, score ));
		}
		System.out.println(roster);
	//public static int getNumberOfGroups();
			}
		}
	}
