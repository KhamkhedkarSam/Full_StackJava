package sam_java;
import java.util.Scanner;
public class reverse {
public static void main(String arg[]) {
	int[]rev=new int[5] ;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	 
	for(int i=0;i<rev.length;i++) {
	      rev[i]=sc.nextInt();
	}
	     for(int i=rev.length-1;i>=0;i-- )
	  {
		System.out.println(rev[i]);
	  }
	
   }
}
