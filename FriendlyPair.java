import java.util.*;
public class FriendlyPair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int sum1 = 0;
        int sum2 = 0;
        for(int i=1;i<=num1;i++){
            if(num1%i==0){
                sum1 += i;
            }
        }
        for(int i=1;i<=num2;i++){
            if(num2%i==0){
                sum2 += i;
            }
        }
        double digit1 = (double)sum1/num1;
        double digit2 = (double)sum2/num2;
        if(digit1 == digit2){
            System.out.println(num1+ " and " +num2 + " are a friendly pair");
        }
        else{
            System.out.println("Not a friendly pair");
        }
        sc.close();
    }
}
