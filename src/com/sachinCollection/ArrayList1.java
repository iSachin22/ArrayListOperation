
package com.sachinCollection;

import java.util.*;
public class ArrayList1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		ArrayList l=new ArrayList();
		
		System.out.println("1: Show List \n2: Add itom \n3: Delet itom \n4: Search itom ");
	
		do {
			System.out.println("Enter your Choice : ");
			int n=sc.nextInt();
			switch(n){
				
			case 1:
				for(Object obj: l) {
					System.out.print(obj+" ");
				}
				System.out.println();
				break;
				
			case 2:
				System.out.println("Enter Item you want to add?   ----> ");
				int newList=sc.nextInt();
					for(int i=0;i<newList;i++){
						l.add(sc.nextInt());
					}
				break;
				
			case 3:
				System.out.println("Enter Item for Delete: ");
				int d=sc.nextInt();
				for(int i=0;i<l.size();i++) {
					
					if(l.contains(d)) {
						l.remove(l.indexOf(d));
					}
				}
				break;
				
			case 4:
				System.out.println("Enter item for Search: ");
				int no=sc.nextInt();
				boolean p=l.contains(no);
				if(p) {
				System.out.println("item present int the list at "+l.indexOf(no)+" ");
				}else {
					System.out.println("Item not Present!!!!!!!!");
				}
				break;
			
			default:
				System.out.println("Exit successfully!!!!!!!!!!!");
				
			}
	       }
		while(true);
		
	}

}
