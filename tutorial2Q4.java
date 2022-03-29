import java.util.Scanner;

public class tutorial2Q4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a year: ");

        int x = in.nextInt();
        in.close();
        int year = x % 12;

        if (year == 0) {
            System.out.println("monkey");
        } else if (year == 1) {
            System.out.println("rooster");
        } else if (year == 2) {
            System.out.println("dog");
        } else if (year == 3) {
            System.out.println("pig");
        } else if (year == 4) {
            System.out.println("rat");
        } else if (year == 5) {
            System.out.println("ox");
        } else if (year == 6) {
            System.out.println("tiger");
        } else if (year == 7) {
            System.out.println("rabbit");
        } else if (year == 8) {
            System.out.println("dragon");
        } else if (year == 9) {
            System.out.println("snake");
        } else if (year == 10) {
            System.out.println("horse");
        } else if (year == 11) {
            System.out.println("sheep");
        }

    }
}
