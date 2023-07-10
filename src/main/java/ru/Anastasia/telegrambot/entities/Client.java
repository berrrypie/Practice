package ru.Anastasia.telegrambot.entities;


import javax.persistence.*;

@Entity
public class Client { // Сущность клиент
    @Id
    @GeneratedValue // Значение будет сгенерировано автоматически
    private Long id; // Уникальный идентификатор
    @Column(nullable = false)
    private Long externalId; //Внешний идентификатор Telegram
    @Column(nullable = false,length = 255)
    private String fullName; // Имя клиента или форма обращения
    @Column(nullable = false,length = 15)
    private String phoneNumber; // номер телефона
    @Column(nullable = false,length = 400)
    private String address; // адрес

    // Геттеры и сеттеры для private-полей

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
