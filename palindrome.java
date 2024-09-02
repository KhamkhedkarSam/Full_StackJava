package sam_java;
import java.util.Scanner;
public class palindrome {
public static void main(String arg[]) {
	int n,rev,sum=0,temp;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the value");
	n=sc.nextInt();
	temp=n;
	while(n>0) {
		rev=n%10;
		sum=(sum*10)+rev;
		n=n/10;
	}
	if(temp==sum) {
		System.out.println(" this is palindrome");
		}
	else {
		System.out.println(" not palindrome");

	}
  } 
}