package codingtest;

//1부터 100까지 합을 루프문을 이용하여 작성하고, 실행 결과를 출력하시오.
public class Test02 {
	public static void main(String[] args) {
		int a =0;
		int b =0;
		int ab=0;
		
		for(int i = 1; i <=100; i++) {
			if(i % 2 == 1) {
				a += i;
			}
			else {
				b += i;
			}
			ab += i;
		}
		System.out.printf("홀수합:%d, 짝수합:%d, 총합:%d\n", a,b,ab);
	}

}
