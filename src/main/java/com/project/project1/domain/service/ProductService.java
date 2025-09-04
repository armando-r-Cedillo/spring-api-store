package com.project.project1.domain.service;

import com.project.project1.domain.Category;
import com.project.project1.domain.Product;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ProductService {

    public List<Product> getAll() {

        return getFakeData();

    }

    public Optional<List<Product>> getByCategory(int categoryId) {
        return Optional.of(getFakeData().stream().filter( product -> product.getProductId() == categoryId ).collect(Collectors.toList()));
    }

    public Optional<List<Product>> getScarsProducts(int quantity) {
        List<Product> ScarsProducts = getFakeData().stream().filter(product->
                        null != product.getCategory() &&
                         null != product.getCategory().getCategory()  &&
                        product.getCategory().getCategory().equalsIgnoreCase("scars")
        ).collect(Collectors.toList());
        return Optional.of(ScarsProducts);

    }

    public Optional<Product> getProduct(int productT) {
        return getFakeData().stream().filter(product -> product.getProductId()==productT).findFirst();

    }

    public Product save(Product product) {
        System.out.println("saved the product " + product.getName());
        return product;
    }

    public boolean delete(int productId) {

        Optional<Product> productExistence = getFakeData().stream().filter(product -> product.getProductId() == productId).findFirst();
        if (productExistence.isPresent()) {
            System.out.println("deleted " + productId);
            return true;
        }
        return false;
    }

    public List<Product> getFakeData() {


        return Arrays.asList(new Product("abc",1,1,2,200,true,new Category(1))
                , new Product("abd",1,1,2,200,true,new Category(2)));

    }

}