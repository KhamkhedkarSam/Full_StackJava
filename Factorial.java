package sam_java;
import java.util.*;
public class Factorial {

	public static void main(String[] args) {
		
		      Scanner sc=new Scanner(System.in);
		      System.out.println("enter the number");
		        int num=sc.nextInt();
		        int i=1,fact=1;
		        while(i<=num) {
		        	fact*=i;
		        	i++;
		        }
		         System.out.println("factorial the number :"+fact);
		      }
}
