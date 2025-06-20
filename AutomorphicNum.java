import java.util.*;
public class AutomorphicNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int square = num*num;

        int digits = (int)Math.log10(num)+1;
        int mod = (int)Math.pow(10,digits);

        if(square % mod == num){
            System.out.println("It is a automorphic nmumber");
        }
        else{
            System.out.println("It is not a autophoric number");
        }


        sc.close();
    }
}
