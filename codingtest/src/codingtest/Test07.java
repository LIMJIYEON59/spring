package codingtest;

// 1-10,000까지의 수 중 3, 6, 9의 개수를 구하는 코드
public class Test07 {
    public static void main(String[] args) {
        int nCount = 0;
        for (int i = 1; i <= 10000; i++) {
            int n = i;
            while (n > 0) {
                int m = n % 10;
                if (m == 3 || m == 6 || m == 9) {
                    nCount++;
                }
                n = n / 10;
            }
        }
        System.out.printf("3,6,9 개수 :%d \n", nCount);
    }
}