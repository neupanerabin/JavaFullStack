package utilities_classes;
import java.util.Date;
import java.time.DayOfWeek;
import java.time.LocalDate;

public class LocalDateTest {

	public static void main(String[] args) {
		// DayOfWeek; getDayOfWeek()
		// LocalDate ld = new Date();
		
		LocalDate currentDate = LocalDate.now();
        DayOfWeek dayOfWeek = currentDate.getDayOfWeek();
        System.out.println("Today is " + dayOfWeek);
		
	}

}
