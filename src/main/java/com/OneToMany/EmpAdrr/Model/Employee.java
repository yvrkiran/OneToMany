package com.OneToMany.EmpAdrr.Model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "EMPLOYEE")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "empid_seq")
    @SequenceGenerator(name = "empid_seq", sequenceName = "empid_seq", allocationSize = 1)
    @Column(name = "empid")
    private long empid;

    @OneToMany(mappedBy = "employee")
    private Set<Address> addresses;

    public Set<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(Set<Address> addresses) {
        this.addresses = addresses;
    }

    @Column(name = "first_name")

    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    public long getEmpid() {
        return empid;
    }

    public void setEmpid(long empid) {
        this.empid = empid;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
