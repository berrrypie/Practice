package ru.Anastasia.telegrambot.entities;

import javax.persistence.*;

@Entity
public class Product { // Сущность товар
    @Id
    @GeneratedValue // Значение будет сгенерировано автоматически
    private Long id; // Уникальный идентификатор
    @ManyToOne // Связь в БД - "многие к одному"
    private Category category; // Категория товара
    @Column(nullable = false, length = 50)
    private String name; // Наименование
    @Column(nullable = false, length = 400)
    private String description; // Описание
    @Column(nullable = false)
    private Double price; // Стоимость

    // Геттеры и сеттеры для private-полей

    public void setCategory(Category category) {
        this.category = category;
    }

    public Category getCategory() {
        return category;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getPrice() {
        return price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
