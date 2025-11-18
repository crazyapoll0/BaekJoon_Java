import java.util.*;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int B = 42;
        
        HashSet<Integer> set = new HashSet<>();
        
        for(int i=0; i<10; i++) {
            int num = sc.nextInt();
            int r = num % B;
            
            // set에 나머지를 추가
            set.add(r);
        }
        System.out.print(set.size());
        sc.close();
    }
}