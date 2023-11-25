package codingtest;

//0 부터 10 까지의 합을 구하는 메소드를 생성하고 main 에서 호출, 합을 출력하는 프로그램을 작성하시오.
public class Test06 {
	public static void main(String[] args) { // 여기서 호출
		System.out.println(sumZeroToMax(10)); //괄호 10의미: 0부터 10까지의 숫자를 더한 합을 계산해라
	}
		//main에서 호출될 메소드는 static이어야 한다.
		//sumZeroToMax라는 메소드를 따로 정의한 이유: 코드를 모듈화하고 재사용이 가능하도록 하기 위해
		private static int sumZeroToMax(int maxNum) {
			int result = 0;
			for(int i=0; i<=maxNum; i++) {
				result += i;
			}
			return result;
		}
	}


