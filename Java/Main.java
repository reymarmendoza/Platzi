package Java;

class Main {
    public static void main(String[] args){
        UberX UberX = new UberX("AMQ123", new Account("Andres Herrera", "AND123"), "Tesla", "Model S");
        UberX.setPassenger(4);
        UberX.printDataCar();

        UberVan UberVan = new UberVan("HIA167", new Account("Andrea Caceres", "AND789"));
        UberVan.setPassenger(6);
        UberVan.printDataCar();
        /*
        Car car2 = new Car();
        car2.license = "";
        car2.driver = "";
        car2.passenger = 4;
        car2.printDataCar();
        */
        // del bloque comentado anterior se convierte en esto:
        /*
        Car car2 = new Car("QWE567", new Account("Andrea Caceres", "AND789"));
        car2.passenger = 4;
        car2.printDataCar();
        */
    }
}