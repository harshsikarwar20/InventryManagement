package com.example.InventryManagement.Service;

import com.example.InventryManagement.Model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class Inventory {

    public static ArrayList<Product> list = new ArrayList<>();
    static {
        list.add(new Product("Apple",1.0,10));
        list.add(new Product("Banana",0.5,20));

    }

    public List<Product> displayInventory() {
        return list;
    }

    public String addProduct(List<Product> list) {
        for(int i=0; i<list.size(); i++){
            list.add(list.get(i));
        }
        return "Product has been added...";
    }

    public String updateQuantityByName(String name , int quantity) {
        for(int i=0; i<list.size(); i++){
            if(list.get(i).getName().equals(name)){
                list.get(i).setQuantity(quantity);
                return "product updated successfully...";
            }
        }
        return "product is not in the list";
    }
}
