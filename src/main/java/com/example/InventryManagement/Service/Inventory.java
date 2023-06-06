package com.example.InventryManagement.Service;

import com.example.InventryManagement.Model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class Inventory {

    public static ArrayList<Product> productList = new ArrayList<>();
    static {
        productList.add(new Product("Apple",1.0,10));
        productList.add(new Product("Banana",0.5,20));

    }

    public List<Product> displayInventory() {
        return productList;
    }

    public String addProduct(List<Product> list) {
        for(int i=0; i<productList.size(); i++){
            productList.add(list.get(i));
        }
        return "Product has been added...";
    }

    public String updateQuantityByName(String name , int quantity) {
        for(int i=0; i<productList.size(); i++){
            if(productList.get(i).getName().equals(name)){
                productList.get(i).setQuantity(quantity);
                return "product updated successfully...";
            }
        }
        return "product is not in the list";
    }
}
