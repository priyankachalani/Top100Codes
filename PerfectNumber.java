import java.util.*;
public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int original = num;
        int sum = 0;
        for(int i=1;i<num;i++){
            if(num%i==0){
                sum += i;
            }
        }
        if(sum == original){
            System.out.print("It is a perfect number");
        }
        else{
            System.out.print("It is not a perfect number");
        }
        sc.close();
    }
}
