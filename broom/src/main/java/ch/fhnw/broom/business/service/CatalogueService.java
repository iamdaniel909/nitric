package ch.fhnw.broom.business.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ch.fhnw.broom.data.domain.Catalogue;
import ch.fhnw.broom.data.domain.Order;
import ch.fhnw.broom.data.domain.Product;
import ch.fhnw.broom.data.domain.Student; 
import ch.fhnw.broom.domain.repository.ProductRepository;

@Service
public class CatalogueService {

    @Autowired
    private ProductRepository productRepository;

    public Product findProductByID(Long id) {
        Product product = productRepository.findByProductId(id).get();
        return product;
    }

    public List<Product> getAllProducts() {
        List<Product> productList = productRepository.findAll();
        return productList;
    }

    

}