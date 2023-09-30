import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        ArrayList<Device> devicesList = new ArrayList<>();

        String[] randomNames = {"Apple", "Lenovo", "ASUS", "HP", "Xiaomi"}; //different names
        String[] randomLaptopTypes = {"Ultrabook", "Notebook", "Flexible"}; //different types
        int[] eachDeviceCount = {0, 0, 0};

        System.out.println("Enter count of devices (from 1 to 20): ");
        int devicesCount = sc.nextInt();
        if (devicesCount > 20) devicesCount = 20;

        for (int i = 0; i < devicesCount; i++) {
            int randomDevice = random.nextInt(1, 4);
            double randomPrice = random.nextDouble(199.99, 3599.99);
            if (randomDevice == 1) {
                int phoneHeight = random.nextInt(150, 185);
                int phoneWidth = random.nextInt(50, 70);
                double randomWeight = random.nextDouble(0.1, 0.4);
                Smartphone temp = new Smartphone("Smartphone", randomPrice, randomWeight, phoneHeight, phoneWidth);
                devicesList.add(temp);
                eachDeviceCount[0]++;
            }
            else if (randomDevice == 2) {
                int tabletHeight = random.nextInt(250, 450);
                int tabletWidth = random.nextInt(100, 200);
                double randomWeight = random.nextDouble(0.5, 2.5);
                Tablet temp = new Tablet("Tablet", randomPrice, randomWeight, tabletHeight, tabletWidth);
                devicesList.add(temp);
                eachDeviceCount[1]++;
            }
            else if (randomDevice == 3) {
                String randomNameModel = randomNames[random.nextInt(randomNames.length)];
                String randomType = randomLaptopTypes[random.nextInt(randomLaptopTypes.length)];
                double randomWeight = random.nextDouble(1.0, 5.5);
                Laptop temp = new Laptop("Laptop", randomPrice, randomWeight, randomNameModel, randomType);
                devicesList.add(temp);
                eachDeviceCount[2]++;
            }
            else {
                System.out.println("Something wrong");
            }
        }

        System.out.println("Smartphones was created: " + eachDeviceCount[0]);
        System.out.println("Tablet was created: " + eachDeviceCount[1]);
        System.out.println("Laptop was created: " + eachDeviceCount[2]);
        double totalPrice = 0.0;
        for (int i = 0; i < devicesCount; i++) {
            totalPrice += devicesList.get(i).getPrice();
        }
        System.out.println("The total price of all devices: " + totalPrice + " $");
        double totalWeight = 0.0;
        for (int i = 0; i < devicesCount; i++) {
            totalWeight += devicesList.get(i).getWeight();
        }

        System.out.println("The total weight of all devices: " + totalWeight + " kg");
    }
}