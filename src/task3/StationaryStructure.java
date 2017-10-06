package task3;

/**
 * Created by anton on 29.09.17.
 */
public class StationaryStructure {


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

abstract class Pen implements Sellable, Namable, Writeable{}
abstract class Notepad implements Sellable, Namable, Notable{}
abstract class Pencil implements Sellable, Namable, Writeable{}
abstract class Notebook implements Sellable, Namable, Notable{}
abstract class Glue implements Sellable, Namable{}
abstract class Eraser implements Sellable, Namable, Eraserer{}



