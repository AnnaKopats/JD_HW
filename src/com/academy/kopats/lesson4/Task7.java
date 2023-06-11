package com.academy.kopats.lesson4;
import java.text.DecimalFormat;

public class Task7 {
    public static void main(String[] args) {
        double[] arr = new double[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Math.cbrt(Math.pow(((Math.random() * (9 - 5.33 + 1)) + 5.33), 2) + 4.5);
        }
        System.out.println("-------------------------------------------------------------------------------");
        System.out.printf("|  A[0] = %.4f  A[1] = %.4f  A[1] = %.4f  A[3] = %.4f A[4] = %.4f    |\n", arr[0], arr[1], arr[2], arr[3], arr[4]);
        System.out.printf("|  A[5] = %.4f  A[6] = %.4f  A[7] = %.4f  A[8] = %.4f A[9] = %.4f    |\n", arr[5], arr[6], arr[7], arr[8], arr[9]);
        System.out.printf("|  A[10] = %.4f A[11] = %.4f A[12] = %.4f A[13] = %.4f A[14] = %.4f  |\n", arr[10], arr[11], arr[12], arr[13], arr[14]);
        System.out.printf("|  A[15] = %.4f A[16] = %.4f A[17] = %.4f A[18] = %.4f A[19] = %.4f  |\n", arr[15], arr[16], arr[17], arr[18], arr[19]);

        int i;
        DecimalFormat dF = new DecimalFormat( "###.###" );
        double resMultiply = 1;
        for ( i= 0; i < arr.length; i++) {
            arr[i] = Math.random() * 7.5 + 3.5;
            resMultiply *= arr[i];
        }
        double geometricMean = Math.pow(resMultiply, 1.0 / arr.length);
        System.out.printf("Среднее геометрическое нового массива равно " + dF.format(geometricMean));
        System.out.println();
        System.out.println("-------------------------------------------------------------------------------");

    }
}






//          System.out.print(dF.format(arr[i]) + " ");