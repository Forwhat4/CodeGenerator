package com.demo.codegenerator.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="city",schema="mydatabase")
public class City {

    @Id
    private int id;

    private String name;

    private String code;

    private String province;

    private String description;


}
