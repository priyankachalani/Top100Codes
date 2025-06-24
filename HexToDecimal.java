import java.util.*;
public class HexToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String hexString = sc.next();
        int decimal = Integer.parseInt(hexString,16);
        System.out.println("Decimal of "+hexString+" is "+decimal);
        sc.close();
    }
}
