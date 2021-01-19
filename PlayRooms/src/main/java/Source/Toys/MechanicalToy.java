package Source.Toys;

public class MechanicalToy extends Toy {

    public MechanicalToy(String name, Double cost, int durability) {
        super(name, cost, durability);
    }

    @Override
    public void wear(){
        durability-= 10;
    }
}
