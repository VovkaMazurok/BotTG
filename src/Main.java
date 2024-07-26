import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        var scanner = new Scanner(System.in);

        System.out.println("Enter the weight of the package");
        var weight = scanner.nextDouble();

        System.out.println("Enter the price per kilogram in UAH");
        var price = scanner.nextDouble();

        var cost = weight * price;
        System.out.println("The price of sending the parcel: " + cost + "UAH");

    }
}