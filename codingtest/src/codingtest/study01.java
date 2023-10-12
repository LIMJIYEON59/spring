package codingtest;

public class study01 {
	public static void main(String[] args) {
		int sum=0;
		int i;
		
		for(i=2; i<=10; i+=2) {
			sum+=i;
		}
		System.out.println("짝수들의 누적합:" +sum);
	}
}
