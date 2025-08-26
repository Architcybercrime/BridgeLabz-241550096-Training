// Quick sort (in-place)
import java.util.*;
public class QuickSort {
    public static void quickSort(int[] a) {
        sort(a,0,a.length-1);
    }
    private static void sort(int[] a, int lo, int hi) {
        if (lo>=hi) return;
        int p = partition(a, lo, hi);
        sort(a, lo, p-1);
        sort(a, p+1, hi);
    }
    private static int partition(int[] a, int lo, int hi) {
        int pivot = a[hi];
        int i = lo;
        for (int j=lo;j<hi;j++){
            if (a[j] <= pivot) {
                int tmp = a[i]; a[i]=a[j]; a[j]=tmp;
                i++;
            }
        }
        int tmp = a[i]; a[i]=a[hi]; a[hi]=tmp;
        return i;
    }
    public static void main(String[] args){
        int[] a = {3,6,8,10,1,2,1};
        quickSort(a);
        System.out.println(Arrays.toString(a));
    }
}
