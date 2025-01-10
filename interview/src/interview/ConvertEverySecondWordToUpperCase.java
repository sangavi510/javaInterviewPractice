package interview;

public class ConvertEverySecondWordToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "my name is sangavi";
		StringBuilder sb =new StringBuilder();
		String[] words = str.split(" ");
		for(int i=0;i<words.length;i++) {
			char ch[] = words[i].toCharArray();
			
			sb.append(words[i].substring(0,ch.length-1)).append(Character.toUpperCase(ch[ch.length-1])).append(" ");
			
		}
		
		str=sb.toString();
		System.out.println(str);
	}

}
