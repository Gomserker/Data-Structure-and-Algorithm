
public class ArrayReverse {
    
    public static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }
    
    public static void reverse(int[] a) {
        for (int i=0; i < a.length / 2; i++) {
            swap(a, i, a.length-i-1);
        }
    }
}
