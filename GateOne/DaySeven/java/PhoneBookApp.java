import java.util.Scanner;
import java.util.ArrayList;

public class PhoneBookApp{

public static void main(String[] args){

Scanner input = new Scanner(System.in);

static ArrayList<String[]> contact = new ArrayList<>();
while (true){
System.out.print("1. Add contact");
System.out.print("2. remove contact");
System.out.print("3. Find Contact By First Name");
System.out.print("4. Find Contact By last Name");
System.out.print("5. Find Contact By Contact Name");
System.out.print("6. Edit Contact");
System.out.print("7. Exit");
String userInput = input.next();
                                                              
switch (userInput){
			case "1":
				addContact(input);
				break;
			case "2":
				removeContact(input);
				break;
			case "3":
                    			findContactsByFirstName(input);
                   			 break;
			case "4":
                    			findContactByLastName(input);
                   			 break;
			case "5":
				findContactByContactNumber(input);
				break;
			case "6":
				editContact(input);
				break;
			case "7":
				System.exit(0);
			

			}

}


	}

static void addContact(Scanner input){

System.out.print("Enter Contact first Name: ");
String firstName = input.nextLine();

System.out.print("Enter Contact last Name: ");
String lastName = input.nextLine();

System.out.print("Enter Contact phone Number: ");
String contactNumber = input.next();

contacts.add(new String[]{firstname, lastName, contactNumber});

System.out.println("Saving Contact >>>>>>>>>>>>>>>>>>>>>>>>");

System.out.println("Saved Successfully!!!!!!!!!!!!!");

}

static void removeContact(Scanner input){

System.out.print("Enter Contact phone Number: ");
String contactNumber = input.next();


System.out.println("Deleting contact >>>>>>>>>>>>>>>>>>>>>>");

System.out.println("Deleted successfully !!!!!!");

for(int counter = 0; counter < contact.size(); counter++){
	if (contact.get(counter)[2].equals(contactNumber)){
	contact.remove(counter);
	System.out.println("contact has been removed successfully"); 
	return;
	}


}
System.out.println("The contact you searched for is not found");
System.out.println(" \n ");
3
}
static void findContactByFirstName(Scanner input){

System.out.print("Enter The contact First Name");
String firstName = input.next();

for(String[] contact : contacts){
	if(contact[2].equals(firstName)){
	System.out.println("The Contact Name: " + contact[0]+" "+contact[1]);
	System.out.println("The Contact Number: " + contact[2]);
	System.out.println(" \n ");
	return;
	}

}
System.out.println("The contact you searched for is not found");
System.out.println(" \n ");

}
static void findContactByLastName(Scanner input){

System.out.print("Enter The contact Last Name");
String lastName = input.next();

for(String[] contact : contacts){
	if(contact[2].equals(lastName)){
	System.out.println("The Contact Name: " + contact[0]+" "+contact[1]);
	System.out.println("The Contact Number: " + contact[2]);
	System.out.println(" \n ");
	return;
	}

}
System.out.println("The contact you searched for is not found");
System.out.println(" \n ");

}
static void findContactByContactNumber(Scanner input){

System.out.print("enter contact number you want to search for");
String contactNumber = input.next();

for(String[] contact : contacts){
	if(contact[2].equals(contactNumber)){
	System.out.println("The Contact Name: " + contact[0]+" "+contact[1]);
	System.out.println("The Contact Number: " + contact[2]);
	System.out.println(" \n ");
	return;
	}

}
System.out.println("The contact you searched for is not found");
System.out.println(" \n ");

}

static void editContact(Scanner input){

System.out.print("Enter Contact Number you Want to Edit: ");
String contactNumber = input.next();

for(int counter = 0; counter < contact.size(); counter++){
	if(contact.get(counter)[2].equals(contactNumber)){ 

	System.out.print("Enter Contact First Name you want to edit: ");
	String firstEdit = input.nextLine();

	System.out.print("Enter Contact last Name you want to edit: ");
	String lastEdit = input.nextLine();

	System.out.print("Enter Contact phone Number you want to edit: ");
	String numberEdit = input.next();

	System.out.println("Editting Contact >>>>>>>>>>>>>>>>>>>>>>>>");

	System.out.println("Editted Successfully!!!!!!!!!!!!!");
	System.out.println(" \n ");
	return;
	}
}
System.out.println("The contact you searched for is not found");
System.out.println(" \n ");


}	

}