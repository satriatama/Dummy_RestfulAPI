package com.example.belajarrestfulAPI.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "tabel_product")
public class Product implements Serializable{

    @Id //digunakan untuk tabel id
    @GeneratedValue(strategy = GenerationType.IDENTITY)     //digunakan untuk auto increment
    private long id;

    private String name;

    private Double price;

    public Product() {
    }

    public Product(long id, String name, Double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
