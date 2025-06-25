import java.util.*;
public class Permutations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numofpeople = sc.nextInt();
        int numofseats = sc.nextInt();

        int fact = 1;
        for(int i=1;i<=numofpeople;i++){
            fact = fact*i;
        }

        int n = numofpeople-numofseats;

        int fact1 = 1;
        for(int i=1;i<=n;i++){
            fact1 = fact1*i;
        }

        int Permutations = fact/fact1;
        
        System.out.print("Permutations of "+numofpeople+" in "+numofseats+" are "+Permutations);
        sc.close();
    }
}
