package CCC.y20.J1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println((in.nextInt()+(2*in.nextInt())+(3*in.nextInt()))>=10?"happy":"sad");
    }
}
