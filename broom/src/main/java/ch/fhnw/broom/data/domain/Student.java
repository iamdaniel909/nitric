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
    
    @Id
    private String email;

    private String name;

    @JsonIgnore
    @OneToMany(mappedBy = "student")
    private List<Booking> bookings;

    public Student() {
    }

    public Student(String email, String name) {
        this.email = email;
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public List<Booking> getBookings() {
        return bookings;
    }

}
