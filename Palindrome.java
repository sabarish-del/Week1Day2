package week1Day2;

public class Palindrome {
	
	public static void main(String args[])
	{
		String str="madam";
		String rev="";
		for (int i = str.length()-1; i >=0; i--) {
			rev=rev+str.charAt(i);	
		}
		if(str.equals(rev))
		{
			System.out.println("Given string is palindrom");
		}
		else
		{
			System.out.println("Given string is not a palindrome");
		}
	}

}
