import java.io.*;
import java.util.*;
public class GradeBookProgram 
{

	public static void main(String[] args) throws IOException
	{
		@SuppressWarnings({ "unused", "resource" })
		Scanner in = new Scanner(System.in);
		int [][] Grades = new int [5][3];
		String[] Students = new String [5];
		BufferedReader infile = new BufferedReader (new FileReader("Grades.txt"));

		
		Intro();
		Option(Students, Grades, infile);
		System.out.println("\nProgram Terminated");
		
		
		
		
		
	}

	
	
	public static void Intro()
	{
		System.out.println("\t\t\t\t\t\tWelcome to the GradeBook Program!!!\n\n");
		System.out.print("This program will allow you to compute the average of all of the exams or ");
		System.out.println("you can compute the average of a student!!!");
		
	}
	public static void Option(String[] Students, int[][] Grades, BufferedReader infile) throws IOException
	{
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.println("\nSo would you like to compute the average for a student or for an exam? Type Student or Exam!");
		String ExamOrStudent = in.nextLine();
		
		switch(ExamOrStudent.charAt(0))
		{
		
		case 'E':
			
			case 'e':
			{
				System.out.println("\nYou have chosen to calculate exams!!!");
				studentAverage(Students, Grades, infile);
				Exams(Students, Grades);
				break;
			}
		
	case 'S':
		case 's':
		{
			System.out.println("\nYou have chosen to calculate students!!!");
			studentAverage(Students, Grades, infile);
			Students1(Students, Grades, infile);
			break;
		}
		
		
		
		
		}
		
	}
	public static void studentAverage(String[] Students, int[][] Grades, BufferedReader infile) throws IOException
	{	
		System.out.println("Here are the students and their respective grades:\n");
		
			for (int cntStudents=0; cntStudents<5; cntStudents++)
			{
						Students[cntStudents] = infile.readLine();
						System.out.print(Students[cntStudents] + "\t\t");
					
				for (int cntGrades=0; cntGrades<2; cntGrades++)
				{
					Grades[cntStudents][cntGrades] = Integer.parseInt(infile.readLine());
					System.out.print(Grades[cntStudents][cntGrades] + "\t\t");
				}
				
				System.out.println();
			}
		
		
	}
	public static void Students1(String[] Students, int [][] Grades, BufferedReader infile) throws IOException
	{
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		boolean run;
		
		do
		{
			
	
		System.out.println("Which Student would you like the average to? Please type their name");
		
		String chooseStudent = in.nextLine();
		
		switch (chooseStudent.charAt(0))
		{
			case 'A':
			case 'a':
			{
				
				double Average = Grades[0][0] + Grades[0][1];
				Average = Average/2;
				System.out.println("Adams Average: " + Average);
				break;
			}
			case 'B':
			case 'b':
			{
				double Average = Grades[1][0] + Grades[1][1];
				Average = Average/2;
				System.out.println("Baker Average: " + Average);
				break;
			}
			case 'C':
			case 'c':
			{
				double Average = Grades[2][0] + Grades[2][1];
				Average = Average/2;
				System.out.println("Campbell Average: " + Average);
				break;
			}	
			case 'D':
			case 'd':
			{
				double Average = Grades[3][0] + Grades[3][1];
				Average = Average/2;
				System.out.println("Dewey Average: " + Average);
				break;
			}
			case 'E':
			case 'e':
			{
				double Average = Grades[4][0] + Grades[4][1];
				Average = Average/2;
				System.out.println("East Average: " + Average);
				break;
			}
			default:
			{
				System.out.println("Invalid Input, please try again");
				chooseStudent = in.nextLine();
			}
		}
			System.out.println("would you like to find the average of another student? Type yes or no");
			String YesorNo = in.nextLine();
			if(YesorNo.charAt(0)=='Y' || YesorNo.charAt(0)=='y')
			{
				run = true;
			}
			else
			{
				run = false;
			}
		}
		while(run);
		
	}
	public static void Exams(String[] Students, int [][] Grades) throws IOException
	{
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.println("Which test would you  like the average to: Type 1 or 2");
		int Test = in.nextInt();
		double Total = 0;
		
		
		switch (Test)
		{
		
		case 1:
		{
			for (int cnt = 0; cnt<5; cnt++)
			{

				Total = Grades[cnt][0] + Total;
			}
			Total = Total/5;
			System.out.println("Average: " + Total);
			break;
		}
		case 2:
		{
			for(int cnt = 0; cnt<5; cnt++)
			{
				Total = Grades[cnt][1] + Total;
			}
			Total = Total/5;
			System.out.println("Average: " + Total);
			break;
		
			}
		}
		
	}
}