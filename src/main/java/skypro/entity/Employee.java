package skypro.entity;

import javax.persistence.*;

@Entity
@Table(name = "Employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "departament")
    private Integer departament;
    @Column(name = "solary")
    private Integer solary;

    public Employee() {
    }

    public Employee(String name, Integer departament, Integer solary) {
        this.name = name;
        this.departament = departament;
        this.solary = solary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getDepartament() {
        return departament;
    }

    public void setDepartament(Integer departament) {
        this.departament = departament;
    }

    public Integer getSolary() {
        return solary;
    }

    public void setSolary(Integer solary) {
        this.solary = solary;
    }
}