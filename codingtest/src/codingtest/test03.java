package codingtest;

import java.util.Scanner;

//숫자를 입력받아 해당 숫자의 팩토리얼(5*4*3*2*1) 값을 출력하는 프로그램을 작성하시오.
//(재귀함수 말고 while문은 사용해서)
public class test03 {
	 public static void main (String args[]) {
		 
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
	 }
}

