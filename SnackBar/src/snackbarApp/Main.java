package snackbarApp;

import java.text.DecimalFormat;

public class Main {
    public static void main (String[] args){
        //not the most semantic just thought id have some fun with the naming since this isn't hurting anyone
        snacking();
    }

    public static void Inventory(Snack[] snacks, VendingMachine[] vendingMachines){
        //Formats the formatting to be used with prices
        DecimalFormat price = new DecimalFormat("0.00");
        
        //iterates over snack array
        for (int i = 0; i < snacks.length; i++){

            //iterates over vending machine array
            for(int j = 0; j < vendingMachines.length; j++){

                //conditional logic to get the vending machine that the snack belongs to
                if(snacks[i].getVendingMachine() == vendingMachines[j].getId()){

                    //Since  in this  statement we have all of the data we need for the output for one entry of the list it outputs to console here
                    System.out.println(
                        "Snack: " + snacks[i].getName() + "\n" +
                        "Vending Machine: " + vendingMachines[j].getName() + "\n" +
                        "Quantity: " + snacks[i].getQuantity() + "\n" +
                        "Total Cost: $" + price.format(snacks[i].purchaseCost(snacks[i].getQuantity())) + "\n"
                    );
                }
            }
        }

    }

    private static void snacking(){
        System.out.println("\n");

        //Customers
        Customer jane = new Customer("Jane", 45.25);
        Customer bob = new Customer("Bob", 33.14);
        

        //Vending machines
        VendingMachine food = new VendingMachine("Food");
        VendingMachine drink = new VendingMachine("Drink");
        VendingMachine office = new VendingMachine("Office");
        
        //Vending machine array
        VendingMachine[] vendingMachines ={food, drink, office};

        //Food Snacks
        Snack chips = new Snack("Chips", 36, 1.75, food.getId());
        Snack chocolateBar = new Snack("Chocolate Bar", 36, 1.00, food.getId());
        Snack pretzel = new Snack("Pretzel", 30, 2.00, food.getId());

        //drinks
        Snack soda = new Snack("Soda", 24, 2.50, drink.getId());
        Snack water = new Snack("Water", 20, 2.75, drink.getId());

        //Vending machine items
        Snack[] snacks = {chips, chocolateBar, pretzel, soda, water};
        
        //Jane buys 3 sodas
        System.out.println("Jane buys 3 sodas:");
        soda.removeQuantity(3);
        jane.buy(soda.purchaseCost(3));

        System.out.println("Jane's Cash on hand is: " + jane.getCOH() + "$");
        System.out.println("Quantity of sodas remaining: " + soda.getQuantity() + "\n");

        //Jane buys 1 Pretzel
        System.out.println("Jane buys 1 Pretzel:");
        pretzel.removeQuantity(1);
        jane.buy(pretzel.purchaseCost(1));

        System.out.println("Jane's Cash on hand is: " + jane.getCOH() + "$");
        System.out.println("Quantity of Pretzels remaining: " + pretzel.getQuantity() + "\n");

        //Bob buys 2 sodas
        System.out.println("Bob buys 2 sodas:");
        soda.removeQuantity(2);
        bob.buy(soda.purchaseCost(2));

        System.out.println("Bob's Cash on hand is: " + bob.getCOH() + "$");
        System.out.println("Quantity of sodas remaining: " + soda.getQuantity() + "\n");

        //Jane finds 10.00$ dollars and adds it to her cash on hand
        System.out.println("Jane finds 10.00$ dollars and adds it to her cash on hand:");
        jane.addCash(10.00);
        
        System.out.println("Jane's Cash on hand is: " + jane.getCOH() + "$" + "\n");

        //Jane buys 1 chocolate bar
        System.out.println("Jane buys 1 chocolate bar:");
        chocolateBar.removeQuantity(1);
        jane.buy(chocolateBar.purchaseCost(1));

        System.out.println("Jane's Cash on hand is: $" + jane.getCOH() + "$");
        System.out.println("Quantity of Chocolate Bars remaining: " + chocolateBar.getQuantity() + "\n");

        //Add 12 more pretzels
        System.out.println("Add 12 more pretzels:");
        pretzel.addQuantity(12);

        System.out.println("Quantity of Pretzels remaining: " + pretzel.getQuantity() + "\n");

        //Bob buys 3 Pretzels
        System.out.println("Bob buys 3 pretzels:");
        pretzel.removeQuantity(3);
        bob.buy(pretzel.purchaseCost(3));

        System.out.println("Bob's Cash on hand is: $" + bob.getCOH() + "$");
        System.out.println("Quantity of Pretzels remaining: " + pretzel.getQuantity() + "\n");

        //Stretch Goal
        Inventory(snacks, vendingMachines);
    }
}
