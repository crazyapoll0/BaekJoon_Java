import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	    int[] N = new int[31];  // 1~30번 학생

        // 배열 초기화: 1~30번 학생 번호
        for (int i = 1; i <= 30; i++) {
            N[i] = i;
        }

        // 28명 입력받아서 제출 체크 
        for (int i = 0; i < 28; i++) {
            int M = sc.nextInt();
            N[M] = 0;  // 제출했으니까 0으로 표시
        }

        // 제출 안 한 학생 출력
        for (int i = 1; i <= 30; i++) {
            if (N[i] != 0) {
                System.out.println(N[i]);
            }
        }
        sc.close();
    }
}

	