<?php 
    require_once("Car.php");
    require_once("UberX.php"); // tambien se puede >> require_once 'UberX.php'
    require_once("UberPool.php"); 
    require_once("Account.php"); 

    $uberX = new UberX("JDN789", new Account("Andres Herrera", "NHD159"), "Chevrolet", "spark");
    $uberX->printDataCar();
?>