import java.util.Scanner;
import java.util.Arrays;
public class TaskOne{

public static void main(String[] args){

Scanner input = new Scanner(System.in);

int[] number = new int[11];

for(int counter = 1; counter < number.length; counter++){

	System.out.print("Enter a score: ");
	int score = input.nextInt();
	number[counter] = score;
}

	System.out.print(Arrays.toString(number));

}

}
