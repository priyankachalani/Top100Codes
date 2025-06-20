import java.util.*;
public class AbundantNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        for(int i=1;i<num;i++){
            if(num % i == 0){
                sum += i;
            }
        }
        if(sum > num){
            System.out.println("It is an abundant number");
        }
        else{
            System.out.println("It is not a abundant number");
        }
        sc.close();
    }
}
