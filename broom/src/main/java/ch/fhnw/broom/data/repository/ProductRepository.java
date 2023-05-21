package ch.fhnw.broom.data.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ch.fhnw.broom.domain.Product;

@Repository 
public interface ProductRepository extends JpaRepository<Product, Long> {
    Product findByProductName(String productName);
    List<Product> findByNameContaining(String name);
    
}