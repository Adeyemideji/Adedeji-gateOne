import java.util.Scanner; 

public class TaskThree{

public static void main(String[] args){

Scanner input = new Scanner(System.in);

int sum = 0;
int average = 0;

	for(int counter = 0; counter < 10; counter++){

	System.out.print("Enter a Score: ");
	int num = input.nextInt();
	
	sum += num;
	average = sum / 10;

	
	}
	
	System.out.println("the sum of the score is " + sum);

	System.out.print("the average of the score is " + average);

	
	
}

}