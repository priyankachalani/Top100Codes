import java.util.*;
public class FactorOfaNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=1;i<=num;i++){
            if(num % i ==0){
                System.out.print(i + " ");
            }
        }
        sc.close();
    }
}
