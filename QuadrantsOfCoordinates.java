import java.util.*;
public class QuadrantsOfCoordinates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        if(x > 0 && y > 0){
            System.out.print("Point lies in Quadrant I");
        }
        else if(x < 0 && y > 0){
            System.out.print("Point lies in Quadrant II");
        }
        else if(x < 0 && y < 0){
            System.out.print("Point Lies in Quadrant III");
        }
        else{
            System.out.print("Point lies in Quadrant IV");
        }
        sc.close();
    }
}
