package com.coderhouse.controleradvice.controller;

import com.coderhouse.controleradvice.handle.ProductError;
import com.coderhouse.controleradvice.model.Product;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/products")
public class ProductController {
    private List<Product> productList = new ArrayList<Product>();

    @GetMapping
    public List<Product> getProductList() throws ProductError {
        if(productList.isEmpty()){
            throw new ProductError("No hay productos cargados");
        }
        return productList;
    }


    @PostMapping
    public String addProduct(@RequestBody Map<String,String> requestParam) {
        String price = requestParam.get("price");
        String title = requestParam.get("title");
        Product product = new Product(title, Integer.parseInt(price));
        productList.add(product);
        product.setId(productList.size());
        return "Se agrego un producto con el siguiente ID: " + productList.size();
    }

    @GetMapping("/{id}")
    public Product getProduct(@PathVariable Integer id) throws ProductError {
        for(Product product : productList){
            if(product.getId() == id){
                return product;
            }
        }
        throw new ProductError("El producto con el ID solicitado no existe :( ");
    }

}

