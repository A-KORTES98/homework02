package task3;

/**
 * Created by anton on 13.10.17.
 */
public class Notebook extends StationaryItem implements Notable{
    {
        cost = 30;
        name = "Notebook";
    }

    public Notebook(){ super(); }

    public Notebook(String name) { super(name); }

    public Notebook(double cost) { super(cost); }

    public Notebook(double cost, String name) { super(cost, name); }
}
