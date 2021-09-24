package CCC.y20.J4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String text = in.next();
        String str = in.next();
        if(str.length()>text.length()){
            System.out.println("no");
            return;
        }
        for(int i = 0; i < str.length(); i++){
            if (text.contains(str)){
                System.out.println("yes");
                return;
            }
            str = Shift(str);
        }
        System.out.println("no");
    }

    public static String Shift(String str){
        return str.charAt(str.length()-1) + str.substring(0, str.length()-1);
    }
}
