package Java;

class Car {
    Integer id;
    String license;
    Account driver;
    Integer passenger;

    public Car(String license, Account driver){ // constructor
        this.license = license; // this.license > pertenece a la clase
        this.driver = driver;
    }

    void printDataCar(){
        System.out.println(String.format("License: %s\nDriver: %s\n", license, driver.name));
    }
}
