import java.util.*;

public class ArmstrongNumInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();

        for (int i = start; i <= end; i++) {
            int num = i;
            int sum = 0;

            while (num != 0) {
                int digit = num % 10;
                sum += digit * digit * digit;
                num /= 10;
            }

            if (sum == i) {
                System.out.print(i + " ");
            }
        }

        sc.close();
    }
}
