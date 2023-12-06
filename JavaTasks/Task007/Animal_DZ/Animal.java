package Animal_DZ;

public class Animal {

    public String name;
    public int health = 100;
    public String drugs = "";

    public int food = 0;

    public void setFood(int food){
        this.food = food;
    }
    public int getFood(){
        return food;
    }

    public void toGO(){
        System.out.println("Animal state: Going");
    }
    public void fly(){
        System.out.println("Animal state: Flying");
    }
    public void swim(){
        System.out.println("Animal state: Swiming");
    }
}
