package ch.fhnw.broom.data.domain;

import java.util.List;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;


@Entity
@Table(name = "product")
public class Product {
    
    @Id 
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "product_name")
    private String productName;

    @Column(name = "product_price")
    private int productPrice;

    @Column(name = "product_group")
    private String productGroup;

    @ManyToOne (mappedBy = "product")
    private Catalogue catalogue;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String name) {
        this.productName = name;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(int price) {
        this.productPrice = price;
    }

    public String getProductGroup() {
        return productGroup;
    }

    public void setProductGroup(String group) {
        this.productGroup = group;
    }


}
