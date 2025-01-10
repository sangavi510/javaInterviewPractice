package interview;

public class LowerUpperCases {

	public static void main(String[] args) {
		String str1="SangAvIShgWJHJJ";
		StringBuffer str = new StringBuffer(str1);
		Character ch ;
		/*for(int i=0;i<str.length();i++)
		{	
			ch=str.charAt(i);
			if(Character.isLowerCase(ch))
				str.replace(i,i+1, Character.toUpperCase(ch)+ "");
			if(Character.isUpperCase(ch))
				str.replace(i,i+1, Character.toLowerCase(ch)+ "");
		}
		
		System.out.println(str);*/
		
		
		String w="";
		
		for(int j=0;j<str1.length();j++) {
			ch=str1.charAt(j);
			if(ch>='a' && ch<='z') {
				ch=(char)(ch-32);
			}
			else {
				ch=(char)(ch+32);
			}
			w+=ch;
		}
		
		System.out.println(w);
	}

}
