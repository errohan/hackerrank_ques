package arrays.twoD;

import java.util.Scanner;

/*
@author: errohan
@created: 11/3/19
@Problem: https://www.hackerrank.com/challenges/2d-array/problem?h_l=interview&playlist_slugs%5B%5D%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D%5B%5D=arrays
*/

public class HourGlass {
    // Complete the hourglassSum function below.
    static int hourglassSum(int[][] arr) {
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0;i<6-2;i++){
            for(int j=1;j<6-1;j++){
                int sum = arr[i  ][j-1] + arr[i  ][j] + arr[i  ][j+1]
                                        + arr[i+1][j] +
                          arr[i+2][j-1] + arr[i+2][j] + arr[i+2][j+1];
                maxSum = (sum>maxSum)?sum:maxSum;
            }
        }
        return maxSum;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a[][] = new int[6][6];
        for(int i=0;i<6;i++)
            for(int j=0;j<6;j++)
                a[i][j]=sc.nextInt();

        System.out.println(hourglassSum(a));
    }
}
