<?php

require_once("Car.php");

class UberX extends Car {
    public $brand;
    public $model;

    public function __construct($license, $driver, $brand, $model){
        parent::__construct($license, $driver); // equivale al super de java
        $this->brand = $brand;
        $this->model = $model;
    }

}

?>