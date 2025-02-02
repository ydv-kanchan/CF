import java.util.*;
public class ArraysSortedRotated {
    public static boolean check(int[] nums) {
        int i = 0;
        int count = 0;
        int j = i + 1;
        while (j < nums.length) {
            if (nums[i + 1] <= nums[i])
                count++;
            j++;
        }
        return count > 1 ? false : true;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        boolean ans = check(arr);
        System.out.println(ans);
    }
}
