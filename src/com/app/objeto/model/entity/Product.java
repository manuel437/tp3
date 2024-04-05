package com.app.objeto.model.entity;

import com.app.objeto.control.CategoryController;

public class Product {
    private int id;
    private String nombre;
    private float precio;
    private CategoryController categoryController;


    public Product(int id) {
        this.id = id;
        this.nombre = "indefinido";
        this.precio = 0;
        this.categoryController = new CategoryController();

    }

    public CategoryController getCategoryController() {
        return categoryController;
    }

    public void setCategoryController(CategoryController categoryController) {
        this.categoryController = categoryController;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
}
