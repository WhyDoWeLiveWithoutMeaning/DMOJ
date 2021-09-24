package CCC.y20.J3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int left=100, right=0,top=0,bottom=100;
        int n = in.nextInt();
        while(n-->0){
            String[] coord = in.next().split(",");
            int x = Integer.parseInt(coord[0]);
            int y = Integer.parseInt(coord[1]);
            if (x > right) right = x;
            if (x < left) left = x;
            if (y > top) top = y;
            if (y < bottom) bottom = y;
        }
        System.out.println(String.format("%d,%d\n%d,%d", left-1, bottom-1, right+1, top+1));
    }
}