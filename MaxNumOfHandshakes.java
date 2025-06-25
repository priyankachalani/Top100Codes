import java.util.*;
public class MaxNumOfHandshakes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numofpeople = sc.nextInt();
        int MaxNumOfHandshakes = numofpeople*(numofpeople-1)/2;
        System.out.print("Maximum number of Handshakes are "+MaxNumOfHandshakes);
        sc.close();
    }
}
