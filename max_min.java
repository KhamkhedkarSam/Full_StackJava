package sam_java;
import java.util.Scanner;
public class max_min {
public static void main(String arg[]) {
	int i;
	int[]n=new int[5];
	Scanner sc=new Scanner(System.in);
	System.out.println("enter 5 number");
     for(i=0;i<n.length;i++) {
    	n[i]=sc.nextInt();
     } 
    	int max=n[0]; 
        int min=n[0];
    
        for(i=0;i<n.length;i++) {
    	  if(max<n[i]) {
    	     max=n[i];
    	  }
    	  else if (min>n[i]) {
    		  min=n[i];     		   
    		  }	  
        }
      System.out.println("maxmimum no: "+max+" minnimum no: "+min);
    }
}

