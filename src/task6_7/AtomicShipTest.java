package task6_7;





public class AtomicShipTest{
    public static void main(String[] args) {
        AtomicShip aShip = new AtomicShip();
        aShip.runAtomicShip();
    }
}


/**
 * This class describes the entity of underwater atomic ship
 *
 * @author Mazur Anton
 * @version 1.0
 */
class AtomicShip{
    /**
     * Method that run the atomic underwater ship
     */
    public void runAtomicShip(){
        AtomicShipEngine aEng = new AtomicShipEngine();
        aEng.runEngine();
    }
    /**
     * This class describes the entity of  engine of
     * underwater atomic ship
     *
     * @author Mazur Anton
     * @version 1.0
     */
    private class AtomicShipEngine{
        /**
         * Method that run the engine
         */
        private void runEngine(){}
    }
}
