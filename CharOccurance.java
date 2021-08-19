package week1Day2;

import java.util.Iterator;

public class CharOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="Welcome to chennai";
		char[] charArray = str.toCharArray();
		int count=0;
		int length = str.length();
		for (int i = 0; i < charArray.length; i++) {
			if(charArray[i]=='e')
			{
				
				count++;
				System.out.println("The character e appear " + count);
			
		}
			
		}

	}

}
