package acountingZara;

//public enum PaymentSimple {
    //BIZZUM,
    //CARD,
    //TRANSFER
    

public enum Payment {
    BIZZUM("Bizzum"),
    CARD("Tarjeta de Crédito"),
    TRANSFER("Transferencia");

    
    private String name;

    @Override
    public String toString(){
        return name;
    }//es un método que ya existe

    private Payment(String name){
        this.name = name;
    }

}
