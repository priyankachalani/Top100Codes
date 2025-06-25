import java.util.*;
public class DecimalToHex{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int decimal = sc.nextInt();
        String hex = Integer.toHexString(decimal);
        System.out.print("Hex of "+decimal+" is "+hex);
        sc.close();
    }
}