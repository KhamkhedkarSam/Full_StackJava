package sam_java;
import java.util.Scanner;
public class avreage {
public static void main(String arg[]) {
	int sum=0;
	double average ;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the size of array");
	int arr=sc.nextInt();
	int[]num=new int[arr];
	System.out.println("enter the no");
	for(int i=0;i<num.length;i++) {
		int no=sc.nextInt();
		num[i]=no;
		}
	for(int i=0;i<num.length;i++) {
		sum=sum+num[i];
	}
    average=sum/num.length;
	System.out.println("averge of no"+sum);
	}
}
