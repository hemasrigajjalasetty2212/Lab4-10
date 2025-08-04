package pac1;

public class lab9 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "apple";
		System.out.println(str1+str1);
		
		int len = str1.length();
		System.out.println("Length: "+len);
		
		StringBuilder str2= new StringBuilder(str1);
		
		
		for (int i=0; i<len; i++) {
			if (i%2!=0) {
				str2.setCharAt(i,'#');
			}
			
		}
		System.out.println("Odd replacement: "+str2);
		
		StringBuilder result = new StringBuilder();
		for (int j=0; j<len; j++) {
			char ch = str1.charAt(j);
			if (result.indexOf(String.valueOf(ch)) == -1) {
				result.append(ch);
			}
			
		}
		System.out.println("Duplicates removed: "+result);
	
 
		StringBuilder str3 = new StringBuilder();
		for (int k=0; k < str1.length(); k++) {
			char ch = str1.charAt(k);
			if(k%2!=0) {
				str3.append(Character.toUpperCase(ch));
			}else {
				str3.append(ch);
			}
		}
		System.out.print("Odd to upper case: "+str3);
	}

}
