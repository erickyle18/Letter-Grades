import java.util.Scanner;

public class LetterGrades {
	
	public static void main(String[] args) {
		
		//initialize the instance variables
		int total = 0;		//hold the sum of all the grades
		int gradeCounter = 0;	//hold the number of grades entered
		int aCount = 0;		//count the number of A's
		int bCount = 0;		//count the number of B's
		int cCount = 0;		//count the number of C's
		int dCount = 0;		//count the number of D's
		int fCount = 0;		//count the number of F's
		
		//create the scanner object
		Scanner input = new Scanner(System.in);
		
		//Display the instructions for the program
		System.out.printf("%s%n%s%n   %s%n   %s%n",
				"Enter the integer grades in the range 0-100.",
				"Type the end-of-file indicator to terminate input:",
				"On UNIX/Linux/Mac OS X type <Ctrl> d then press Enter",
				"On Windows type <Ctrl> z then press Enter");
		
		//loop until the user enters the end-of-file indicator
		while(input.hasNext())
		{
			int grade = input.nextInt();	//read in the grade
			total = total + grade;		//add the grade to the total
			++gradeCounter;				//increment the number of grades
			
			//increment appropriate letter-grade counter
			switch(grade / 10)
			{
			case 9:		//grade was between 90
			case 10:	//and 100, inclusive
				++aCount;
				break;	//exit switch statement
				
			case 8:		//grade was between 80 and 89
				++bCount;
				break;		//exit switch statement
			
			case 7:		//grade was between 70 and 79
				++cCount;
				break;		//exit switch statement
				
			case 6:		//grade was between 60 and 69
				++dCount;
				break;		//exit switch statement
				
			default:	//grade was less than 60
				++fCount;
				break;		//optional, exit switch either way
				
			}	//end switch
				
		}	//end while
		
		//display the grade report
		System.out.printf("%nGrade Report:%n");
		
		
		//if the user entered at least one grade
		if(gradeCounter != 0)
		{
			//calculate the average of all the grades entered
			double average = (double) total / gradeCounter;
			
			//output the summary of the results
			System.out.printf("Total of the %d grades entered is %d%n", gradeCounter, total);
			System.out.printf("Class average is %.2f%n", average);
			System.out.printf("%n%s%n%s%d%n%s%d%n%s%d%n%s%d%n%s%d%n",
					"Number of students who received each grade:",
					"A: ", aCount,
					"B: ", bCount,
					"C: ", cCount,
					"D: ", dCount,
					"F: ", fCount);
		}	//end if
		else
		{
			System.out.println("No grades were entered");
		}
		
	}

}
