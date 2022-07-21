import java.util.Scanner;
import java.util.ArrayList;

public class Receipt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<String> Receipt_Name = new ArrayList<>();
        ArrayList<String> Receipt_item = new ArrayList<>();
        ArrayList<Integer> Receipt_quantity = new ArrayList<>();
        ArrayList<Integer> Receipt_Amount = new ArrayList<>();
        ArrayList<Double> Receipt_discount = new ArrayList<>();


        System.out.println("What is the customer's name ?");
        String name = input.nextLine();
        Receipt_Name.add(name);

        System.out.println("what did the user buy ?");
        String item = input.nextLine();
        Receipt_item.add(item);

        System.out.println("How many pieces ?");
        int quantity = input.nextInt();
        Receipt_quantity.add(quantity);

        System.out.println("How much discount will he get ?");
        double discount = input.nextDouble();
        Receipt_discount.add(discount);


        System.out.println("How much per unit ?");
        int Amount = input.nextInt();
        Receipt_Amount.add(Amount);

        System.out.printf("%s%n%s%n%s%n%s%n%s%n%" + "" + "s%n%s%n", "BURNA STORES", "MAIN BRANCH", "LOCATION: 77, OZONBOR STREET OFF OGBOME ROAD OGWASHI-UKU, AGIDEZE, DELTA STATE.", "TEL: O8O979797777", "DATE: 7-JULY-77 7:27;47 AM", "Cashier: Bola Tinubu", "Customer Name:Rev Ogbonna");
        System.out.println("=======================================================");
        System.out.println("ITEM    " + "    QTY    " + "     PRICE" + "    TOTAL(NGN)");
        System.out.println("-------------------------------------------------------");

        String bible = ("bible");
        quantity = 3;
        double price = 500;
        double total1 = quantity * price;
        System.out.printf("%s     %d      %f      %f%n", bible, quantity, price, total1);

        String malt = ("malt");
        quantity = 1;
        price = 250;
        double total2 = quantity * price;
        System.out.printf("%s     %d      %f      %f%n", malt, quantity, price, total2);

        String oranges = ("oranges");
        quantity = 2;
        price = 50;
        double total3 = quantity * price;
        System.out.printf("%s     %d      %f      %f%n", oranges, quantity, price, total3);

        System.out.println("--------------------------------------------------------");

        double sub_total = (total1 + total2 + total3);
        discount = 37;
        double VAT = 323.75;
        System.out.printf("        %s      %f%n", "Sub Total;", +sub_total);
        System.out.printf("        %s      %f%n", "Discount:", +discount);
        System.out.printf("        %s      %f%n", "VAT @ 17.50%:", +VAT);

        System.out.println("==============================================");

        double billtotal = sub_total + VAT - discount;
        double amountpaid = 2200;
        double balance = amountpaid - billtotal;
        System.out.printf("       %s      %f%n", "Bill Total:", +billtotal);
        System.out.printf("       %s      %f%n", "Amount Paid:", +amountpaid);
        System.out.printf("       %s      %f%n", "Balance:", +balance);

        System.out.println("------------------------------------------------");
        System.out.println("        THANK   YOU   FOR   YOUR   PATRONAGE      ");
        System.out.print("=====================================================");


    }
}

