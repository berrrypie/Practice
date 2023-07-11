package ru.Anastasia.telegrambot.entities;

import javax.persistence.*;

/** Сущность клиент */
@Entity
public class Client {

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private Long externalId;

    @Column(nullable = false,length = 255)
    private String fullName;

    @Column(nullable = false,length = 25)
    private String phoneNumber;

    @Column(nullable = false,length = 400)
    private String address;


    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Long getExternalId() {
        return externalId;
    }

    public void setExternalId(Long externalId) {
        this.externalId = externalId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
