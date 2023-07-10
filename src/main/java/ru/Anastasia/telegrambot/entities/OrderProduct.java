package ru.Anastasia.telegrambot.entities;

import javax.persistence.*;

@Entity
public class OrderProduct { // Сущность Заказ-Товар
    @Id
    @GeneratedValue // Значение будет сгенерировано автоматически
    private Long id; // Уникальный идентификатор
    @ManyToOne // Тип связи в БД - "Многие к одному"
    private ClientOrder clientOrder; // Заказ клиента
    @ManyToOne // Тип связи в БД - "Многие к одному"
    private Product product; // Товар в заказе
    @Column
    private Long countProduct; // Кол-во товара в заказе

    // Геттеры и сеттеры для private-полей

    public void setCountProduct(Long countProduct) {
        this.countProduct = countProduct;
    }

    public Long getCountProduct() {
        return countProduct;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Product getProduct() {
        return product;
    }

    public void setClientOrder(ClientOrder clientOrder) {
        this.clientOrder = clientOrder;
    }

    public ClientOrder getClientOrder() {
        return clientOrder;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
