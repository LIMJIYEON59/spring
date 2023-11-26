package codingtest;

import java.util.Scanner;

/*+어렵다,,, 계속 풀어보기...
 정수와 문자로 이루어진 문자열을 인자로 입력 받아 정수를 반환하는 함수가 있다. 아래에서 설명하는 인수에 대한 설명에서 규칙을 찾고 함수를 완성하시오.
 인수 설명 인수 문자열은 총 6자리 첫 번째 자리, 세 번째 자리, 다섯 번째 자리는 1~9 
 사이의 정수 두 번째 자리, 네 번째 자리, 마지막 자리는 S(Single) 또는 D(Double) 또는 T(Triple) 중 하나 인수 값과 반환 값 
 예제 인수: “1S2D3T", 반환: 14 인수: “7D2S9S", 반환: 25
*/
public class Test08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String inputStr = sc.nextLine(); //1S2D3T, 7D2S9S
		char[] input = inputStr.toCharArray();
		int result = 0;
		
	for(int i = 1; i < 6; i+=2) {
		switch (input[i]) {
		case 'S':
			result += input[i-1]-'0'; //Integer.paserInt()대신 char '1'을 숫자 1로 만들기 위해 char '1' - '0' 빼면 ascii 코드값에 의해 숫자 값이 나옴
			break;

		case 'D':
			result += (input[i - 1]- '0')*2;
			break;
		
		case 'T':
			result += (input[i - 1]- '0')*3;
			break;
		default:
			break;
		}
	}
	System.out.println(result); //14, 25
	}

}
