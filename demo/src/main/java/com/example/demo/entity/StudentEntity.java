package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "student")
public class StudentEntity {

    @Id
    @Column(name = "id", length = 50)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "name", length = 50)
    private String name;
    @Column(name = "contact", length = 12)
    private int contact;
    @Column(name = "address", length = 100)
    private String address;

    public StudentEntity(String name, int contact, String address) {
        this.name = name;
        this.contact = contact;
        this.address = address;
    }

    public StudentEntity(int id, String name, int contact, String address) {
        this.id = id;
        this.name = name;
        this.contact = contact;
        this.address = address;
    }

    public StudentEntity() {

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

    public int getContact() {
        return contact;
    }

    public void setContact(int contact) {
        this.contact = contact;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", contact=" + contact +
                ", address='" + address + '\'' +
                '}';
    }

}
