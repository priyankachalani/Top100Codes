import java.util.*;
public class ReverseOfNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int reverseNum = 0;
        int rem = 0;
        while(num != 0 ){
            rem = num % 10;
            reverseNum = reverseNum*10+rem;
            num /= 10;
        }
        System.out.print(reverseNum);
        sc.close();

    }
}
