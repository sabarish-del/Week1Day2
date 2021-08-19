package week1Day2;

public class MyCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator assignment = new Calculator();
		int add = assignment.add(1, 2, 3);
		System.err.println(add);
		int sub = assignment.sub(6,3);
		System.out.println(sub);
		double mul = assignment.mul(4, 6);
		System.out.println(mul);
		float divide = assignment.divide(6,2);
		System.out.println(divide);

	}

}
