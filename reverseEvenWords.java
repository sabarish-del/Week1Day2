package week1Day2;

public class reverseEvenWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String test = "I am a software tester";
		String[] split = test.split("");
		for (int i = 0; i < split.length; i++) {
			if(i%2!=0)
			{
				char[] charArray = split[i].toCharArray();
				String rev="";
				for (int j = charArray.length-1; j >=0; j--) {
					rev=rev+charArray[j];
					
				}
				System.out.println(rev);
			}
			else
			{
				System.out.println(split[i]);
			}
		}

	}

}
