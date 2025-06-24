import java.util.*;
public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String binaryString = sc.next();
        int decimal = Integer.parseInt(binaryString,2);
        System.out.println("Decimal of the "+binaryString+" is "+decimal);
        sc.close();
    }
}
