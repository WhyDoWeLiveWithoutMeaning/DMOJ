package CCC.y20.J2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int p=in.nextInt(),n=in.nextInt(),r=in.nextInt(),d=1,t=0;
        t = n*1;
        while(t <= p) {t+= r==1?n:n*Math.pow(r, d);d++;}
        System.out.println(--d);
    }
}
