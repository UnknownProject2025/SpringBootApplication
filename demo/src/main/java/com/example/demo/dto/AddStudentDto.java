package com.example.demo.dto;

public class AddStudentDto {

    private String name;
    private int contact;
    private String address;

    public AddStudentDto(String name, int contact, String address) {
        this.name = name;
        this.contact = contact;
        this.address = address;
    }

    public AddStudentDto() {

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
        return "AddStudentDto{" +
                "name='" + name + '\'' +
                ", contact=" + contact +
                ", address='" + address + '\'' +
                '}';
    }

}
