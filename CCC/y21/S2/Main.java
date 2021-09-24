package CCC.y21.S2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in); // Scanner
        boolean[][] grid = new boolean[in.nextInt()][in.nextInt()]; //Declare Array
        for(int i=0;i<grid.length;i++){for(int j=0;j<grid[0].length;j++){grid[i][j]=false;}} // Initialize Array
        int n=in.nextInt();while(n-->0){if('R'==in.next().charAt(0)){for(int j=0,row=in.nextInt()-1;j<grid[0].length;j++){grid[row][j]=!grid[row][j];}}else{for(int j=0,row=in.nextInt()-1;j<grid.length;j++){grid[j][row]=!grid[j][row];}}} // Do task
        int total=0;for(int i=0;i<grid.length;i++){for(int j=0;j<grid[0].length;j++){if(grid[i][j])total++;}} // Check Total
        System.out.println(total); //Output Result
    }
}
