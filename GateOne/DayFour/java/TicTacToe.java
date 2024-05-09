import java.util.Scanner;

public class TicTacToe{

public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.println("              WELCOME TO A GAME OF TIC TAC TOE");

System.out.print("please Register your name: ");
String name = input.nextLine();

System.out.println(name + " This is an example of how the game looks below");

System.out.println("x|o|x");
System.out.println("x|o|x");
System.out.println("o|x|o");

for(int counter = 1; counter < 10; counter++){

	System.out.print("Enter between X or O: ");
	String choice = input.nextLine();
	
	if (choice != "x" && choice != "o"){
		System.out.print("Which column do u want ur input to go: ");
		int column = input.nextInt();
	}

	else{
		System.out.print("Wrong input try again");
	}

}

}

}
