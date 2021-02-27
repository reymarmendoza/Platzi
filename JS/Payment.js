class Cash extends Payment{
    constructor(id){
        super(id)
    }
}
/*
antes de ESC6
function Payment(){
    this.id;
}
*/
/*
a partir de ESC6
class Payment{
    constructor(){
        this.id;
    }
}
*/