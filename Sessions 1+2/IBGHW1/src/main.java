//This program will accpet and return a birthday 
import java.io.*; //allows program to throw Input/Output exception
import java.util.Scanner; //allows program to read in text from user
import java.lang.String; //Allows me to create strings of text
import java.lang.StringBuffer; //Allows me to manipulate strings

public class main{
	public static void main(String arg[]) throws IOException { //throws exception if there is an error with input
		int day, month, year; //varibles to hold in numerical date
		Scanner input = new Scanner(System.in); //varible to hold user input
		StringBuffer birthday = new StringBuffer(); //varible that will eventually become final birth date
		
		System.out.println("Enter a day: "); //prompts the user to enter a day
		day = input.nextInt(); //stores the user's response into 'day' varible
		
		System.out.println("Enter a month: "); //prompts the user to enter a month
		month = input.nextInt(); //stores the user's response into 'month' varible
		
		System.out.println("Enter a year: "); //prompts the user to enter a year
		year = input.nextInt(); //stores the user's response into 'year' varible
		
		//format's the users responses into single string 
		birthday.append(month); //adds month to string
		birthday.append("/"); //adds '/' to string
		birthday.append(day); //adds day to string
		birthday.append("/"); //adds another '/' to string
		birthday.append(year); //adds year to string
		
		System.out.println("Your date is: " + birthday.toString()); //final output with date
	}
}