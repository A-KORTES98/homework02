package task3;

/**
 * Created by anton on 13.10.17.
 */
public class Pencil extends StationaryItem implements Notable, Writeable{
    {
        cost = 15;
        name = "Pencil";
    }

    public Pencil(){ super(); }

    public Pencil(String name){ super(name); }

    public Pencil(Double cost){ super(cost); }

    public Pencil(double cost, String name){ super(cost, name); }
}
