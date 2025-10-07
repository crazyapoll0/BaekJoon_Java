import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int h = sc.nextInt();
        int m = sc.nextInt();
        int c = sc.nextInt();
        
        int total = h*60+m+c;
        
        if (total <0) {
            total += 24*60;
        }
        
        int newh= (total/60)%24;
        int newm= total%60;
        
        System.out.println(newh+" "+newm);
        
    }
}