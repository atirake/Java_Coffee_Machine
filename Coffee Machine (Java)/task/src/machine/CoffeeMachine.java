package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        CupsOfCoffee cups = new CupsOfCoffee();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            String input = scanner.nextLine();
            if ("remaining".equals(input)) {
                cups.displayMachineQuantity();
            } else if ("buy".equals(input)) {
                while (true) {
                    System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
                    String typeOfCoffee = scanner.nextLine();
                    if ("back".equals(typeOfCoffee)) {
                        break;
                    } else {
                        if (Integer.parseInt(typeOfCoffee) == 1) {
                            cups.buyEspresso();
                            break;
                        } else if (Integer.parseInt(typeOfCoffee) == 2) {
                            cups.buyLatte();
                            break;
                        } else if (Integer.parseInt(typeOfCoffee) == 3) {
                            cups.buyCappuccino();
                            break;
                        }
                    }
                }
            } else if ("fill".equals(input)) {
                System.out.println("Write how many ml of water you want to add:");
                cups.setWater(scanner.nextInt());
                System.out.println("Write how many ml of milk you want to add:");
                cups.setMilk(scanner.nextInt());
                System.out.println("Write how many grams of coffee beans you want to add:");
                cups.setCoffeeBeans(scanner.nextInt());
                System.out.println("Write how many disposable cups you want to add:");
                cups.setCups(scanner.nextInt());
            } else if ("take".equals(input)) {
                System.out.println("I gave you $" + cups.getMoney());
                cups.setMoney();
            } else if ("exit".equals(input)) {
                break;
            }
        }
    }
}
