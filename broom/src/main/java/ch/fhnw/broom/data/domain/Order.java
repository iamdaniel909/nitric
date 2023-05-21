package ch.fhnw.broom.data.domain;

import java.lang.annotation.Inherited;

@Entity
@Table(name = "orders")
public class Order {
    
    @Id 
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    
}
