import java.util.Scanner;
import java.util.Random;

public class RandomQuestions{

public static void main(String[] args){

Scanner input = new Scanner(System.in);

Random rand = new Random();

int correctAnswer = 0;
int wrongAnswer = 0;

int numberOne = 0;
int numberTwo = 0;


	for(int counter = 1; counter < 11; counter++){

	int numbersOne = rand.nextInt(10);

	int numbersTwo = rand.nextInt(5);

	int answer = numbersOne + numbersTwo;

	System.out.print("what is " +numbersOne+ " + "+numbersTwo+ " = ");
	int questionAnswer = input.nextInt();

	if(questionAnswer == answer){

	correctAnswer++;

	}

	else if(questionAnswer != answer){
	
	wrongAnswer++;

	System.out.println("you got "+ correctAnswer+ " correct");
	System.out.println("you got "+ wrongAnswer+ " wrong"); 

	}


	
	}



}


}