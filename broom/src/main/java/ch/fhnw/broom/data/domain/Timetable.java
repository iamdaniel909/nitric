package ch.fhnw.broom.data.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.lang.annotation.Inherited;
import java.util.List;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;



@Entity
@Table(name = "timetable")
public class Timetable {

    @id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "SchoolYear")
    private String schoolyear;

    @Column(name = "Course")
    private String course;

    @OneToMany(mappedBy = "timetable")
    private Student student;

    public Timetable() {
    }

    public Timetable(String schoolyear, String course) {
        this.schoolyear = schoolyear;
        this.course = course;
    }

    public Long getId() {
        return id;
    }

    public String getSchoolyear() {
        return schoolyear;
    }

    public String getCourse() {
        return course;
    }

    public Student getStudent() {
        return student;
    }

    public void setSchoolyear(String schoolyear) {
        this.schoolyear = schoolyear;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public void setId(Long id) {
        this.id = id;
    }




}
