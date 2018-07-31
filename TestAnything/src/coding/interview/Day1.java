package coding.interview;

import java.nio.file.attribute.AclEntry.Builder;
import java.util.HashSet;

import org.junit.Test;

public class Day1 {
	
	
	/*
	 * 
	 *  If the number is divisible by 3, output "Fizz".
	 *  If the number is divisible by 5, output "Buzz". 
	 *  If the number is divisible by both 3 and 5, output "FizzBuzz"
	 */
	@Test
	public void fizzBuzz() {
		for(int i = 1; i <= 100; i++) {
			if(i%3 == 0 && i%5 == 0) {
				System.out.println("FizzBuzz");
			} else if(i%3 == 0) {
				System.out.println("Fizz");
			} else if(i%5 == 0) {
				System.out.println("Buzz");
			} else {
				System.out.println(i);
			}
		}
		
	}
	
	
	/*
	 * Write a function that takes 3 booleans and return true if at least two of them are true
	 */
	@Test
	public void testAtLeastTwo() {
		for(int i = 0; i < 2; i ++)
			for(int j = 0; j < 2; j++)
				for(int k = 0; k < 2; k++) {
					System.out.print("" + (i==0) + " " + (j==0) + " " + (k==0) + "  ");
					System.out.println(atLeastTwo(i==0, j==0, k==0));
				}
	}
	public boolean atLeastTwo(boolean a, boolean b, boolean c) {
		return a? b||c : b&&c;
	}
	
	
	
	/*
	 * Given a string, write a function that returns a string 
	 * that contains the same characters in the reverse order.
	 */
	@Test
	public void testReverse() {
		String str = "123456789";
		System.out.println(reverse(str));
	}
	public String reverse(String str) {
		StringBuilder strBuilder = new StringBuilder();
		char[] charArray = str.toCharArray();
		int len = str.length();
		for(int i = 0; i < len; i++) {
			strBuilder.append(charArray[len-i-1]);
		}
		
		return strBuilder.toString();
	}
	
	
	/*
	 * Given two strings, write a function to check if one string is a rotation of the other
	 */
	@Test
	public void testIsRotation() {
		System.out.println(isRotation("solution", "lutionso"));
	}
	public boolean isRotation(String ss, String tt) {
		return ss.length() == tt.length() && (ss + ss).indexOf(tt) != -1;
	}
	
	/*
	 * Given a string, write a function that checks to see if every character in the string is unique
	 */
	@Test
	public void testUnique() {
		System.out.println(isUnique("123456789"));
		System.out.println(isUnique("asdfggas"));
		System.out.println(isUnique("1234567896asdh"));
	}
	public boolean isUnique(String str) {
		if(str.isEmpty())
			return false;
		
		char[] charArray = str.toCharArray();
		HashSet<Character> map = new HashSet<>();
		for(int i = charArray.length-1; i >= 0; i--) {
			if(map.contains(charArray[i])) {
				return false;
			} else {
				map.add(charArray[i]);
			}
		}
		
		return true;
	}
	
	
	/*
	 * Given a string, write a function that returns the string with all duplicate characters removed.
	 */
	@Test
	public void testRemoveDuplicate() {
		System.out.println(removeDuplicate("123456789"));
		System.out.println(removeDuplicate("1234123124712894127057345823281856789"));
		System.out.println(removeDuplicate("1234aaaaaaaaaaaa5678sssss9"));
		
	}
	
	public String removeDuplicate(String str) {
		if(str == null || str.isEmpty())
			return str;
		char[] charArray = str.toCharArray();
		HashSet<Character> map = new HashSet<>();
		StringBuilder builder = new StringBuilder();
		for(int i = 0; i < charArray.length; i++) {
			if(!map.contains(charArray[i])) {
				map.add(charArray[i]);
				builder.append(charArray[i]);
			}
		}
		
		return builder.toString();
	}
	
	
	/*
	 * Given a string that contains words separated by spaces, write a function that reverses the order of the words.
	 */
//	@Test
//	public void testWordReverse() {
//		System.out.println(wordReverse("you are my love best"));
//	}
//	public String wordReverse(String str) {
//		String[] splits = str.split(" ");
//		StringBuilder builder = new StringBuilder();
//		for(int i = splits.length-1; i >=0; i--) {
//			builder.append(splits[i]);
//			if(i != 0)
//				builder.append(' ');
//		}
//		return builder.toString();
//	}
	
}
