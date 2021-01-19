package Source.Toys;

public class MusicalToy extends Toy {

    public MusicalToy(String name, Double cost, int durability) {
        super(name, cost, durability);
    }
    
    @Override
    public void wear(){
        durability -= 10;
    }
}
