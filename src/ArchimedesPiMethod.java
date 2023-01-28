/**
 *
 * @author Trevor Hartman
 * @author Logan Portillo
 *
 * @since Version 1.0
 *
 */


import java.util.Scanner;

public class ArchimedesPiMethod {
    public static void main(String[] args) {
        while(true) {
            System.out.println("Archimedes PI Method");
            System.out.println("Enter the number of sides for your polygon: ");
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            if(n < 1){
                break;
            }
            System.out.println("You entered: " + n);
            double b = 360.0 / n;
            double a = b / 2;
            double s = 2 * Math.sin(Math.toRadians(a));
            System.out.println("The length of one side is: " + s);
            double p = n * s;
            System.out.println("The perimeter of the polygon is: " + p);
            double pi = p / 2;
            System.out.println("PI approximation: " + pi);
        }
    }
}
