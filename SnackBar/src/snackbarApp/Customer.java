package snackbarApp;

public class Customer {
    private static int maxId = 1;
    private int id;
    private String name;
    private double CoH;

    public Customer(String name, double CoH){
        id = maxId;
        maxId++;

        this.name = name;
        this.CoH = CoH;
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

    public void addCash(double money){
        CoH = CoH + money;
    }

    public double getCOH(){
        return CoH;
    }

    public void buy(double cost){
        CoH = CoH - cost;
    }
}
