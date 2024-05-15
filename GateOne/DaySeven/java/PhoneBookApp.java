import java.util.Scanner;
import java.util.ArrayList;

public class PhoneBookApp{

public static void main(String[] args){

Scanner input = new Scanner(System.in);

ArrayList<String> names = new ArrayList<String>();

ArrayList<Integer> contactNumbers = new ArrayList<Integer>();



String prompt = """
phonebook menu
list of menu options
_____________________________________

1 -> Add Contact
2 -> Remove Contact
3 -> Find Contact By Phone Number
4 -> Find Contact By First Name
5 -> Find Contact By Last Name
6 -> Edit Contact 
""";


System.out.println("                     WELCOME TO MY PHONEBOOK ");

System.out.print("Enter Contact First Name: ");
String firstName = input.nextLine();


System.out.print("Enter Contact Last Name: ");
String lastName = input.nextLine();

System.out.print("Enter Contact phone Number: ");
double contactNumber = input.nextDouble();


System.out.println("Saving Contact >>>>>>>>>>>>>>>>>>>>>>>>");

System.out.println("Saved Successfully!!!!!!!!!!!!!");

System.out.println(prompt);

int userInput = input.nextInt(); 
Switch (userInput){

case 1:

System.out.println("create a new contact");
boolean option = true;

do{

addContact();

System.out.print("Do u want to save a another contact");
String userResponse = input.nextLine();

if(userResponse.equals("no")){
	option = false;

}



}

while(option);

break;

case 2:

System.out.print("Enter name of contact you want to delete: ");
String firstName = input.nextLine();


System.out.print("Enter name of contact you want to delete: ");
String lastName = input.nextLine();

System.out.print("Enter Contact phone Number: ");
double contactNumber = input.nextDouble();


System.out.println("Deleting contact >>>>>>>>>>>>>>>>>>>>>>");

System.out.println("Deleted successfully !!!!!!");


}

System.out.println(names);
System.out.println(contactNumber);



}


}