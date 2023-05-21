package ch.fhnw.broom.data.domain;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "studentFame")
    private String fname;

    @Column(name = "studentLname")
    private String lname;

    @Column(name = "Birthdate")
    private String birthdate;

    @Column(name = "Adress")
    private String adress;

    @Column(name = "House")
    private String house;

    @Column(name = "SchoolYear")
    private String schoolyear;

    @OneToMany
    private Order order;

    @JsonIgnore
    private List<Order> orders;
    @OneToMany(mappedBy = "student")
    

    public Student() {
    }

    public Student(String fname, String lname, String birthdate, String adress, String house, String schoolyear) {
        this.fname = fname;
        this.lname = lname;
        this.birthdate = birthdate;
        this.adress = adress;
        this.house = house;
        this.schoolyear = schoolyear;
    }

    public Long getId() {
        return id;
    }
    
    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public String getAdress() {
        return adress;
    }

    public String getHouse() {
        return house;
    }

    public String getSchoolyear() {
        return schoolyear;
    }

    public Order getOrder() {
        return order;
    }
    public List<Order> getOrders() {
        return orders;
    }
    public void setId(Long id) {
        this.id = id;

    }
    public void setFname(String fname) {
        this.fname = fname;

    }

    public void setLname(String lname) {
        this.lname = lname;

    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;

    }

    public void setAdress(String adress) {
        this.adress = adress;

    }

    public void setHouse(String house) {
        this.house = house;

    }

    public void setSchoolyear(String schoolyear) {
        this.schoolyear = schoolyear;

    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;

    }

    @Override
    public String toString() {
        return "Student [adress=" + adress + ", birthdate=" + birthdate + ", fname=" + fname + ", house=" + house
                + ", id=" + id + ", lname=" + lname + ", order=" + order + ", orders=" + orders + ", schoolyear="
                + schoolyear + "]";
    }


}
