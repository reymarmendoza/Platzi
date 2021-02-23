<?php 
    require_once 'Account.php'; 
    require_once 'Car.php';

    $bochito = new Car('LEMM-180300', new Account('Marco Antonio', 'alguncorreo@gmail.com'));
        
    $bochito -> echo_License_Driver_Email();
?>