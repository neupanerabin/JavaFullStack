package utilities_classes;
import java.security.Timestamp;
import java.time.Instant;
import java.time.LocalDate;
import java.util.Date;

import myLibrary.BasicIo;
public class DateTest {

	public static void main(String[] args) {
		
		/*
		// long getTime()
		Date date = new Date();
		long d = date.getTime();
		System.out.println(d);	// time stamp

		//boolean	after(Date when)
		LocalDate firstDate = LocalDate.of(2019, 7, 11);	// Declaration of date
		LocalDate secondDate = LocalDate.of(2019, 7, 12);	// Declaration of date 2
		
		boolean after = secondDate.isAfter(firstDate);		// check the condition
	      System.out.println("firstDate is after secondDate: " + after);	// Display 
		
		
		// boolean	before(Date when)
		LocalDate firstDates = LocalDate.of(2019, 7, 11);	// Declaration of date
		LocalDate secondDates = LocalDate.of(2019, 7, 12);	// Declaration of date 2
		boolean before = firstDates.isBefore(secondDates);	// check the condition 
		BasicIo.printMessage("First Date ia after secondDate:"+before);	// Display the output
	
		// Object	clone()
		Date date = new Date(2023,6,6);	// Declaration and value assign
		BasicIo.printMessage("clone of date 'date:'"+ date.clone());	// Clone of the date;
		
		// int	compareTo(Date anotherDate)
		LocalDate firstDates = LocalDate.of(2019, 7, 19);	// Declaration of date
		LocalDate secondDates = LocalDate.of(2019, 7, 12);	// Declaration of date 2
		int compares = firstDates.compareTo(secondDates);	// compare date1 from date 2
		BasicIo.printMessage("Difference of : "+compares);
		
		//Qs-> boolean	equals(Object obj)
		// declaration and assign value to  first and second date 
		LocalDate datef =  LocalDate.of(2023, 1, 1);	
		LocalDate dates = LocalDate.of(2023,1,2);
		boolean equals = datef.equals(dates);		// check the condition 
		BasicIo.printMessage("Boolean value :"+equals);	// Display the value
		
		*/
		//static Date	from(Instant instant)
		 Date d=new Date();  
	     Instant i= Instant.now();  
	     System.out.println("date  : "+d.from(i));  
	     
	     
		
		
		
		// How to convert time-stamp to date/time?
		
		
	}



}
