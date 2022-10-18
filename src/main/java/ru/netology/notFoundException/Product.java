package ru.netology.notFoundException;

public class Product {
    protected int id;
    protected String name;
    protected int price;

    public Product(int id, String name, int price, String title) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}