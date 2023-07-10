package ru.Anastasia.telegrambot.entities;

import javax.persistence.*;

@Entity
public class ClientOrder { // Сущность Заказ клиента
    @Id
    @GeneratedValue // Значение будет сгенерировано автоматически
    private Long id; // Уникальный идентификатор
    @ManyToOne // Тип связи в БД - "Многие к одному"
    private Client client; // Клиент, сделавший заказ
    @Column(nullable = false)
    private Integer status; // Статус заказа
    @Column(nullable = false)
    private Double total; // Сумма по заказу

    // Геттеры и сеттеры для private-полей

    public void setTotal(Double total) {
        this.total = total;
    }

    public Double getTotal() {
        return total;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getStatus() {
        return status;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Client getClient() {
        return client;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
