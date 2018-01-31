package com.OneToMany.EmpAdrr.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity

public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "address_id_seq")
    @SequenceGenerator(name = "address_id_seq", sequenceName = "address_id_seq", allocationSize = 1)
    private long id;
    private String street;
    private String state;
    private String city;

//    @Column(name = "empid")
//    private long empid;
//
//    public long getEmpid() {
//        return empid;
//    }
//
//    public void setEmpid(long empid) {
//        this.empid = empid;
//    }

//    public Address() {
//    }

    @ManyToOne
    @JoinColumn(name = "empid", nullable = false)
    //  @JsonBackReference
    @JsonIgnore
    private Employee employee;

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }


}
