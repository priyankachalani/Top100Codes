import java.util.*;
public class PowerOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt();
        int exponent = sc.nextInt();
        int pow = (int)Math.pow(base,exponent);
        System.out.print(pow);
        sc.close();
    }
}
