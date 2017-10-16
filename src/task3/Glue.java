package task3;

public class Glue extends StationaryItem {
    {
        cost = 45;
        name = "Glue";
    }

    public Glue(){ super(); }

    public Glue(String name) { super(name); }

    public Glue(double cost) { super(cost); }

    public Glue(double cost, String name) { super(cost, name); }
}
