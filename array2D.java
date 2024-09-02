package sam_java;
import java.util.Scanner;

public class array2D {
public static void main(String arg[]) {
		  int[][] array1=new int[2][2];
		  int[][] array2=new int[2][2];
		  int[][] arraySum=new int[2][2];
		  Scanner sc=new Scanner(System.in);
		  System.out.println(" first matrix");
		  for(int i=0;i<array1.length;i++) {
			  for(int j=0;j<array1.length;j++) {
				  array1[i][j]=sc.nextInt();
			  }
		  }
		  System.out.println(" second matrix");
		  for(int i=0;i<array1.length;i++) {
			  for(int j=0;j<array2.length;j++) {
				  array2[i][j]=sc.nextInt();
			  }
		  }
		  System.out.println("sum of matrix");
		  for(int i=0;i<array1.length;i++) {
			  for(int j=0;j<array1.length;j++) {
				  arraySum[i][j]=array1[i][j]+ array2[i][j];
			  }
		  }
		  for(int i=0;i<array1.length;i++) {
			  for(int j=0;j<array1.length;j++) {
				  System.out.print("  "+arraySum[i][j]);
			  }
			  System.out.println(" ");
		  }
	  }
	}


