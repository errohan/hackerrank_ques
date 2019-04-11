package arrays.twoD;

import java.io.IOException;
import java.util.Scanner;

/*
@author: errohan
@created: 2/4/19
*/
public class ArrayManipulation {


    // Complete the arrayManipulation function below.
    static long arrayManipulation(int n, int[][] queries) {
        long max = 0;
        long a[] = new long[n];
        for(int i = 0;i<queries.length;i++){
            int start = queries[i][0]-1;
            int end = queries[i][1]-1;
            int oper = queries[i][2];
            a[start]+=oper;
            if(end+1<n)a[end+1]-=oper;
        }
        long localVal = 0;
        for(int i = 0;i<n;i++){
            localVal+=a[i];
            if(localVal>max)max=localVal;
        }
        return max;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int a[][]=new int[m][3];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < 3; j++) {
                a[i][j]=scanner.nextInt();
            }
        }

        long result = arrayManipulation(n, a);
        System.out.println(result);
    }
}
