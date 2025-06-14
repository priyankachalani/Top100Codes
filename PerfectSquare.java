import java.util.*;
public class PerfectSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sqrt = (int)Math.sqrt(num);
        if(sqrt*sqrt == num){
            System.out.print("It is perfect number");
        }
        else{
            System.out.print("It is not a perfect number");
        }
        sc.close();
    }
}
