package com.example.InventryManagement.Controller;

import com.example.InventryManagement.Model.Product;
import com.example.InventryManagement.Service.Inventory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    private Inventory inventory;
    @GetMapping(value = "/displayInventory/all")
    private List<Product> displayInventory(){
        return inventory.displayInventory();
    }

    @PostMapping(value = "/add/Product")
    private String addProduct(@RequestBody List<Product> list){
        return inventory.addProduct(list);
    }

    @PutMapping(value = "updateQuantity/name/{name}/quantity{quantity}")
    private String updateQuantityByName(@PathVariable String name , @PathVariable int quantity){
        return inventory.updateQuantityByName(name,quantity);
    }
}
