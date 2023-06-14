import java.util.*;

public class electricityBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("======ENTER YOUR DETAILS=======");
        System.out.println();
        System.out.println("===============================");
        System.out.println("Enter the Name of Customer: ");        
        String name = sc.nextLine();
        System.out.println("Enter Contact No. : ");
        String contactNumber = sc.nextLine();
        System.out.println("Enter address: ");
        String address = sc.nextLine();
        System.out.println("Enter Person's meter No.: ");
        String metNum = sc.nextLine();
        System.out.println("Enter Current reading (in units): ");
        double currentReading = sc.nextDouble();
        System.out.println("Enter Prev Reading (also in units): ");
        double prevReading = sc.nextDouble();
        System.out.println("===============================");

        double meter_rent = 50.0;
        double consumed_unit = currentReading - prevReading;

        double charges = 0.0;
        double tax = 0.0;

        if(consumed_unit > 1 && consumed_unit < 100) {
            charges = consumed_unit * 0.80;
            tax = charges * 0.02;
        }else if(consumed_unit >= 100 && consumed_unit < 300) {
            charges = consumed_unit * 1.00;
            tax = charges * 0.05;
        }else if(consumed_unit >= 300 && consumed_unit < 500) {
            charges = consumed_unit * 1.20;
            tax = charges * 0.07;
        }else if(consumed_unit >= 500 && consumed_unit < 800) {
            charges = consumed_unit * 2.00;
            tax = charges * 0.11;
        }else if(consumed_unit >= 800 && consumed_unit < 1200) {
            charges = consumed_unit * 2.50;
            tax = charges * 0.15;
        } else if(consumed_unit >= 1200) {
            charges = consumed_unit * 3.40;
            tax = charges * 0.18;
        }

        double total_amount = charges + tax + meter_rent;

        System.out.println();
        System.out.println("---------------YOUR ELECTRICITY BILL DETAILS-----------------");
        System.out.println();
        System.out.println("--------------------------------");
        System.out.println("Person's Name: " + name);
        System.out.println("--------------------------------");
        System.out.println("Person's Contact: " + contactNumber);
        System.out.println("--------------------------------");
        System.out.println("Person's Address: " + address);
        System.out.println("--------------------------------");
        System.out.println("Person's Meter No.: " + metNum);
        System.out.println("--------------------------------");
        System.out.println("New Reading: " + consumed_unit);
        System.out.println("--------------------------------");
        System.out.println("Current Reading: " + currentReading);
        System.out.println("--------------------------------");
        System.out.println("Old Reading: " + prevReading);
        System.out.println("--------------------------------");
        System.out.println("Meter Rent: " + meter_rent + "rs");
        System.out.println("--------------------------------");
        System.out.println("Meter Charges: " + charges + "rs");
        System.out.println("--------------------------------");
        System.out.println("Tax: " + tax + "rs");
        System.out.println("--------------------------------");
        System.out.println("Total Amount to Pay: " + total_amount + "rs");
        System.out.println("--------------------------------");
        System.out.println();
        System.out.println("----------------------END OF PERSON INFO---------------------");
        System.out.println();
    }
}
