package compressthestring;

public class susobhan {
	
	static void compressedString(String str) {
		
		
		int n =str.length();
		for(int i =0;i<n;i++) {
			int  count= 1;
			while(i<n-1&&str.charAt(i)==str.charAt(i+1)) {
				count++;
				i++;    //word same hoga to  count hota jayaga and i vi barta jayaga
			}
			
			
			if(count ==1) {
				System.out.print(str.charAt(i));
				
			}
			else {
				System.out.print(str.charAt(i));
				System.out.print(count);
			}
		}
		
	}
	public static void main(String args[]) {
		String str= "aaabbbwe";
		compressedString(str);
		
	}

}
