import java.util.Scanner;
import java.util.Date;
import java.util.ArrayList;

public class SemicolonStore{

public static void main(String[] args){

Scanner input = new Scanner(System.in);
        
        int counter = 0;

	ArrayList<String> item = new ArrayList<String>();
	ArrayList<Integer> price = new ArrayList<Integer>();
	ArrayList<Integer> quantity = new ArrayList<Integer>();
	ArrayList<Double> totals = new ArrayList<Double>();

        Date date = new Date();

        double sum = 0;
	int pieces ;
	int perUnit ;
	String moreItems = null;
	double subTotal = 0;

	System.out.println("What Is The Customer's Name");
	String customerName = input.nextLine();

	    do{

		System.out.println("What Did The User Buy?");
		String userBuy = input.nextLine();

		System.out.println("How Many Pieces?");
		pieces = input.nextInt();

		System.out.println("How Much Per Unit?");
		perUnit = input.nextInt();

                 double total = pieces * perUnit;

	      item.add(userBuy);

              price.add(perUnit);

	      quantity.add(pieces);

	      totals.add(total);

		System.out.println("Add More Items?");
		input.nextLine();
		moreItems = input.nextLine();
	
	if(moreItems.equals("no")){
	}

	   }
	     while (moreItems.equals("yes"));

	System.out.println("What Is The Cashier's Name?");
	String cashierName = input.nextLine();

	System.out.println("How Much Discount Will He Get");
	int customerDiscount = input.nextInt();

	System.out.println("SEMICOLON STORES ");
	System.out.println("MAIN BRANCH ");
	System.out.println("LOCATION :  312, HERBERT MACAULAY WAY, SABO YABO, LAGOS");
	System.out.println("TEL: 09042959086 ");
	System.out.println("Date");
	System.out.println("Cashier:  " + cashierName);
	System.out.println("CustomerName:  " + customerName);  

System.out.println("===========================================================");

System.out.println("ITEM	QTY	PRICE	       TOTAL(NGN)");

System.out.println("------------------------------------------------------------");

     for (counter = 0; counter < item.size(); counter++)  {
   
System.out.println(item.get(counter) + "\t" + quantity.get(counter) + "\t" + price.get(counter) + "\t" + "\t" + totals.get(counter));
subTotal += totals.get(counter);
   }
	
   double discount = customerDiscount * subTotal / 100;

   double vat = 17.50 / 100 * subTotal;

   double billTotal = subTotal + discount + vat;

System.out.println("------------------------------------------------------------");

System.out.printf("\tSub Total:      \t%d%n",subTotal);

System.out.printf("\tDiscount:       \t%.2f%n",discount);

System.out.printf("\tVAT  @17.50:    \t%.2f%n",vat);

System.out.println("============================================================");

System.out.printf("Bill Total:      \t\t%.2f%n",billTotal);

System.out.println("============================================================\n");

System.out.println("THIS IS NOT A RECEIPT KINDLY PAY  \t" + billTotal);
System.out.println("\n");

System.out.println("\n===========================================================");

System.out.println("How Much Did Customer Give You: ");
double AmountPaid = input.nextDouble();

	System.out.println("SEMICOLON STORES ");
	System.out.println("MAIN BRANCH ");
	System.out.println("LOCATION :  312, HERBERT MACAULAY WAY, SABO YABO, LAGOS");
	System.out.println("TEL: 09042959086 ");
	System.out.println(date);
	System.out.println("Cashier:  " + cashierName);
	System.out.println("CustomerName:  " + customerName);  

System.out.println("===========================================================");

System.out.println("ITEM	QTY	PRICE	       TOTAL(NGN)");

System.out.println("------------------------------------------------------------");
   double Discount = customerDiscount * subTotal / 100;

   double Vat = 17.50 / 100 * subTotal;

   double BillTotal = subTotal + discount + vat;

   double Balance = billTotal - AmountPaid;

System.out.println("------------------------------------------------------------");

System.out.printf("\tSub Total:      \t%d%n",subTotal);

System.out.printf("\tDiscount:       \t%.2f%n",discount);

System.out.printf("\tVAT  @17.50:    \t%.2f%n",vat);

System.out.println("------------------------------------------------------------");

System.out.printf("Bill Total:      \t\t%.2f%n",billTotal);
System.out.printf("AmountPaid:      \t\t%.2f%n",AmountPaid);
System.out.printf("Balance:         \t\t%.2f%n",Balance);

System.out.println("============================================================");

	System.out.println("THANKS FOR YOUR PATRONAGE ");

System.out.println("============================================================");
}

} 