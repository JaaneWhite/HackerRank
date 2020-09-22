package Arrays;

import java.util.Scanner;

public class noTriples {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arrlength = sc.nextInt();
        int[] arr = new int[arrlength];
        for (int i = 0; i <= arrlength - 1; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(noTriples(arr));

    }

    static boolean noTriples(int[] nums) {
       if (nums.length >= 3) {
        for (int i = 0; i <= nums.length-3; i++) {
            if ((nums[i] == nums[i + 1]) && (nums[i] == nums[i + 2])) {
                return false;
                }
            }
        }
        return true;
    }
}


