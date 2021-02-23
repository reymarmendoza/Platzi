<?php

class Car{
    public $id;
    public $license;
    public $driver;
    public $passenger;

    public function __construct($addLicense, $addDriver){
        $this -> license = $addLicense;
        $this -> driver = $addDriver;
    }

    public function echo_License_Driver_Email(){
        echo 'La licencia es: '
        . $this -> license .'<br>'
        .'El conductor es: '. $this -> driver -> name .'<br>'
        . 'El correo de contacto es: ' . $this -> driver -> email;
    }
}

?>