package Java;

import java.util.ArrayList;
import java.util.Map;

class UberVan extends Car { // extends implementa la herencia
    Map<String, Map<String, Integer>> typeCarAccepted;
    ArrayList<String> seatsMaterial;
    Integer passenger; // este atributo esta ligado a la implementacion del polimorfismo
    
    public UberVan(String license, Account driver, Map<String, Map<String, Integer>> typeCarAccepted, ArrayList<String> seatsMaterial){
        super(license, driver);
        this.typeCarAccepted = typeCarAccepted;
        this. seatsMaterial = seatsMaterial;
    }
    // este es un segundo constructor, de acuerdo a los parametros que reciba la clase usara uno u otro
    public UberVan(String license, Account driver){
        super(license, driver);
    }
    // aplicando el polimorfismo, cuando se invoque setPassenger desde el padre el que se va a ejecutar es la version del hijo
    @Override
    public void setPassenger(Integer passenger){ // como passenger existe en esta version de la clase entonces se debe asignar el atributo a la clase
        if(passenger == 6){
            this.passenger = passenger;
        }else{
            System.err.println("Debe asignar 4 pasajeros");
        }
    }
}