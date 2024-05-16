import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MenstrualAppTest{

@Test 
 void test(){
	int cycleLength = 30;
	LocalDate lastPeriodEndDate = 2024-06-10;
	LocalDate nextStartDate = MenstrualApp.getNextPeriodStartDate(lastPeriodEndDate,cycleLength); 
	assertEquals(2024-07-10,nextStartDate,);
	

}



}