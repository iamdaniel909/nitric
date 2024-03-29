package ch.fhnw.broom.data.domain;

import java.lang.annotation.Inherited;
import java.util.Date;
import jakarta.persistance.Id;
import jakarta.persistance.GeneratedValue;
import jakarta.persistance.GenerationType;
import jakarta.persistance.Column;
import jakarta.persistance.Entity;
import jakarta.persistance.Table;
import jakarta.persistance.ManyToMany;


@Entity
@Table(name = "orders")
public class Order {
    
    @Id 
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "order_amount")
    private int orderAmount;

    @Column(name = "order_date")
    private Date orderDate;

    @ManyToMany
    private Student student;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(int amount) {
        this.orderAmount = amount;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date date) {
        this.orderDate = date;
    }


}
