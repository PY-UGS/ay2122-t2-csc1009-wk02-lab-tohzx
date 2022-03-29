import java.util.Scanner;

public class tutorial2Q1 {
    public static void main(String[] args) {
        //declaration of PI final used as value should never be modified
        //final double pi = 3.1415926;

        //attaining input of radius
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number for radius: ");

        double radius = s.nextDouble();

        //Math.PI used for number accuracy
        double Output = Math.PI * (radius * radius);
        System.out.println("The area for the circle of radius " + radius + " is " + Output);
    }
}