// Iterative binary search on sorted array
public class BinarySearch {
    public static int binarySearch(int[] a, int target) {
        int l=0, r=a.length-1;
        while (l<=r){
            int mid = l + (r-l)/2;
            if (a[mid]==target) return mid;
            else if (a[mid] < target) l = mid+1;
            else r = mid-1;
        }
        return -1;
    }
    public static void main(String[] args){
        int[] a = {1,3,5,7,9};
        System.out.println(binarySearch(a,7)); // 3
        System.out.println(binarySearch(a,2)); // -1
    }
}
