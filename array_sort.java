package sam_java;
import java.util.Scanner;
public class array_sort {
public static void main(String arg[] ){
	int array[]=new int[5];
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the array");
	for(int i=0;i<5;i++) {
		array[i]=sc.nextInt();
		}
	System.out.println("asending order");
	for(int i=0;i<5;i++) {
	for(int j=0;j<5;j++) {
	  if(array[i]>array[j]) {
		int temp= array[i];
		array[i]=array[j];
		array[j]=temp;
		}
	  }
	}
	for(int i=0;i<5;i++) {
		System.out.println("enter no"+array[i]);
	}
  }
}
