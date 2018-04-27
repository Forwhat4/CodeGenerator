package com.demo.codegenerator.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
@Table(name = "person", schema = "mydatabase", catalog = "")
public class PersonEntity {
    private int id;
    private String name;
    private Integer sex;
    private String department;
    private BigDecimal salary;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "sex")
    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    @Basic
    @Column(name = "department")
    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Basic
    @Column(name = "salary")
    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonEntity that = (PersonEntity) o;
        return id == that.id &&
                Objects.equals(name, that.name) &&
                Objects.equals(sex, that.sex) &&
                Objects.equals(department, that.department) &&
                Objects.equals(salary, that.salary);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, name, sex, department, salary);
    }
}
