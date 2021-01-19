package Source.Toys;

public class ArtToy extends Toy {

    public ArtToy(String name, Double cost, int durability) {
        super(name, cost, durability);
    }

    @Override
    public void wear(){
        durability -= 15;
    }
}
