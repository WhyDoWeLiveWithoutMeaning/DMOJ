package CCC.y21.S1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        double totalA = 0;
        int[] slants = new int[n+1], dist = new int[n];
        for(int i = 0;  i < slants.length; i++) slants[i] = in.nextInt();
        for(int i = 0;  i < dist.length; i++) dist[i] = in.nextInt();
        for (int i = 1; i < n+1; i++){double ar = (double)dist[i-1] * ((double) (slants[i] + slants[i-1]) / 2.0);totalA += ar;}
        System.out.print(totalA);
    }
    
}
