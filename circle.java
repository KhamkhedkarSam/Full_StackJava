package sam_java;
import java.util.Scanner;
public class circle {
public static void main(String arg[]) {
	int r;
	 final double pi=3.14 ;
	 double circum;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the radius");
	r=sc.nextInt();
	circum=2*pi*r;
	System.out.println("circumference of circle  :"+circum);
}
}
