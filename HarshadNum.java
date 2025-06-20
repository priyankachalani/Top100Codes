import java.util.*;
public class HarshadNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int original = num;
        int sum = 0;
        while(num != 0){
            int digit = num % 10;
            sum += digit;
            num /= 10;
        }
        if(original % sum == 0){
            System.out.println("It is a harshad number");
        }
        else{
            System.out.println("It is not a harshad number");
        }
        sc.close();
    }
}
