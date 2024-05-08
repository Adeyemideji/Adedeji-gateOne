import java.util.Scanner; 

public class TaskFour{

public static void main(String[] args){

Scanner input = new Scanner(System.in);

int sum = 0;


	for(int counter = 0; counter < 10; counter++){

	System.out.print("Enter a Score: ");
	int num = input.nextInt();
	
	if(counter % 2 == 0){

		sum += counter;
	}
	
	}
	
	System.out.println("the number of even indexes is " + sum);

	
	
}

}