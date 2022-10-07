package com.cg.controller;


import lombok.extern.slf4j.Slf4j;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.model.ProductList;
import com.cg.service.ProductService;


@RestController
@Slf4j
@RequestMapping("/sortProducts")
public class ProductListIO {
    @Autowired
    ProductService productService;
     
    Logger logger=LoggerFactory.getLogger(ProductListIO.class);

    @PostMapping("")
    public ResponseEntity sortProducts(@RequestBody ProductList productList){
            long l = productList.size();
            logger.info("Input length " + l);
            return new ResponseEntity<>(productService.sortProducts(productList),HttpStatus.OK);
    }
}