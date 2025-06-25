import java.util.*;
public class DecimalToOctal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int decimal = sc.nextInt();
        String octal = Integer.toOctalString(decimal);
        System.out.print("Octal of "+decimal+" is "+octal); 
        sc.close();
    }
}
