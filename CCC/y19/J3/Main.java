package CCC.y19.J3;

import java.util.Scanner;
import java.util.regex.*;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Pattern p = Pattern.compile("(.)\\1+|(.)"); // FUCKING DIE AOGINJFIASUIFUEBNILPABDOUILBDAFLIJL Literally took 1 hour to figure out why this wasn't working properly
        int n = in.nextInt();
        String[] ans = new String[n];
        for(int i = 0; i < n; i++){
            Matcher line = p.matcher(in.next());
            ans[i] = "";
            while(line.find()){
                String s = line.group();
                ans[i] += s.length() + " " + s.charAt(0) + " ";
            }
        }
        for(String e : ans) System.out.println(e);
    }
}
