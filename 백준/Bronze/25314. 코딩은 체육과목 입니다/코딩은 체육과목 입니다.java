import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
    
           int N = sc.nextInt(); 
           int answer = N/4;
    
        for(int i=0; i<answer; i++) {
            System.out.println("long");
        }
    System.out.println("int");
    sc.close();
    }
}