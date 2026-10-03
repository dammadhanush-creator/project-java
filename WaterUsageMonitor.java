
import java.util.Scanner;

public class WaterUsageMonitor {

    // 1c) Method to calculate total water consumption
    public static int calculateTotal(int morningUsage, int eveningUsage) {
        return morningUsage + eveningUsage;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // --- 1a) Data Types ---
        int familyMembers = 4;
        double waterConsumed = 450.50; // water consumed in litres
        int houseNumber = 102;
        char usageStatus = 'N'; // 'N' for Normal, 'H' for High

        System.out.println("=== 1a) Household Details ===");
        System.out.println("House Number: " + houseNumber);
        System.out.println("Family Members: " + familyMembers);
        System.out.println("Water Consumed: " + waterConsumed + " litres");
        System.out.println("Usage Status: " + usageStatus);
        System.out.println();

        // --- 1b) If-Else Condition ---
        System.out.println("=== 1b) Water Bill Calculation ===");
        System.out.print("Enter total water consumption for bill calculation (in litres): ");
        double consumptionInput = scanner.nextDouble();

        int bill;
        if (consumptionInput <= 500) {
            bill = 100;
        } else {
            bill = 200;
        }
        System.out.println("Water Bill: Rs." + bill);
        System.out.println();

        // --- 1c) Methods ---
        System.out.println("=== 1c) Calculate Total Consumption ===");
        System.out.print("Enter morning water usage (litres): ");
        int morning = scanner.nextInt();

        System.out.print("Enter evening water usage (litres): ");
        int evening = scanner.nextInt();

        // Calling the method
        int totalConsumption = calculateTotal(morning, evening);
        System.out.println("Total Water Consumption: " + totalConsumption + " litres");

        scanner.close();
    }
}
