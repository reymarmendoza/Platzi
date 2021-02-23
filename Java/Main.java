package Java;

class Main {
    public static void main(String[] args){
        Car car = new Car("AMQ123", new Account("Andres Herrera", "AND123"));
        car.passenger = 4;
        car.printDataCar();
        /*
        Car car2 = new Car();
        car2.license = "";
        car2.driver = "";
        car2.passenger = 4;
        car2.printDataCar();
        */
        // del bloque comentado anterior se convierte en esto:
        Car car2 = new Car("QWE567", new Account("Andrea Caceres", "AND789"));
        car2.passenger = 4;
        car2.printDataCar();
    }
}