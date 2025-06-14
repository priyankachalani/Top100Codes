import java.util.*;
public class FibonacciUptoN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        int b = 1;
        int n = 7;
        for(int i=0;i<n;i++){
            int temp = a;
            a=a+b;
            b=temp;
            System.out.print(b+" ");
        }
        sc.close();

    }
}
