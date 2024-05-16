import java.util.Scanner;
import java.time.LocalDate;

public class MenstrualApp{
public static String getNextPeriodStartDate(LocalDate lastPeriodDate, int cycleLength){
LocalDate date = lastPeriodDate.plusDays(cycleLength);
return date.toString();

}
public static String[] getFirstSafePeriods(LocalDate lastPeriodDate, int cycleLength){
LocalDate start = lastPeriodDate.plusDays(1)
int safePeriod length = (cycleLength/2)/2;
LocalDate end = start.plusDays(length);
return new String[] {start.toString(), end.toString()}
}

public static void main(String[] args){

Scanner input = new Scanner(System.in);
System.out.print("When did you last period end in this format(YYYY-MM-DD): ");
String dayEnded = input.nextLine();
LocalDate date = LocalDate.parse(dayEnded);
System.out.print("Enter your menstrual cycle length: ");
int length = input.nextInt();
String result = getNextPeriodStartDate(date, length);
System.out.println(result);

















}






}