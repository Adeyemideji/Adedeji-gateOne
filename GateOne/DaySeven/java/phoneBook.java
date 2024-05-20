import java.util.Scanner;
import java.util.ArrayList;

public class PhoneBook{

public static void main(String[] args){
Scanner input = new Scanner(System.in);

ArrayList<String> contacts = new ArrayList<>();
while (true){

printHeader();
String userInput = input.nextLine();
switch(userInput){
	case "1":
		System.out.print("Enter your contact name ");
		String name = input.nextLine();
		System.out.println(name + " has been successfully saved >>>>>>> ");
		contacts.add(name);
		break;
	case "2":
		System.out.print("Enter the contact name u want to remove ");
		String removeName = input.nextLine();
		if(contacts.isEmpty()){
		System.out.print("Its empty");
		} else {
		contacts.remove(removeName);
		System.out.println(removeName + " Name has been removed successfully ");
		}
		break;
	case "3":
		System.out.print("Enter name you re searching for... ");
		String searchName = input.nextLine();

		break;

	case "7":
		System.out.print("invaLid input, please choose a valid number ");
		break;
	default:
		return;
	
}

}








}

public static void printHeader(){
String prompt = """
	1. Add contact
	2. remove contact
	3. Find Contact By First Name
	4. Find Contact By last Name
	5. Find Contact By Contact Name
	6. Edit Contact
	7. Exit

choose an option 	""";
System.out.println(prompt);

}
}