import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	       
        int N[] = new int[9];
        int max = 0;
        int index = 0; 
        
        for(int i=0; i<9; i++ ) {
        	N[i] = sc.nextInt();
        	
        	if(N[i] > max) {
        		max = N[i];   
        		index = i;		
        	}
        } System.out.println(max+ " " + (index+1));
        	sc.close();
        } 
	}