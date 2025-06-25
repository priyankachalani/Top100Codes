import java.util.*;
public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int decimal = sc.nextInt();
        String binary = Integer.toBinaryString(decimal);
        System.out.print("Binary of "+decimal+" is "+binary);
        sc.close();
    }
}
