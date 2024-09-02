package sam_java;
import java.util.Scanner;
import java.lang.Math;
public class power {
	public static void main(String arg[]) {
		int num1,num2;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter num1");
		num1=sc.nextInt();
		System.out.println("enter num2");
		num2=sc.nextInt();
        System.out.println(" no"+Math.pow(num1,num2));
        sc.close();

	}

}
