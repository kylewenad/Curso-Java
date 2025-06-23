package acountingZara;

import java.util.UUID;

public class DataCompany {
   
    private String name;
    private String address;
    private int phoneNumber;
    private String nif;
    private String client;

    public String renderHeaderCompany(){
            """ 
            ==================================
            Empresa:                %s
            Nif: %s
            Dirección:              %s
            Teléfono:               %s
            """.formatted(name, nif, address, phoneNumber);
    }
    public String renderClient() {
            """
            ==================================
            Cliente:                %s
            Nif: %s
            Dirección:              %s
            Teléfono:               %s
            """.formatted(name, nif, address, phoneNumber);
    }
    public DataCompany(String name, String nif, String address, int phoneNumber){
        this.name = name;
        this.nif = nif;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    }



