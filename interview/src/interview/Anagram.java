package interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Anagram {
	public static void main(String args[]) {
String s1="rat";
String s2 = "act";
char[] c1 = s1.toCharArray();
char[] c2 = s2.toCharArray();
Arrays.sort(c1);
Arrays.sort(c2);
System.out.println(Arrays.equals(c1, c2));

}
}
