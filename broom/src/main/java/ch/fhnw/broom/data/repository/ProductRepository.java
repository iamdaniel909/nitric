package ch.fhnw.broom.data.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ch.fhnw.broom.data.domain.Product;

@Repository 
public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findAll();
    Product findByProductName(String productName);
    Product findByProductId(Long productId);
    List<Product> findByNameContaining(String name);
    List<Product> findByDescriptionContaining(String description);

    
}