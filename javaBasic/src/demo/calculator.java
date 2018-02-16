package demo;

public class calculator {

	public int add(int a, int b) { // a & b are called as formal parameters
		return (a + b);
	}
	public int add(int a, int b, int c) {
		return(a +b +c);
	}

	public void substract(int a, int b) {
		System.out.println(a - b);

	}

	public void multiply(int a, int b) {
		System.out.println(a * b);

	}

	public static void main(String[] args) {
		calculator basiCal = new calculator();
		System.out.println(basiCal.add(20, 30));
		System.out.println(basiCal.add(10, 20));
		System.out.println(basiCal.add(50, 60));
		System.out.println(basiCal .add(2, 1, 3));

		basiCal.add(2, 4, 2); // 10,20 are called as actual parameters
		basiCal.add(20, 30);
		basiCal.add(50, 60);
		basiCal.multiply(15, 6);
		basiCal.substract(70, 60);

	}
}
