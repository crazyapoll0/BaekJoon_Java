import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        
        int N = sc.nextInt(); 	//바누기 개수
        int M = sc.nextInt();	//공바꾸는 횟수
        int arr[] = new int[N + 1]; //1~N번 바구니
        
        //배열 초기화
        for (int a = 1; a <= N; a++) {
            arr[a] = a;
        }
        
        // 공 교환
        for (int a = 0; a < M; a++) {
            int i = sc.nextInt();
            int j = sc.nextInt();
            
         // 교환
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        
        // 결과 출력
        for (int k = 1; k <= N; k++) {
            System.out.print(arr[k] + " ");
        }
        sc.close();
        }
	}