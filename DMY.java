package assi_2;
import java.time.*;
import java.time.LocalDate;
import java.util.Scanner;

public class DMY {
static int D,M,Y;
public static void  CalculateAge() throws DateTimeException{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the date" );
	D=sc.nextInt();
	System.out.println("enter the month" );
	M=sc.nextInt();
	System.out.println("enter the year" );
	Y=sc.nextInt();
	LocalDate Bdate=LocalDate.of(Y, M, D);

	LocalDate CurruntDate= LocalDate.now();
	Period p=Period.between(CurruntDate,Bdate);
	System.out.println("year"+p.getYears()+"month"+p.getMonths()+"day"+p.getDays());
}
	
	
public static void main(String[] args) {
	CalculateAge();	

	}

}
