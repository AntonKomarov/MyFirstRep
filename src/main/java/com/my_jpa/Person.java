package com.my_jpa;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "person")
public class Person {

    @Id
    @GeneratedValue
    private int id;

    @Column
    @Getter
    @Setter
    private String name;

    @Getter
    @Setter
    @Column
    private String surname;


    @Setter
    @Getter
    @Column
    private String patronymic;



}
