import java.util.*;
public class OctalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String octal = sc.next();
        int decimal = Integer.parseInt(octal,8);
        String binary = Integer.toBinaryString(decimal);
        System.out.print("Binary of "+octal+" is "+binary);
        sc.close();
    }
}
