package task3;

public class Eraser extends StationaryItem implements Eraserer{
    {
        cost = 10;
        name = "Eraser";
    }

    public Eraser(){ super(); }

    public Eraser(String name) { super(name); }

    public Eraser(double cost) { super(cost); }

    public Eraser(double cost, String name) { super(cost, name); }
}
