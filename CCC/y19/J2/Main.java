package CCC.y19.J2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int l = in.nextInt();
        String[] ans = new String[l];
        for(int i=0; i < l; i++){
            String p = "";
            int j=in.nextInt();
            char d = in.next().charAt(0);
            for(; j > 0; j--){
                p+=d;
            }
            ans[i]=p;
        }
        for(String e:ans) System.out.println(e);
    }
    
}
