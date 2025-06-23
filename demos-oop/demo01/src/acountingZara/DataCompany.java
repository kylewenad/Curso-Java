package acountingZara;

public class DataCompany {
   
    private String name;
    private String address;
    private int phoneNumber;
    private String nif;

    public DataCompany(String name, String nif, String address, int phoneNumber){
        this.name = name;
        this.nif = nif;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }
    
    public String renderHeaderCompany(){
        return """
                ==============================================
                Empresa:                %s
                Nif:                    %s
                Dirección:              %s
                Teléfono:               %s
                """.formatted(name, nif, address, phoneNumber);
    }

    public String renderClient() {
        return """
                ==============================================
                Datos Cliente
                Empresa:                %s
                Nif:                    %s
                Dirección:              %s
                Teléfono:               %s
                """.formatted(name, nif, address, phoneNumber);
    }

    }



