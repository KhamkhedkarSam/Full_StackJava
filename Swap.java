package sam_java;
import java.util.Scanner;
public class Swap {

	public static void main(String[] args) {
		int num1;
		int num2;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the num1");
		num1=sc.nextInt();
		System.out.println("enter the num2");
		num2=sc.nextInt();
		 num1=num1-num2;
		 num2=num1+num2;
		 num1=num1-num2;

		
		System.out.println("num1"+num1+"num2"+num2);
		
}

}
