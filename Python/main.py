from car import Car
from account import Account

if __name__ == "__main__":
    car = Car("AMS132", Account("Carlos Alberto", "AMS234"))
    print(vars(car)) # vars imprime los atributos del objeto
    print(vars(car.driver))

# en python self funciona como this en los otros lenguajes
# __init__ se encarga de personalizar la instancia de la clase(constructor sin serlo propiamente)