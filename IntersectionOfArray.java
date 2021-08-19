package week1Day2;

public class IntersectionOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr1= {3,2,11,4,6,7};
		int[] arr2= {1,2,8,4,9,7};
		
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if(arr1[i]==arr2[j])
				{
					System.out.println("intersection value is"  +arr1[i] );
				}
				
			}
			
		}

	}

}
