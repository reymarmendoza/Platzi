package Java;

class UberPool extends Car { // extends implementa la herencia
    String brand;
    String model;
    
    public UberPool(String license, Account driver, String brand, String model){
        super(license, driver); // super hace referencia a los metodos y atributos de la clase padre
        this.brand = brand; // mientras this hace referencia a los elementos de la clase donde esta ubicada
        this.model = model;
    }
}
