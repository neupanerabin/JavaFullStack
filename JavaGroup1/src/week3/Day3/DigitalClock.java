package week3.Day3;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
public class DigitalClock {

	public static void main(String[] args) {
		
		try {

			LocalDate localDate = LocalDate.now();
			LocalTime now = LocalTime.now();
			//System.out.print(localDate);
			Instant instant = Instant.now() ;  // Capture the current moment in UTC.
			
			System.out.println(" "+instant);
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		finally {
			System.out.println("finally");
		}

	}

}
