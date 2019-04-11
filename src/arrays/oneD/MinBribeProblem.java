package arrays.oneD;

/*
@author: errohan
@created: 16/3/19
*/
public class MinBribeProblem {
    private static void minimumBribes(int[] a) {
        int bribe = 0;
        int size = a.length;
        for(int i=0;i<size; i++) {
            if (a[i] > i + 1 && a[i] > i + 3) {
                System.out.println("Too chaotic");
                return;
            }
            if(a[i]<i+1){
                for(int j=Math.max(0,a[i]-2);j<=i;j++){
                    if(a[j]>a[i]) bribe++;
                }
            }
        }
        System.out.println(bribe);
    }

    public static void main(String[] args) {
        int a[]={2,1,5,3,4};
        minimumBribes(a);
    }
}
