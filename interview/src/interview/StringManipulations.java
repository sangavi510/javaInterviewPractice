package interview;

public class StringManipulations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "sAn7 gAvi S51 0";
		String s="",d=" ";
		for(int i=0;i<str.length();i++) {
			char c=str.charAt(i);
			if(Character.isAlphabetic(c))
				s+=c;
			if(Character.isDigit(c))
				d+=c;
		}
		s=d+s;
		System.out.println("String with digit first and alphabets next" +s);
		
		//remove space
		
		String res="";
		for(int i=0;i<str.length();i++) {
			char c=str.charAt(i);
		
		if(!Character.isSpace(c))
			
			res+=c;}
		
		
	
		System.out.println("String after removal of white spavcves "+res);
		
		
		String s1="";
		for(int i=0;i<str.length();i++) {
			char c=str.charAt(i);
			if(Character.isUpperCase(c))
				s1+=c;
			
		}
		
		System.out.println("String with Uppercases only " +s1);
		
		String s2="";
		for(int i=0;i<str.length();i++) {
			char c=str.charAt(i);
			if(Character.isLowerCase(c))
				s2+=c;
			
		}
		
		System.out.println("String with Uppercases only " +s2);
		
		
		String s3="";
		for(int i=0;i<str.length();i++) {
			char c=str.charAt(i);
			if(Character.isUpperCase(c))
				s3+=Character.toLowerCase(c);
			else
				s3+=Character.toUpperCase(c);
			
		}
		
		System.out.println("String with changed cases " +s3);
		
		String rev="";
		for(int i=0;i<str.length();i++) {
			char c=str.charAt(i);
				rev=c+rev;	
		}
		
		System.out.println("Reversed string " +rev);
		
		
		
		
		
	}
}
