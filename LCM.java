/*
import java.util.*;
public class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int lcm = 0;
        int max = Math.max(a,b);

        lcm = max;
        while(true){
            if(lcm % a == 0 && lcm % b == 0){
                break;
            }
            lcm++;
        }
        System.out.println("LCM of "+ a + " and "+ b +" is " + lcm );
        sc.close();
    }
}
    */

import java.util.*;
public class LCM{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int num1 = a;
        int num2 = b;

        while(b!=0){
            int temp = b;
            b = a%b;
            a = temp;
        }
        int hcf = a;

        int lcm = (num1*num2)/hcf;

        System.out.println("HCF of "+ num1 + " and "+ num2 +" is "+hcf);
        System.out.println("LCM of "+ num1 + " and "+ num2 + " is "+lcm);
        sc.close();
    }
}
