package arrays.oneD;

/*
@author: errohan
@created: 11/3/19
*/
public class LeftRotate {
    static int[] rotLeft(int[] a, int d) {
        int k, j, temp;
        int arraySize = a.length;
        int effectiveRotation = d % arraySize;
        if (effectiveRotation > 0) {
            int sets = gcd(arraySize, d);
            for (int i = 0; i < sets; i++) {
                temp = a[i];
                k = i;
                j = (k + d) % arraySize;
                while (i != j) {
                    a[k] = a[j];
                    k = j;
                    j = (k + d) % arraySize;
                }
                a[k] = temp;
            }
        }
        return a;
    }

    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5};
        printArray(a);
        printArray(rotLeft(a, 6));
    }

    private static void printArray(int a[]) {
        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    private static int gcd(int a, int b) {
        if (a == 1 || b % a == 0) return a;
        else return gcd(b % a, a);
    }
}