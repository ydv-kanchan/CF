import java.util.Scanner;

public class RecursiveApproach {
    static int binarySearch(int[] arr, int target) {
        return binarySearchHelper(arr, 0, arr.length-1, target);
    }

    static int binarySearchHelper(int[] arr, int s, int e, int target) {
        if (s > e)
            return -1;
        int mid = s + (e - s) / 2;
        if (arr[mid] == target) {
            return mid;
        }
        else if (arr[mid] > target) {
            return binarySearchHelper(arr, s, mid - 1, target);
        }
        return binarySearchHelper(arr, mid + 1, e, target);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        System.out.println(binarySearch(arr, target));
        sc.close();
    }
}
