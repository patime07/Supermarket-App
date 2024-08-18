import supermarket.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        boolean choice = true;
        int input, fatType, sugarLevel;
        String input1, returnString;
        double input2, input3;
        double total = 0;
        Fat input4;
        SugarLevel input5;
        ArrayList<GroceryProduct> cart = new ArrayList<>();

        System.out.println(" Add to my Cart (y/n)");
        input1 = s.next();
        if (!input1.equals("y")) choice = false;

        while (choice) {
            System.out.println("--------------------AVAILABLE PRODUCTS--------------------");
            System.out.println("Please select a product");
            System.out.println("1.Grocery Product");
            System.out.println("2.Dairy Product");
            System.out.println("3.Beverage");
            System.out.println("click number 4 to view your cart" );
            input = s.nextInt();


            switch (input) {
                case 1: //Grocery Product
                    System.out.println("> Product Name:");
                    input1 = s.next();
                    System.out.println("> Product Price");
                    input2 = s.nextDouble();
                    System.out.println("> Discount");
                    input3 = s.nextDouble();
                    GroceryProduct groceryProduct = new GroceryProduct(input1, input2, input3);
                    total += groceryProduct.productPrice();
                    cart.add(groceryProduct);
                    break;

                case 2: //Dairy Product
                    System.out.println("> Product Name:");
                    input1 = s.next();
                    System.out.println("> Product Price");
                    input2 = s.nextDouble();
                    System.out.println("> Discount");
                    input3 = s.nextDouble();
                    System.out.println("> Enter Fats Type");
                    System.out.println("1.Full cream");
                    System.out.println("2. Half cream");
                    System.out.println("3. Skimmed");
                    fatType = s.nextInt();
                    if (fatType == 1) {
                        input4 = Fat.FULLCREAM;
                    } else if (fatType == 2) {
                        input4 = Fat.HALFCREAM;
                    } else {
                        input4 = Fat.SKIMMED;
                    }
                    DairyProduct dairyProduct = new DairyProduct(input1, input2, input3, input4);
                    total += dairyProduct.productPrice();
                    cart.add(dairyProduct);
                    break;

                case 3: //Beverage
                    System.out.println("> Product Name:");
                    input1 = s.next();
                    System.out.println("> Product Price");
                    input2 = s.nextDouble();
                    System.out.println("> Discount");
                    input3 = s.nextDouble();
                    System.out.println("> Enter Sugar Level");
                    System.out.println("1. Light");
                    System.out.println("2. Zero");
                    System.out.println("3. Added Sugar");
                    System.out.println("4. No Added Sugar");
                    sugarLevel = s.nextInt();
                    if (sugarLevel == 1) {
                        input5 = SugarLevel.LIGHT;
                    } else if (sugarLevel == 2) {
                        input5 = SugarLevel.ZERO;
                    } else if (sugarLevel == 3) {
                        input5 = SugarLevel.ADDED_SUGAR;
                    } else {
                        input5 = SugarLevel.NO_ADDED_SUGAR;
                    }
                    Beverage beverage = new Beverage(input1,input2,input3,input5);
                    total += beverage.productPrice();
                    cart.add(beverage);
                    break;

                case 4:
                    System.out.println("--------------------My Cart--------------------");
                    System.out.println(cart);
                    System.out.println("Total to Pay : "+total);
                    break;

                default:
                    System.out.println("Wrong choice! Back to Menu.");
            }
        }
}
}