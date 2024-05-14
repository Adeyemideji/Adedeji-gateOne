import java.util.Scanner;
import java.util.ArrayList;

public class PhoneBookApp{

public static void main(String[] args){

Scanner input = new Scanner(System.in);

ArrayList<String> names = new ArrayList<String>();

ArrayList<Integer> phoneNumbers = new ArrayList<Integer>();

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



}

}