package assi_2;

import java.util.Hashtable;

public class hash_table {
	String name,dob,course;
	
	public hash_table(String name, String dob, String course) {
		
		this.name = name;
		this.dob = dob;
		this.course = course;
	}

 public void display() {
	System.out.println("name"+name);
	System.out.println("name"+dob);
	System.out.println("course"+course);
	
	}


public static void main(String arg[]) {
	String name, DOB,course;
	Hashtable<Integer,hash_table> hashtable=new Hashtable<>();
	hashtable.put(1,new hash_table("sam","12/02/2005","python"));
	hashtable.put(2,new hash_table("sanika","07/04/2004","java"));
	hashtable.put(3,new hash_table("sanu","08/04/2005","c"));
	for(Integer rollNo:hashtable.keySet()) {
		hash_table s=hashtable.get(rollNo);
		System.out.println("Roll no:"+ rollNo);
		s.display();
	
}	
	}

}
