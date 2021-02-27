package Java;

class UberX extends Car { // extends implementa la herencia
    String brand;
    String model;
    Integer passenger;
    
    public UberX(String license, Account driver, String brand, String model){
        super(license, driver); // super hace referencia a los metodos y atributos de la clase padre
        this.brand = brand; // mientras this hace referencia a los elementos de la clase donde esta ubicada
        this.model = model;
    }
    @Override
    void printDataCar(){
        super.printDataCar(); // lo que hace es que ejecute el comportamiento del metodo padre
        System.out.println(String.format("Modelo: %s\nBrand: %s\n", model, brand)); // luego este hijo
    }
}