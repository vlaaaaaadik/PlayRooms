package Source.Toys;

import java.io.Serializable;

public class Toy implements Serializable {
    protected String name;
    protected Double cost;
    protected int durability;


    public Toy(String name, Double cost, int durability) {
        this.name = name;
        this.cost = cost;
        this.durability = durability;
    }

    public int getDurability() {
        return durability;
    }

    public Double getCost() {
        return cost;
    }

    public String getName() {
        return name;
    }

    public void wear(){
        durability -= 5;
    }

    @Override
    public String toString() {
        return "Toy{" +
                "name" + name  +
                ", costs " + cost +
                ", durability " + durability +
                '}';
    }
}
