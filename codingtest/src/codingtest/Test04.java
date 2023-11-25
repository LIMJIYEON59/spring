package codingtest;

import java.util.Scanner;

//월을 입력받아 해당월의 일수를 출력하는 프로그램을 작성하시오.(switch 이용)
public class Test04 {
	public static void main(String[] args) {
		Scanner sc = null;
		try {
			sc = new Scanner(System.in);
			int month = Integer.parseInt(sc.nextLine());
			int result = 0; //기본값
			switch(month) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				result = 31;
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				result = 30;
				break;
			case 2:
				result = 28;
				break;
			default:
				System.out.println("1-12 입력해주세요.");
				break;
			}
			System.out.println(result);
		} catch (NumberFormatException e) {
			System.out.println("정수만 입력해주세요");
		}finally {
			if(sc != null)sc.close();
		}
	}

}
