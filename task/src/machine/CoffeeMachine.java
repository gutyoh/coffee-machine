package machine;

import java.util.Scanner;


public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int total_coffee_cups = 0;

        int water = 400;
        int milk = 540;
        int coffee_beans = 120;

        int cups = 9;

        int money = 550;

        String input;

        int choice = 0;

        while (water >= 200 && milk >= 50 && coffee_beans >= 15) {

            System.out.println("The coffee machine has: " +
                    water + " ml of water \n" +
                    milk + " ml of milk \n" +
                    coffee_beans + " g of coffee beans \n" +
                    cups + " disposable cups \n$" +
                    money + " of money");

            System.out.println("Write action (buy, fill, take): ");
            input = s.nextLine();

            switch (input) {
                case "buy":
                    System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino: ");
                    choice = s.nextInt();
                    switch (choice) {
                        case 1:
                            water -= 250;
                            coffee_beans -= 16;
                            money -= 4;
                            break;
                        case 2:
                            water -= 350;
                            milk -= 75;
                            coffee_beans -= 20;
                            money -= 7;
                            break;
                        case 3:
                            water -= 200;
                            milk -= 100;
                            coffee_beans -= 12;
                            money -= 6;
                    }
                    break;

                case "fill":

            }

            if (total_coffee_cups == cups) {
                System.out.println("Yes, I can make that amount of coffee");
            } else if (total_coffee_cups < cups) {
                System.out.println("No, I can make only " + total_coffee_cups + " cup(s) of coffee");
            } else {
                System.out.println("Yes, I can make that amount of coffee (and even " + (total_coffee_cups - cups) + " more than that)");
            }
        }
    }
}
