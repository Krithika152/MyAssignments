package week1.day1;

public class Isprime {

	public static void main(String[] args) {
		int n=10;
		boolean isPrime = true;
		for (int i =2; i<n; i++) {
			if (n%i==0) {
				System.out.println("Non-Prime");
				isPrime=false;
				break;
			}
		}
			if (isPrime==true) {
			System.out.println("Prime");
		}
		

	}
}
