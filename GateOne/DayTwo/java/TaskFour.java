import java.util.Scanner;
import java.util.Arrays;
public class TaskFour{

public static void main(String[] args){

Scanner input = new Scanner(System.in);

int[] number = new int[11];
int[] num    = new int["1,2,3,4,5,6,7,8,9,10"];

for(int counter = 1; counter < number.length; counter++){

	System.out.print("Enter a score: ");
	int score = input.nextInt();
	number[counter] = score;

	if(num % 2 != 0){
		
		System.out.print(num);
	}



}


}

}
