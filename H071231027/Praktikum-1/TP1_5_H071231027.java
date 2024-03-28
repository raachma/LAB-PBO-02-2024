import java.util.Scanner;

public class TP1_5_H071231027 {
    public static void main(String[] args) {
        int[][] nums = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        Scanner input = new Scanner(System.in);
        int target = input.nextInt();

        boolean found = false;

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                if (nums[i][j] == target) {
                    System.out.println("Found " + target + " at [" + i + "][" + j + "]");
                    found = true;
                    break;
                }
            }
            if (found)
                break;
        }

        if (!found) {
            System.out.println("Number not found in the 2D array.");
        }
    }
}
