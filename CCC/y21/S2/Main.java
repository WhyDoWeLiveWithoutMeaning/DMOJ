package CCC.y21.S2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int[] x = new int[in.nextInt()];
        int[] y = new int[in.nextInt()];
        int n=in.nextInt();
        while(n-->0){
            if('R'==in.next().charAt(0)){
                x[in.nextInt()-1]++;
            } else {
                y[in.nextInt()-1]++;
            }
        }
        int total=0;
        for(int i : x){
            for(int j : y){
                if((i+j)%2!=0) total++;
            }
        }
        System.out.println(total);
    }
}

