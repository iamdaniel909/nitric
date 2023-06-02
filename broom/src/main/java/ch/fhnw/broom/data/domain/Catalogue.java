package ch.fhnw.broom.data.domain;

import java.util.List;

import java.lang.annotation.Inherited;
import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Catalogue {

    @Id
    @JsonIgnore
    private Long id;

    @OneToMany(mappedBy = "catalogue")
    private List<Product> productList;

    private String currentOffer;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCurrentOffer() {
        return currentOffer;
    }

    public void setCurrentOffer(String currentOffer) {
        this.currentOffer = currentOffer;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;

    }


}