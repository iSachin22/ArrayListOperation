import java.util.Collections;
import java.util.ArrayList;
import java.util.Vector;
import java.util.Scanner;
class ArrayListOperation{
	public static void main(String args[]){
	  Scanner sc=new Scanner (System.in);
		ArrayList<Integer> al=new ArrayList<>();
		System.out.println("Enter How many values you want to add ? ");
		int n=sc.nextInt();
		for(int i=0;i<n;i++){
		   al.add(sc.nextInt());
		}
		System.out.println("Array list size is = "+al.size());
		//System.out.println("Array list value at 4th Index is = "+al.get());
          al.add(2,20);
System.out.println("Array list size after add element at second index is is = "+al.size());
System.out.println("Array list size after replace element at n index is = "+al.set(3,45));
  // for removing values on specific index.....
      al.remove(1);
		for(int i=0; i<al.size() ; i++){
			Object obj=al.get(i);
			System.out.println(obj);
		}
		
		
	}
}
