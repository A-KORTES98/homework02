package task3;

/**
 * Created by anton on 13.10.17.
 */
public class Pen extends StationaryItem implements Writeable{
    double cost;
    String name;

    {
        cost = 20;
        name = "Pen";
    }

    public Pen(){ super(); }

    public Pen(String name){ super(name); }

    public Pen(Double cost){ super(cost); }

    public Pen(double cost, String name){ super(cost, name); }
}
