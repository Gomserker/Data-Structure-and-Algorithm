import java.util.Scanner;

public class ArrayReverseTest {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("index count: ");
        int number = input.nextInt();
        
        int[] x = new int[number];
        
        for (int i=0; i < x.length; i++) {
            System.out.print("x [" + i + "] = ");
            x[i] = input.nextInt();
        }
        
        ArrayReverse.reverse(x);
        System.out.println("Array Reversed!");
        
        for (int i=0; i < x.length; i++) {
            System.out.println("x [" + i + "] = " + x[i]);
        }
        
    }
}
