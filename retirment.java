package assi_2;
import java.util.Scanner;
import java.time.*;
import java.util.Scanner;
public class retirment {

public static void main(String arg[]) {
Scanner sc=new Scanner(System.in);
System.out.println("enter date_of_birth");
String date_of_birth=sc.next();
System.out.println("enter date_of_joining");
String date_of_joining=sc.next();
try {
	LocalDate datejoining=LocalDate.parse(date_of_joining);
	LocalDate datebirth=LocalDate.parse(date_of_birth);
	LocalDate retirementDate=datebirth.plusYears(58);
	System.out.println("date of retirement"+retirementDate);
}
catch(Exception e) {
	System.out.println("invalid date");
}
}
}