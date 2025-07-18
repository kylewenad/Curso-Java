package com.cdsb.project.repositories;

import java.util.ArrayList;
import java.util.List;


import com.cdsb.project.entities.Product;

public class ProductsInMemoryRepo implements Repo<Product,Integer>{

    List<Product> products = new ArrayList<>();

    public int generateId() {

        if(products.isEmpty()) {
            return 1;
        }
        return products.getLast().getId() + 1;
    }

    @Override
    public List<Product> readAll() {
        return products;
    }

    @Override
    public Product readById(Integer id) throws Exception{
    //Opción 1    
        for (Product product : products) {
            if (product.getId() == id) {
                return product;
            }
        }
        throw new Exception("Producto no encontrado");
    }
        //Opción 2: no viable
        //??    products.forEach(product -> if(product.getId() == id ) {
        //??        return product;
        //??    });
        
        //Opción 3
        //return products.stream()
         //   .filter(product -> product.getId() == id)
         //   .findFirst();
    //}

    @Override
    public Product create(Product data) throws Exception {
        for (Product product : products) {
            if (product.getId() == data.getId()){
                throw new Exception("Producto ya existe");
            }
        }
            products.add(data);
            return data;
    }

    @Override
    public Product updateById(Product data) throws Exception {
        for (Product product : products) {
            if(product.getId() == data.getId()){
                products.remove(product);
                products.add(data);
                return product;
            }
        }
        throw new Exception("Producto ya existe");
    }

    @Override
    public Product deleteById(Integer id) throws Exception {
        for (Product product : products) {
            if(product.getId()== id) {
                products.remove(product);
                return product;
            }
        }
        throw new Exception("Producto no encontrado al borrar");
    }

   
}
