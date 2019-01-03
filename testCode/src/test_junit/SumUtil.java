package test_junit;

public class SumUtil {
	public static int sum1(int i, int j) {
		return i + j;
	}
	
	public static int sum2(int i, int j, int k) {
		return i + j + k;
	}
	
	public static void main(String[] args) {
		System.out.println(sum1(1, 2));
		System.out.println(sum2(1, 2, 3));
	}
}
