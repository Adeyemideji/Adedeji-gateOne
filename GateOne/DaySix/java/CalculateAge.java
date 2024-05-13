import java.util.Scanner;
import java.time.LocalDate;
import java.time.Year;

public class CalculateAge{

public static void main(String[] args){

Scanner input = new Scanner(System.in);

public LocalDate dateOfBirth;

System.out.print("Enter the user  date of birth in DD-MM-YY: ");
String user = input.nextLine();

LocalDate dateOfBirth= LocalDate.parse(user);

System.out.println("You are " + user + " years old ");

}
		
public static int calculateAge(String user){

String allNum = user;
String TheDay = user.substring(0,2);
int day = Integer.parseInt(TheDay);
String TheMonth = user.substring(2,4);
int month = integer.parseInt(TheMonth);
String TheYear = user.substring(4,8);
int year = Integer.parseInt(TheYear);
Year todayYear = Year.now();
int currentYear = todayYear.getValue();
LocalDate currentDate = LocalDate.now();		                   
int currentMonth = currentDate.getMonthValue();
int currentDay = currentDate.getDayOfMonth();
int age = 0;

if (currentMonth < month || currentDay < day ){
	age = currentYear - year - 1;

}
else{

	age = currentYear - year;
}

String theAge = String.valueOf(age);
		
	

return theAge ;
}

}