package task2;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by anton on 29.09.17.
 */
public class StationeryShop {

    private Map<Integer, List<Evaluated>> workers;

    StationeryShop(){
        workers = new HashMap<>();
    }

    public void addPurchase(int workerID, Evaluated purchase){
        if (!workers.containsKey(workerID)){
            List<Evaluated> purchs = new LinkedList<>();
            workers.put(workerID, purchs);
        }

        workers.get(workerID).add(purchase);
    }

    public double getWrkrPurchSum(int workerID){
        return workers.
                get(workerID).
                stream().
                mapToDouble(x -> x.getCost()).
                sum();
    }

    public double getAllPurchSum(){
        return workers.
                entrySet().
                stream().
                mapToDouble(x -> getWrkrPurchSum(x.getKey())).
                sum();
    }
}
