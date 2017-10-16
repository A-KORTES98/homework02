package task3;

/**
 * Created by anton on 13.10.17.
 */
public class Notepad extends StationaryItem implements Notable{
    {
        cost = 60;
        name = "Notepad";
    }

    public Notepad(){
        super();
    }

    public Notepad(String name){
        super(name);
    }

    public Notepad(double cost){
        super(cost);
    }

    public Notepad(double cost, String name){
        super(cost,name);
    }
}
