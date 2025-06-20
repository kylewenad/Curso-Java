package acountingZara;

public class Data {
    private static String name;
    private static String address;
    private static int phoneNumber;
    private static int nif;
    private static String client;

    String message = """
            Nombre de %s:          %s
            Dirección:              %s
            Teléfono:               %s
            """;

    public Data(String name, String address, int phoneNumber){
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.nif = nif;
    }
   public void showData(){
        
        System.out.println(message.formatted(client,name, address, phoneNumber));
    }

}

