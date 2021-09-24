package CCC.y19.J5;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.*;
public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String[][] rules = new String[3][2];
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 2; j++){
                rules[i][j] = in.next();
            }
        }
        int needSteps = in.nextInt();
        String starting = in.next();
        String ending = in.next();
        ArrayList<String> solved = Solve(needSteps, 0, starting, ending, rules);
        for(String e : solved) System.out.println(e);
    }
    public static ArrayList<String> Solve(int need, int went, String curr, String end, String[][] rules){
        for (int i = 0; i < 3; i++){
            Pattern p = Pattern.compile(String.format("(?=(%s)).", rules[i][0]));
            Matcher matches = p.matcher(curr);
            while(matches.find()){        
                String replaced = curr.substring(0, matches.start()) +  rules[i][1] + curr.substring(matches.end()+(rules[i][0].length()-1));                
                if (replaced.length() > 50) continue;           
                ArrayList<String> instruction = new ArrayList<String>(); 
                instruction.add(String.format("%d %d %s", i+1, matches.start()+1, replaced));
                if (went+1 == need && replaced.equals(end)){
                    return instruction;
                } else {
                    if (went+1 == need) continue;
                    ArrayList<String> ans = Solve(need, went+1, replaced, end, rules);
                    if (ans.size() != 0){
                        instruction.addAll(ans);
                        return instruction;
                    }
                }
            }
        }
        ArrayList<String> p = new ArrayList<String>();
        return p;
    }
}
