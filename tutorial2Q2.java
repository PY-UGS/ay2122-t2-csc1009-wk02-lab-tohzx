import java.util.Scanner;

public class tutorial2Q2 {
    public static void main(String[] args) {
        //doing it this way allows the edit of number of inputs from 3 to more or less as needed
        double[] array = new double[3];
        double sum = 0;

        Scanner in = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = in.nextFloat();
        }
        in.close();

        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }

        double average = sum / array.length;
        System.out.print("The average of ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.print("is " + average);

//        double average;
//        Scanner in = new Scanner(System.in);
//        System.out.print("Enter three numbers: ");
//        float x = in.nextFloat();
//        float y = in.nextFloat();
//        float z = in.nextFloat();
//        average = (x+y+z) / 3;
//        System.out.print("The average of"+ x + " "+ y + " " +z + " is " + average);
    }
}