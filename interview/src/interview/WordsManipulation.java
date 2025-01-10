package interview;


public class WordsManipulation {
	public static void main(String[] args) {
		
		
		
		//Printing each word of a sentence in separate line
		System.out.println("Printing each word of a sentence in separate line");
		String str ="I amdfgtyghikuyt a womanizerse living in Puducherry educationser";
		String w="";
		str+=" ";//adding space for loop to iterate
		for(int i=0;i<str.length();i++) {
			char ch =str.charAt(i);
			if(ch!=' ')
				w+=ch;
			else
			{System.out.println(w);
			w="";}
		}
		
		//Print the first character of each word in a sentence

		System.out.println("Print the first character of each word in a sentence");
		for(int i=0;i<str.length();i++) {
			char ch =str.charAt(i);
			if(ch!=' ')
				w+=ch;
			else
			{System.out.println(w.charAt(0));
			w="";}
		}

		//Print the first 2 characters of each word in a sentence
		System.out.println("Print the first 2 characters of each word in a sentence");
		for(int i=0;i<str.length();i++) {
			char ch =str.charAt(i);
			if(ch!=' ')
				w+=ch;
			else
			{
				if(w.length()>1)
					System.out.println(w.substring(0,2));
				else
					System.out.println(w);
				w="";}
		}

		//	Print a word starting with a particular letter or string
		System.out.println("Print a word starting with a 'a' ");
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(ch!=' ')
				w+=ch;
			else
			{if(w.startsWith("a"))
				System.out.println(w);
			w="";}
		}

		//Print word ending with a particular letter or string
		System.out.println("Print word ending with a 'm' ");
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(ch!=' ')
				w+=ch;
			else
			{if(w.endsWith("m"))
				System.out.println(w);
			w="";}
		}

		//Print word containing a particular letter or string
		System.out.println("Print word containing with a 'a' ");
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(ch!=' ')
				w+=ch;
			else
			{if(w.contains("a"))
				System.out.println(w);
			w="";}
		}

		//Print words having particular number of characters

		System.out.println("Print words having length 2 ");
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(ch!=' ')
				w+=ch;
			else
			{if(w.length()==2)
				System.out.println(w);
			w="";}
		}
		//Printing string with special characters
		System.out.println("Print special words");
		String str1="mom or dad value";
		for(int i=0;i<str1.length();i++) {
			char ch = str1.charAt(i);
			if(ch!=' ')
				w+=ch;
			else
			{char f=w.charAt(0);
			char l=w.charAt(w.length()-1);
			if(f==l)
				System.out.println(w);
			w="";}
		}
		//Find longest word in a sentence in Java
		System.out.println("Find longest word in a sentence in Java");

		String lw="";
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(ch!=' ')
				w+=ch;
			else
			{if(w.length()>lw.length())
				lw=w;

			w="";}
		}
		System.out.println(lw);
		//Find a particular word in a string
		System.out.println("Find a particular word in a string");
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(ch!=' ')
				w+=ch;
			else
			{if(w.contains("Puducherry"))
				System.out.println("Yes it exists");
			w="";}
		}

		//Count number of words in a sentence in Java
		System.out.println("Count number of words in a sentence in Java");
		int count=0;
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(ch!=' ')
				w+=ch;
			else
			{count++;
			w="";}}

		System.out.println(count);


		//Count number of words ending with a particular letter
		System.out.println("Count number of words ending with 'n'");
		int countWords=0;
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(ch!=' ')
				w+=ch;
			else
			{if(w.endsWith("n"))
				countWords++;
			w="";}}

		System.out.println(countWords);

		//Changing a word with another in Java
		System.out.println("Change puducherry to chennai");
		String res = "";
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(ch!=' ')
				w+=ch;
			else
			{if(w.equals("Puducherry"))
				res=res+"Pune"+" ";
			else 
				res=res+w+" ";
			w="";}
		}

		System.out.println(res);
		//Deleting a word in java

		//Changing a word with another in Java
		System.out.println("Delete Puducherry from string");
		String res1 = "";
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(ch!=' ')
				w+=ch;
			else
			{if(w.equalsIgnoreCase("Puducherry"))
				res1=res1+"";
			else 
				res1=res1+w+" ";
			w="";}
		}

		System.out.println(res1);
		//Changing case of word in Java
		System.out.println("Changing case of word in Java");
		String change = "";
		int count1=0;
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(ch!=' ')
				w+=ch;
			else
			{ 
				if(count1++ %  2 !=0) 
					change+=w.toUpperCase()+" ";
				else
					change+=w.toLowerCase()+" ";



				w="";}}

		System.out.println(change);


		//Changing second letters of every word to uppercase
		System.out.println("Changing second letters of every word to uppercase");
		String changeCase = "";
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(ch!=' ')
				w+=ch;
			else
			{ 
				char temp=w.charAt(0);
				char f=Character.toLowerCase(temp);
				if(w.length()==2 || w.length()>2)
				{char temp1=w.charAt(1);
				char f1=Character.toUpperCase(temp1);
				if(w.length()>2)
					changeCase=changeCase+f+f1+w.substring(2)+" ";
				else if(w.length()==2)
					changeCase=changeCase+f+f1+" ";
				else
					changeCase=changeCase+f+" ";


				w="";}}
		}
		System.out.println(changeCase);

		// Swap first and last letter of each word in Java
		System.out.println("Swap first and last letter of each word in Java");
		String fin = "";
		String sample="Sangavi BTech ECE Accenture";
		sample+=" ";
		for(int i=0;i<sample.length();i++) {
			char ch = sample.charAt(i);
			if(ch!=' ')
				w+=ch;
			else
			{ 
				char first=w.charAt(0);
				char last =w.charAt(w.length()-1);
				String middle =w.substring(1,w.length()-1);
				
				fin=fin+last+middle+first+" ";
				


				w="";}}
		System.out.println(fin);
		
		
		
	}


}


