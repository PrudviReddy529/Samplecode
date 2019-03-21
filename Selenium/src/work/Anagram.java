package work;

public class Anagram {

	public static void main(String[] args) {
		
		
		String str ="prudhvi";
		String str1 = "ihvuprd";
		
		int totalchars1 = str.length();
		int totoalchars2 = str1.length();
		//boolean isOrder = true;
		
		for(int i=0;i<=totalchars1-1;i++){
			String mychar = str.substring(i, i+1);
			for(int j=0;j<=totoalchars2-1;j++){
				String mychar1 = str1.substring(j, j+1);
				if(mychar.equalsIgnoreCase(mychar1)){
					str= str.replaceFirst(mychar, "");
					str1= str1.replaceFirst(mychar1, "");
					i--;
					totalchars1--;
					totoalchars2--;
					break;
				}else {
					System.out.println("given string is not anagram :");
				}
				
			}
		}
		
		
	}

}
