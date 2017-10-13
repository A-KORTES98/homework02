package task3;

/**
 * Created by anton on 29.09.17.
 */
public class StationaryStructure {
    public static void main(String[] args) {
        Notepad np = new Notepad();
        System.out.println("Cost:" + np.getCost() + "      Name: " + np.getName());
    }

}

interface Sellable{
    double getCost();
}
interface Namable{
    String getName();
}

interface Writeable{}
interface Eraserer{}
interface Notable{}

class Pen implements Sellable, Namable, Writeable{
    double cost;
    String name;

    {
        System.out.println("in super init block");
        cost = 20;
        name = "Pen";
    }

    Pen(){}

    Pen(double cost){}

    Pen(String main){}

    Pen(double cost, String name){
        System.out.println("In super constructor");
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
}

abstract class StationaryItem implements Sellable, Namable{
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
}

class Notepad extends StationaryItem implements Notable{
    {
        cost = 60;
        name = "Notepad";
    }
    
    Notepad(){
        super();
    }

    Notepad(String name){
        super(name);
    }

    Notepad(double cost){
        super(cost);
    }

    Notepad(double cost, String name){
        super(cost,name);
    }
}


class Pencil extends StationaryItem implements Notable, Writeable{
    {
        cost = 15;
        name = "Pencil";
    }
    
    Pencil(){ super(); }
    
    Pencil(String name){ super(name); }
    
    Pencil(Double cost){ super(cost); }
    
    Pencil(double cost, String name){ super(cost, name); }
}

class Notebook extends StationaryItem implements Notable{
    {
        cost = 30;
        name = "Notebook";
    }
    
    Notebook(){ super(); }
    
    Notebook(String name) { super(name); }
    
    Notebook(double cost) { super(cost); }
    
    Notebook(double cost, String name) { super(cost, name); }
}

class Glue extends StationaryItem implements Namable{
    {
        cost = 45;
        name = "Glue";
    }

    Glue(){ super(); }

    Glue(String name) { super(name); }

    Glue(double cost) { super(cost); }

    Glue(double cost, String name) { super(cost, name); }
}

class Eraser extends StationaryItem implements Eraserer{
    {
        cost = 10;
        name = "Eraser";
    }

    Eraser(){ super(); }

    Eraser(String name) { super(name); }

    Eraser(double cost) { super(cost); }

    Eraser(double cost, String name) { super(cost, name); }
}



