package acountingZara;

import java.util.UUID;

public class Data {
   
    private String name;
    private String address;
    private int phoneNumber;
    private UUID nif;
    private String client;

    String messageCompany = """
            ==================================
            Empresa:                %s
            Nif: %s
            Dirección:              %s
            Teléfono:               %s
            """;
    
    String messageClient = """
            ==================================
            Cliente:                %s
            Nif: %s
            Dirección:              %s
            Teléfono:               %s
            """;

    public Data(String name, String address, int phoneNumber){
        this.name = name;
        this.nif = UUID.randomUUID();
        this.address = address;
        this.phoneNumber = phoneNumber;
    }
    public void showData(){
        
        System.out.println(messageCompany.formatted(name, nif, address, phoneNumber));

    }

    public void showDataClient(){
        
        System.out.println(messageClient.formatted(name, nif, address, phoneNumber));

    }

}

