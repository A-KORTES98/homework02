package task6_7;





public class AtomicShipTest{
    public static void main(String[] args) {
        AtomicSubmar aShip = new AtomicSubmar();
        aShip.runAtomicSubmar();
    }
}


/**
 * This class describes the entity of underwater atomic ship
 *
 * @author Mazur Anton
 * @version 1.0
 */
class AtomicSubmar{
    /**
     * Method that run the atomic underwater ship
     */
    public void runAtomicSubmar(){
        AtomicSubmarEngine aEng = new AtomicSubmarEngine();
        aEng.runEngine();
    }
    /**
     * This class describes the entity of  engine of
     * underwater atomic ship
     *
     * @author Mazur Anton
     * @version 1.0
     */
    private class AtomicSubmarEngine{
        /**
         * Method that run the engine
         */
        private void runEngine(){}
    }
}
