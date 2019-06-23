package arrays.oneD;

/*
@author: errohan
@created: 16/3/19
*/
public class MinSwapsToSort {
    private static int minimumSwaps(int[] arr) {
        int minSwaps = 0;
        boolean a[] = new boolean[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int cycleSize = 1;
            if (!a[i] && arr[i] != i + 1) {
                int j = arr[i] - 1;
                while (j != i) {
                    cycleSize++;
                    a[j] = true;
                    j = arr[j] - 1;
                }
                minSwaps += cycleSize - 1;
            }
            a[i] = true;
        }
        return minSwaps;
    }

    public static void main(String[] args) {
        int a[] = {4, 3, 2, 1};
        System.out.println(minimumSwaps(a));
    }
}
