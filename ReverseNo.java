import java.util.*;

public class ReverseNo {
    public static int reverse(int n) {
        boolean isN = false;
        if(n<0){
            isN = true;
        }
        n = Math.abs(n);
        int reverseNo = 0;
        while(n>0){
            int digit = n % 10;
            if(reverseNo == 0 && digit == 0){
                continue;
            }
            reverseNo = (reverseNo * 10) + digit;
            n /= 10;
        }
        if(!isN && reverseNo > Integer.MIN_VALUE && reverseNo < Integer.MAX_VALUE){
            return reverseNo;
        }
        else if (isN && -reverseNo > Integer.MIN_VALUE && -reverseNo < Integer.MAX_VALUE) {
            return -reverseNo;
        }
        else
            return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(reverse(n));
    }
}
