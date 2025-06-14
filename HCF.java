/*
import java.util.*;
public class HCF{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int hcf = 0;
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        for(int i = 1;i <= num1 || i <= num2;i++){
            if(num1 % i == 0 && num2 % i == 0){
                hcf = i;
            }
        }
        System.out.println("The HCf: "+hcf);

        sc.close();
    }
}
*/


import java.util.*;
public class HCF{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        //int HCF=0;
        while(num1 != num2){
            if(num1 > num2){
                num1 -= num2;
            }
            else{
                num2 -= num1;
            }
        }
        System.out.println("The HCF is : "+num1);
        sc.close();
    }
}
