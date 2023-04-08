package machine;

public class CupsOfCoffee {
    int water;
    int milk;
    int coffeeBeans;
    int cups;
    int money;

    CupsOfCoffee() {
        this.water = 400;
        this.milk = 540;
        this.coffeeBeans = 120;
        this.cups = 9;
        this.money = 550;
    }

    public void setWater(int water) {
        this.water += water;
    }

    public void setMilk(int milk) {
        this.milk += milk;
    }

    public void setCoffeeBeans(int coffeeBeans) {
        this.coffeeBeans += coffeeBeans;
    }

    public void setCups(int cups) {
        this.cups += cups;
    }

    public void setMoney() {
        this.money = 0;
    }

    public void displayMachineQuantity() {
        System.out.println("The coffee machine has:");
        System.out.println(getWater() + " ml of water");
        System.out.println(getMilk() + " ml of milk");
        System.out.println(getCoffeeBeans() + " g of coffee beans");
        System.out.println(getCups() + " disposable cups");
        System.out.println("$" + getMoney() + " of money");
    }
    public void buyEspresso() {
        if (getWater() < 250) {
            System.out.println("Sorry, not enough water!");
        } else if (getCoffeeBeans() < 16) {
            System.out.println("Sorry, not enough coffee beans!");
        } else {
            System.out.println("I have enough resources, making you a coffee!");
            this.water -= 250;
            this.coffeeBeans -= 16;
            this.money += 4;
            this.cups -= 1;
        }
    }

    public void buyLatte() {
        if (getWater() < 350) {
            System.out.println("Sorry, not enough water!");
        } else if (getCoffeeBeans() < 20) {
            System.out.println("Sorry, not enough coffee beans!");
        } else if (getMilk() < 75) {
            System.out.println("Sorry, not enough milk!");
        } else {
            System.out.println("I have enough resources, making you a coffee!");
            this.water -= 350;
            this.milk -= 75;
            this.coffeeBeans -= 20;
            this.money += 7;
            this.cups -= 1;
        }
    }

    public void buyCappuccino() {
        if (getMilk() < 100) {
            System.out.println("Sorry, not enough milk!");
        } else if (getWater() < 200) {
            System.out.println("Sorry, not enough water!");
        } else if (getCoffeeBeans() < 12) {
            System.out.println("Sorry, not enough coffee beans!");
        } else {
            System.out.println("I have enough resources, making you a coffee!");
            this.water -= 200;
            this.milk -= 100;
            this.coffeeBeans -= 12;
            this.money += 6;
            this.cups -= 1;
        }
    }
    public int getWater() {
        return water;
    }

    public int getMilk() {
        return milk;
    }

    public int getCoffeeBeans() {
        return coffeeBeans;
    }

    public int getCups() {
        return cups;
    }

    public int getMoney() {
        return money;
    }
}
