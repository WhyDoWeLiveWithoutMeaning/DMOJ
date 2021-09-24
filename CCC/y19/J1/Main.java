package CCC.y19.J1;

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a = (in.nextInt()*3)+(in.nextInt()*2)+(in.nextInt()), b = (in.nextInt()*3)+(in.nextInt()*2)+(in.nextInt());
        System.out.println(a>b?"A":a==b?"T":"B");
    }
}