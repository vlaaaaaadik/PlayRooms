package Source.Room;

import Source.Child.Child;
import Source.Child.Children;
import Source.Toys.Toy;

import java.io.Serializable;
import java.sql.Time;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class PlayRoom implements Serializable {

    String name;
    List<Toy> toys;
    List<Child> children;

    int maxChildren;

    public int getMaxChildren() {
        return maxChildren;
    }

    double budget;
    Time openTime;
    Time closeTime;
    double price;
    boolean isOpen;

    public boolean isOpen() {
        Time nowTime = Time.valueOf(LocalTime.now());
        if(openTime.before(nowTime) && closeTime.after(nowTime)){
            isOpen = true;
        }else {
            isOpen = false;
            for (Child i : children) {
                Children.getChildren().add(i);
                children.remove(i);
            }
        }

        return isOpen;
    }

    public void spendMoney(double price){
        if(budget - price < 0){
            System.out.println("not enough money");
        }else {
            budget -= price;
        }
    }

    public void payForChild(){
        budget += price;
    }
    public void addChild(Child child){
        children.add(child);
    }

    public void addChildren(List<Child> children){
        children.addAll(children);
    }

    public List<Child> getChildren() {
        return children;
    }

    @Override
    public String toString() {
        return  name +
                ", toys in room" + toys.toString() +
                ", children in room"  + children.toString() +
                ", out of " + maxChildren +
                ", is open" + isOpen +
                ", budget = " + budget +
                ", opens in " + openTime +
                ", closes in " + closeTime +
                ", price to enter " + price ;
    }

    public void addToy(Toy toy){
        toys.add(toy);
    }
    public PlayRoom(String name, int maxChildren, double budget, Time openTime, Time closeTime, double price) {
        this.name = name;
        this.maxChildren = maxChildren;
        this.budget = budget;
        this.openTime = openTime;
        this.closeTime = closeTime;
        this.price = price;
        toys = new LinkedList<Toy>();
        children = new LinkedList<Child>();
    }
}
