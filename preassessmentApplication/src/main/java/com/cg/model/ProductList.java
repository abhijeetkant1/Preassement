package com.cg.model;

import java.util.ArrayList;
import java.util.List;

public class ProductList {
    public List<Product> productList = new ArrayList<>();

//    public ProductList(List<Product> productList){
//        this.productList = productList;
//    }
    public long size(){
        return this.productList.size();
    }
}

