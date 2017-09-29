package task2;

/**
 * Created by anton on 29.09.17.
 */
public class Notebook implements Evaluated{
    private double cost;

    Notebook(double cost){
        this.cost = cost;
    }

    @Override
    public double getCost() {
        return cost;
    }
}
