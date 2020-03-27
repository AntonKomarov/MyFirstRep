package com.my_jpa;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "contact")
public class Contact {

    @Id
    private int id;

    @Column
    @Getter
    @Setter
    private String telephoneNumber;

    @OneToOne
    private Person person;
}
