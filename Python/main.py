from car import Car

if __name__ == "__main__":
    car = Car()
    car.license = "AMS234"
    car.driver = "Carlos Alberto"
    car.passenger = 4
    print(vars(car)) # vars imprimi los atributos del objeto