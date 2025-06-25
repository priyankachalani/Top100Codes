import java.util.*;
public class BinaryToOctal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String binary = sc.next();
        int decimal = Integer.parseInt(binary,2);
        String octal = Integer.toOctalString(decimal);
        System.out.print("Octal of "+binary+" is "+octal);
        sc.close();
    }
}
