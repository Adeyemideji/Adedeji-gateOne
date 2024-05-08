import java.util.Scanner;
import java.util.Arrays;
public class TaskTwo{

public static void main(String[] args){

Scanner input = new Scanner(System.in);

int[] number = new int[11];

for(int counter = 1; counter < number.length; counter++){

	System.out.print("Enter a score: ");
	int score = input.nextInt();
	number[counter] = score;
} 

for(int counter : number){
	System.out.println(counter);
}


}

}
