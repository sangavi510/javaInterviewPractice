package interview;

public class ReverseWordsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String word = " My name is Sangavi";
		System.out.println(word);
		StringBuilder sb = new StringBuilder(word);
		word =  sb.reverse().toString();
		System.out.println(word);
		String arr[]= word.split(" ");
		StringBuffer sb1 = new StringBuffer();
		for(int i=arr.length-1;i>=0;i--) {
			 sb1.append(arr[i]).append(" ");
		}
		
		String printWord = sb1.toString();
		System.out.println(printWord);

	}

}
