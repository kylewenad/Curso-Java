package acountingZara;

public class Product {
    
    private String sku;
    //Stock keeping unit, número de referencia único
    private String name;
    private int unityPrice;

     public String getSku() {
        return sku;
    }

    public String getName() {
        return name;
    }

    public int getUnityPrice() {
        return unityPrice;
    }

    public Product(String sku, String name, int unitaryPrice) {
        this.sku = sku;
        this.name = name;
        this.unityPrice = unitaryPrice;
    }
        
    }

    // `chcp 65001` para poder escribir euros
