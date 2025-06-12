import java.util.*;
public class PrimeInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        for(int num=start;num<=end;num++){
            boolean isPrime = true;
            if(num <= 1){
                isPrime = false;
            }
            else{
                for(int i=2;i<num/2;i++){
                    if(num%i==0){
                        isPrime = false;
                        break;
                    }
                }
            }
            if(isPrime){
                System.out.print(num + " ");
            }
        }
        sc.close();
    }
    
}
