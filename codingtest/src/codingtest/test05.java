package codingtest;

import java.util.Scanner;

//숫자 5개를 입력받아 가장 큰 수를 출력하는 프로그램을 작성하시오.
public class test05 {
	public static void main(String[] args) {
		Scanner sc = null;
		try {
			sc = new Scanner(System.in);
			int maxNum = Integer.MIN_VALUE; //가장 작은 값을 기본값으로 설정함
			for(int i=0; i<5; i++) {
				int inputNum =Integer.parseInt(sc.nextLine());
				if(maxNum <inputNum) { 
					maxNum = inputNum; //최대값을 갱신하는 역할을 한다.
				}
			}
			System.out.println(maxNum);
		} catch (NumberFormatException e) {
			System.out.println("정수를 입력해주세요.");
		}finally {
			if(sc != null)sc.close();
		}
	}

}
