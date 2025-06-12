import java.util.*;
public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int original = num;
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            sum = sum+(digit*digit*digit);
            num = num/10;
        }
        if(sum == original){
            System.out.print("It is a Armstrong Number");
        }
        else{
            System.out.print("It is not a armstrong number");
        }
        sc.close();
    }
}
