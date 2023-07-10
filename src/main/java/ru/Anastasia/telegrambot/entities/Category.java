package ru.Anastasia.telegrambot.entities;

import javax.persistence.*;

@Entity
public class Category { // Сущность категория товара
    @Id
    @GeneratedValue // Значение будет сгенерировано автоматически
    private Long id; // Уникальный идентификатор
    @Column(nullable = false,length = 50)
    private String Name; // Название категории
    @ManyToOne // Тип связи в БД - "Многие к одному"
    private Category parent; // Родительская категория

    // Геттеры и сеттеры для private-полей

    public void setParent(Category parent) {
        this.parent = parent;
    }

    public Category getParent() {
        return parent;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getName() {
        return Name;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}

