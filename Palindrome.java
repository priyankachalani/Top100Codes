import java.util.*;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int reverseNum = 0;
        int rem = 0;
        int m = num;
        while(num != 0){
            rem = num % 10;
            reverseNum = reverseNum*10+rem;
            num /= 10;
        }
        if(m == reverseNum){
            System.out.print("It is a palindrome Number");
        }
        else{
            System.out.println("It is not a Palindrome Number");
        }
        sc.close();
    }
}
