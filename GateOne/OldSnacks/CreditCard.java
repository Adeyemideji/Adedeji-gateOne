
import java.util.Arrays;
import java.util.Scanner;

	public class CreditCard{
	 public static void main(String[]args){
		Scanner input = new Scanner(System.in);
	 
		System.out.print("Enter a valid credit card:   ");
		String card = input.next();
		
			System.out.println("This is the length of the number :  " + creditCardSize(card));
			int[] nums = doubleElement(card);
			int[] nums1 = doubleValue(card);
			int number1 = doubleElement1(nums);
			int number2 = doubleValue1(nums1);
		    String word = addNumber(number1, number2);
			System.out.println(word);
			System.out.println("The number type is:   " + getCardType(card));
	 
	 } 
	
		public static int creditCardSize(String number){
		
		return number.length();
	    }
	
		public static int[] doubleElement(String number){
	 		int[] numbers = new int[number.length()];
				int counter= 0;
				for(int count = 0; count < number.length(); count++){
				numbers[counter]= Integer.parseInt(String.valueOf(number.charAt(count)));								//parseInt //valueOf
				counter++;
				
				}
				
			return numbers;
		}
		
		public static int doubleElement1(int[]numbers){
			int countNum = 0;
				for(int counter1 = numbers.length -2; counter1 >= 0; counter1-=2){
					countNum++;
				}
				
			int[]storeNum = new int[countNum];
				
				int nums = 0;
				int nums1 = 0;
				for(int count = numbers.length -2; count >= 0; count -=2){
					int multiply = numbers[count] * 2;
					if(multiply > 9){
					 storeNum[nums] = (multiply / 10 )+(multiply %10);
					 }else	storeNum[nums]= multiply;
					 nums++;
				}
				for(int index = 0; index < storeNum.length;index++){
					nums1+=storeNum[index];
				}
				return nums1;
		}
		
		public static int[] doubleValue(String number){
			int[] numbers = new int[number.length()];
		int counter= 0;
				for(int count = 0; count < number.length(); count++){
					numbers[counter]= Integer.parseInt(String.valueOf(number.charAt(count)));								//parseInt //valueOf
				counter++;
					
				}	
			return numbers;
		}
		public static int doubleValue1(int[]numbers){
			int countNum1 = 0;
				for(int counter1 = numbers.length -1; counter1 >= 1; counter1-=2){
			       countNum1++;
					
				}
			int[]storeNum1 = new int[countNum1];
			int nums1 = 0;
				
			for(int count1 = numbers.length -1; count1 >= 0; count1 -=2){
			storeNum1[nums1] = numbers[count1];
			nums1++;
			}
			int nums2 = 0;
			for(int numb = 0; numb < storeNum1.length;numb++){
				nums2 +=storeNum1[numb];
			}
			return nums2;
		
		}
	
			public static String addNumber(int nums, int nums1){
			
				int number = nums + nums1;
				if(number % 10 == 0){
					return "creditCard it is valid";
				}
				return  "creditCardit is invalid";
			}
					
			public static Object getCardType(String number){
				char nums;
				nums = number.charAt(0);
				if(nums == '4'){
				 return"visa Card";	
				}
				if(nums == '5'){
					return"Master Card";
				}
				if(number.charAt(0) == '3' && number.charAt(1) == '7'){
					return " American Express Card";
				}
				if(nums == '6'){
				 return "Discover Card";
		
				}
				return "invalid Card Type";
			}
	
	}
