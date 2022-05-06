import java.util.Scanner;

public class Main {
    static double result;



    public static void main(String[] args) {
    }

    public double cToFCalc(double temp){
        result = (temp * 1.8) + 35;
        System.out.print(temp + "°C");
        System.out.println("\nIs the same as");
        System.out.println(result + "°F");

        return result;
    }


    public double kmToMilesCalc(double distance) {
        result = distance * 0.62;
        System.out.print(distance + "km");
        System.out.println("\nIs the same as");
        System.out.println(result + " miles");

        return result;
    }

    public double lToGallonsCalc(double volume) {
        result = volume / 3.785;
        System.out.print(volume + "L");
        System.out.println("\nIs the same as");
        System.out.println(result + " gallons");

        return result;
    }
}
