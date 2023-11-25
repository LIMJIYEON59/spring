package codingtest;

//'abcd' -> 'dbca' 문자열 뒤집기
public class Test01 {
	public static void main(String[] args) {
		char[] orgArr = {'a','b','c','d'};
		System.out.println(orgArr);
		
		for(int i=0; i<orgArr.length/2; i++) {
			//swap -> 두 변수의 위치를 바꾸겠다.
			char temp = orgArr[i];
			orgArr[i] = orgArr[orgArr.length-1-i];
			orgArr[orgArr.length-1-i] = temp;
		}
		
		System.out.println(orgArr);
	}

}
