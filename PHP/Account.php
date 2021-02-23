<?php

class Account {
    public $id;
    public $name;
    public $document;
    public $email;
    public $password;

    public function __construct($valorName, $valorEmail){
        $this -> name = $valorName;
        $this -> email = $valorEmail;
    }
}

?>