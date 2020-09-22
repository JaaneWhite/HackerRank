package Arrays;

import java.util.Scanner;

public class Array123 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arrlength = sc.nextInt();
        int[] arr = new int[arrlength];
        for (int i = 0; i <= arrlength - 1; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(array123(arr));

    }

    static boolean array123(int[] nums) {
       if (nums.length >= 3) {
        for (int i = 0; i <= nums.length-2; i++) {
            if (nums[i] == 1 && nums[i + 1] == 2 && nums[i + 2] == 3) {
                return true;
                }
            }
        }
        return false;
    }
}


