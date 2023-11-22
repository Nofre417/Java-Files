public class Laptop {
    private String name;
    private int amountRAM;
    private String operationSystem;
    private int price;
    private String color;

    public Laptop(String name, int amountRAM, String operationSystem, int price, String color){
        this.name = name;
        this.amountRAM = amountRAM;
        this.operationSystem = operationSystem;
        this.price = price;
        this.color = color;
    }

    @Override
    public String toString(){
        return ("Laptop: " + name + "| RAM: " + amountRAM + "| OS: " + operationSystem + "| Color: " + color + "| Price: " + price +"$");
    }

    public String getName(){
        return name;
    }

    public int getAmountRAM(){
        return amountRAM;
    }

    public String getOperationSystem(){
        return operationSystem;
    }

    public int getPrice(){
        return  price;
    }

    public String getColor(){
        return color;
    }
}
