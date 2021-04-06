package snackbarApp;

public class Snack {
    private static int maxId = 1;
    private int id;
    private String name;
    private int quantity;
    private double cost;
    private int vendingmachine;

    public Snack(String name, int quantity, double cost, int vendingmachine){
        id = maxId;
        maxId++;
        
        this.name = name;
        this.quantity = quantity;
        this.cost = cost;
        this.vendingmachine = vendingmachine;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
    
    public double getCost(){
        return cost;
    }
    
    public void setCost(double cost){
        this.cost = cost;
    }
    
    public int getVendingMachine(){
        return vendingmachine;
    }
    
    public void setVendingMachine(int vendingmachine){
        this.vendingmachine = vendingmachine;
    }
    
    public int getQuantity(){
        return quantity;
    }

    public void addQuantity(int stock){
        quantity = quantity + stock;
    }

    public void removeQuantity(int stock){
        quantity = quantity - stock;
    }

    public double purchaseCost(int stock){
        return stock * cost;
    }
}
