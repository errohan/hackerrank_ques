package arrays.oneD;

/*
@author: errohan
@created: 16/3/19
*/
public class SwapWithMinSwaps {

    private static void swap(int a[], int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    private static int sortWithMinSwaps(int[] arr) {
        int j, minSwaps = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i + 1) {
                while (arr[i] != i + 1) {
                    j = arr[i] - 1;
                    swap(arr, i, j);
                    minSwaps++;
                }
            }
        }
        return minSwaps;
    }

    public static void main(String[] args) {
        int a[] = {4, 3, 1, 2};
        System.out.println(sortWithMinSwaps(a));
    }
}
