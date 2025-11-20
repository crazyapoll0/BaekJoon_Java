import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 시험 본 과목의 개수
		int N = sc.nextInt();
		int[] arr = new int[N];
		
		for(int i=0; i<N; i++) {
			arr[i] = sc.nextInt();                    
        } 
		
		// 점수 중 최대값
		int M = arr[0];
		for(int i= 0; i<N; i++) {
			if(arr[i] > M ) {
				M = arr[i];
			}
		}
		
		// 입력받은 점수/M*100
		double sum = 0;
		for(int i=0; i<N; i++) {
			sum += (double)arr[i]/M*100; 
		}
		
		// 평균출력 
		double avg = sum / N;
		System.out.println(avg);
	    sc.close();
	}
}


	