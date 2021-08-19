package week1Day2;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text1 = "stops";
		String text2 = "potss"; 
		if(text1.length()==text2.length())
		{
			char[] test1 = text1.toCharArray();
			char[] test2 = text2.toCharArray();
			Arrays.sort(test1);
			Arrays.sort(test2);
			if(Arrays.equals(test1, test2))
			{
				System.out.println("Is Anagram ");
			}
			else
			{
				System.out.println("is not anagram");
			}
		}

	}

}
