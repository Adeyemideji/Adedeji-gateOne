import java.util.Scanner; 

public class TaskOne{

public static void main(String[] args){

Scanner input = new Scanner(System.in);

int sum = 0;

	for(int counter = 0; counter < 10; counter++){

	System.out.print("Enter a Score: ");
	int num = input.nextInt();
	
	sum += num;

	
	}
	

	System.out.print("the sum of the score is " + sum);

	
	
}

}