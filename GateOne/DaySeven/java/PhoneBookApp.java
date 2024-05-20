import java.util.Scanner;
import java.util.ArrayList;

public class PhoneBookApp{

private static ArrayList<String[]> contacts = new ArrayList<>();

public static void main(String[] args) {

Scanner input = new Scanner(System.in);

while (true){
System.out.println("1. Add contact");
System.out.println("2. Remove contact");
System.out.println("3. find contact by phone number");
System.out.println("4. find contact by first name");
System.out.println("5. find contact by last name");
System.out.println("6. Edit contact");
System.out.println("7. Exit");
System.out.print("Choose an option:");
String userInput = input.next();
switch (userInput){
case "1":
	addContact(input);
	break;
	case "2":
	removeContact(input);
	break;
	case "3":
        findContactByPhoneNumber(input);
        break;
	case "4":
        findContactsByFirstName(input);
        break;
	case "5":
	findContactByLastName(input);
	break;
	case "6":
	editContact(input);
	break;
	case "7":
	System.exit(0);
			

}
}
}

public static void addContact(Scanner input){
System.out.print("Enter contact first name: ");
String firstName = input.next();

System.out.print("Enter contact last name: ");
String lastName = input.next();

System.out.print("Enter contact number: ");
String contactNumber = input.next();

contacts.add(new String[] {firstName, lastName, contactNumber});

System.out.println("Saving contact >>>>>>>>>>>>>>>>>>>>>>>>");

System.out.println("Contact saved successfully");


}

public static void removeContact(Scanner input){

System.out.print("Enter the contact name u want to remove: ");
String contactName = input.next();

for(int count = 0; count < contacts.size(); count ++){
	if (contacts.get(count)[2].equals(contactName)){
	contacts.remove(count);
	System.out.println("Contact removed sucessfully");
	return;
	}
	
}
System.out.println("contact searched for is not found");

}
public static void findContactByPhoneNumber(Scanner input){
System.out.print("Enter phone number to search");
String contactNumber = input.next();

for (String[] contact : contacts) {
	if (contact[2].equals(contactNumber)) {
	System.out.println("contact name: " + contact[0]+" "+contact[1]);
	System.out.println("contact number: " + contact[2]);

	return;
        }
}
System.out.println("contact searched for is not found");

}

public static void findContactsByFirstName(Scanner input){
System.out.print("Enter contact first Name: ");
String contactFirstName = input.next();
for (String[] contact : contacts){
	if (contact[0].equals(contactFirstName )){
	System.out.println("Contact name: "+contact[0]+" "+contact[1]);
	System.out.println("contact number: " +contact[2]);
	System.out.println(" \n ");
	return;
	}
		
}
System.out.print("contact searched for is not found");


	}

public static void findContactByLastName(Scanner input){
System.out.print("Enter contact last name: ");
String contactLastName = input.next();

for(String[] contact : contacts){
	if (contact[1].equals(contactLastName)){
		System.out.println("Contact name: "+contact[0]+" "+contact[1]);
		System.out.println("contact number: " +contact[2]);
		System.out.println(" \n ");
		return;
	}
}
System.out.print("contact searched for is not found");


}
public static void editContact(Scanner input){
System.out.println("Enter contact number you want to edit : ");
String editContactNumber = input.next();

for (int count = 0; count < contacts.size(); count++){
	if (contacts.get(count)[2].equals(editContactNumber)){
	System.out.println("Enter Editted First Name:");
	String edittedFirstName = input.next();

	System.out.print("Enter Editted new last Name:");
	String edittedLastName = input.next();

	System.out.print("Enter Editted new Contact number:");
	String newNumber = input.next();

	contacts.set(count, new String[]{edittedFirstName, edittedLastName, newNumber});

	System.out.println("Editting >>>>>>>>>>>>>>>>>>>>>>>>");
	System.out.println("Contact edited succesfully");
	return;
	}
	}
	System.out.println("contact searched for is not found");	
	

}






}