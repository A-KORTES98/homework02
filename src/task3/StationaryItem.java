package task3;

/**
 * Created by anton on 13.10.17.
 */
public abstract class StationaryItem implements Sellable, Namable{
    double cost;
    String name;

    StationaryItem(){}

    StationaryItem(double cost){
        this.cost = cost;
    }

    StationaryItem(String name){
        this.name = name;
    }

    StationaryItem(double cost, String name){
        this.cost = cost;
        this.name = name;
    }

    @Override
    public double getCost(){
        return cost;
    }

    @Override
    public String getName(){
        return name;
    }

    @Override
    public String toString(){
        return name + cost;
    }
}
