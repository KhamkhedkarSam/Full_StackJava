package sam_java;
import java.util.Scanner;
public class reminder {
	public static void main(String arg[]) {
	int num1,num2;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the value of num1");
	num1=sc.nextInt();
	System.out.println("enter the value of num2");
	num2=sc.nextInt();
	int rem=num1-num1/num2*num2;
	System.out.println("reminder:"+rem);

	
}
}
