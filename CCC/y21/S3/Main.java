package CCC.y21.S3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        // Get Data
        int n = in.nextInt();
        final long startTime = System.currentTimeMillis();
        int[][] friends = new int[n][3];

        int lowest = 1000000001, highest = 0;

        for(int i = 0; i < n; i++) {
            int p = in.nextInt();
            if (p > highest) highest = p;
            if (p < lowest) lowest = p;
            friends[i][0] = p;
            friends[i][1] = in.nextInt();
            friends[i][2] = in.nextInt();
        }

        // Brute Force
        long leastTime = Long.MAX_VALUE;

        for(int i = lowest; i <= highest; i++){
            long totalT = 0;
            for(int[] friend : friends){
                int dist = Math.max(i, friend[0]) - Math.min(i, friend[0]); // Distance from position
                int walkingDist = 0;
                if (dist > friend[2]) walkingDist = dist-friend[2];
                totalT += walkingDist*friend[1];
            }
            // System.out.println(String.format("Position: %d, Time: %d",i, totalT));
            if (totalT < leastTime) leastTime = totalT;
        }

        System.out.println(leastTime);
        final long endTime = System.currentTimeMillis();
        System.out.println("Total execution time: " + (endTime - startTime));
    }
}
