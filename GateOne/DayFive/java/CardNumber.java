import java.util.Scanner;

public class CardNumber{

public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.print("kindly enter ur ATM details please: ");
String atmDetails = input.nextLine();

int cardLength = 0;

char[] cardDetails = atmDetails.tocharArray(); 

char cardLength = cardNumber.length;

System.out.println(cardLength);

if(cardLength){
	System.out.print("cardNumber is valid");

}

else{

	System.out.print("cardNumber is not valid");
}




}


}