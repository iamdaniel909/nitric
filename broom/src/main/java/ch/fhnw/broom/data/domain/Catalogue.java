package ch.fhnw.broom.data.domain;

import java.lang.annotation.Inherited;
import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Catalogue {
    @id
    @JsonIgnore
    private Long id;

    @oneToMany(mappedBy = "catalogue")
    private List<Product> products;

    private String currentOffer;

    public Catalogue() {
    }

    public Catalogue(String currentOffer) {
        this.currentOffer = currentOffer;
    }

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

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;

    }


}