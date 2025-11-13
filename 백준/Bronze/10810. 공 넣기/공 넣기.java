import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); 	//바누기 개수
        int M = sc.nextInt();	//공을 넣는 횟수
        int arr[] = new int[N + 1]; //1~N번 바구니
        
        for(int a=0; a<M; a++) {
            int i = sc.nextInt(); 
            int j = sc.nextInt();
            int k = sc.nextInt();
        
        // i~j 바구니에 k공 넣기 
        for(int b=i; b<=j; b++) {
        	arr[b] = k;
        	}
        }
        
        // 결과 출력
        for (int answer = 1; answer <= N; answer++) {
            System.out.print(arr[answer] + " ");
        }         
        sc.close();
	}
}
