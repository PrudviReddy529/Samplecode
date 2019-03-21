package work;

import java.util.Scanner;

public class StringToArray {

	public static void main(String[] args) {
     // power();
		//remove();
		Arraylarge();
	}
	public static  void charArray(){
		
		String val ="This is a java program";
		String c =val.trim();
		char[] ch = c.toCharArray();
		
		for(char charval :ch){
			System.out.println(charval);
		}
	}
	public static void slipt(){
		
	     String str = "This is a java program";
			
	     String[]  allvals = str.trim().split("@");
	    		 
	      for(String val : allvals){
	    	  System.out.println(val);
	      }
	}
	public static void remove(){
		
		String val ="this is a jjvnvnnn java programBB";
		int str = val.length();
		String remove = "";
	for(int i=0; i<= str-1; i++){
		if(!remove.contains(String.valueOf(val.charAt(i)))){
			
		remove+=String.valueOf(val.charAt(i));	
		}
	}
	      System.out.println(remove);
		
	}
	public static void power(){
		Scanner sc = new Scanner(System.in);
		
		System.err.println("enter a values:");
		
		int val = sc.nextInt();
		int results = val*val*val;
		System.out.println(results);
	}
	
	public static void Arraylarge(){
		
		int[] allval = new int[4];
		int val = 0;
		allval[0] = 23;
		allval[1] = 13;
		allval[2] = 63;
		allval[3] = 83;
		
		for(int val1 : allval){
			
			if(val<val1){
				val = val1;
			}
				else if (val<val1){
					val=val1;
				}
				
			else{
				val = val;
			}
			
		}
		System.out.println(val);
		
	}
	
	public static void string(){
		
	}
	
}

