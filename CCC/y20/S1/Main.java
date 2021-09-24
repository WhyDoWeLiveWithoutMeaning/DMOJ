package CCC.y20.S1;

import java.io.*;

public class Main{
    public static void main(String[] args){
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        try {
            //Amount of Values
            int n = Integer.parseInt(in.readLine());

            //Prepare for Value Input
            double[][] td = new double[n][2];

            double fastestSpeed = 0.0;
            double newSpeed;

            //Get Time and Distance
            for (int i = 0; i < n; i++) {
                String[] next = in.readLine().split(" ");
                td[i][0] = Integer.parseInt(next[0]);
                td[i][1] = Integer.parseInt(next[1]);
            }

            //Quick sort
            quickSort(td, 0, td.length-1);

            //Get the Largest Distance/Time
            for (int i = 1; i < td.length; i++) {
                newSpeed = Math.abs(td[i - 1][1] - td[i][1]) / (td[i - 1][0] - td[i][0]);

                if (fastestSpeed > Math.abs(newSpeed) * -1)
                    fastestSpeed = newSpeed;
            }

            //Return
            System.out.print(Math.abs(fastestSpeed));
        } catch(IOException e){
            e.printStackTrace();
        }
    }
    
    static int partition(double[][] array, int begin, int end) {
        int pivot = end;

        int counter = begin;
        for (int i = begin; i < end; i++) {
            if (array[i][0] < array[pivot][0]) {
                double[] temp = array[counter];
                array[counter] = array[i];
                array[i] = temp;
                counter++;
            }
        }
        double[] temp = array[pivot];
        array[pivot] = array[counter];
        array[counter] = temp;

        return counter;
    }

    public static void quickSort(double[][] array, int begin, int end) {
        if (end <= begin) return;
        int pivot = partition(array, begin, end);
        quickSort(array, begin, pivot-1);
        quickSort(array, pivot+1, end);
    }
}