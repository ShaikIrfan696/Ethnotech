import java.util.*;
public class ArrayProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt(); 
        }
        long product = 1;
        for (int val : nums) {
            product *= val;
        }
        System.out.println("The product is: " + product);
        System.out.println();
    }
}
