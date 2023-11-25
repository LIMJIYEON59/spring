package codingtest;

import java.util.Scanner;

//숫자를 입력받아 해당 숫자의 팩토리얼(5*4*3*2*1) 값을 출력하는 프로그램을 작성하시오.
//(재귀함수 말고 while문은 사용해서)
public class Test03 {
	 public static void main (String args[]) {
		 Scanner sc = null;
		 try {
			sc = new Scanner(System.in); //사용자로부터 데이터를 읽기 위한 스트림이다.(키보드로부터 입력을 받는 데 사용됨)
			int num = Integer.parseInt(sc.nextLine()); // 문자열(nextLine)입력 받고 -> 정수로 변환(nextInt 방법 보다는 안전하다.)
			int result = 1; //곱하기 연산을 위해 1 기본값
			while(num > 0) {
				result *= num;
				num--;
			}
			System.out.println(result);
		} catch (NumberFormatException e) {
			System.out.println("정수만 입력해주세요.");
		}finally {
			if(sc != null)sc.close(); //사용한 자원 해제
		}
	 }
}

/*
Scanner stdin = new Scanner(System.in);
System.out.print("원하는 팩토리얼 값을 입력 : ");

int fac = stdin.nextInt();
System.out.print(fac+"! = ");
int facValue = fac;
while(fac>1){
 System.out.print(fac+"*");
 fac--;
 facValue=facValue*fac;
}

System.out.print("1 = " + facValue);
stdin.close();
*/
