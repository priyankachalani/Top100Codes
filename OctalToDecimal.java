import java.util.*;
public class OctalToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String octalString = sc.next();
        int decimal = Integer.parseInt(octalString,8);

        System.out.println("Decimal of "+octalString+ " is " +decimal);
        sc.close();
    }
}
