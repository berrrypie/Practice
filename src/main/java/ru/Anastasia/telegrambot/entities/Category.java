package ru.Anastasia.telegrambot.entities;

import javax.persistence.*;

/** Сущность категория товара */
@Entity
public class Category {

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false,length = 50)
    private String name;

    @ManyToOne
    private Category parent;


    public void setParent(Category parent) {
        this.parent = parent;
    }

    public Category getParent() {
        return parent;
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

