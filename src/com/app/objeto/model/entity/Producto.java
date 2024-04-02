package com.app.objeto.model.entity;

public class Producto {
    private int id;
    private String nombre;
    private float precio;

    public Producto(int id) {
        this.id = id;
        this.nombre = "indefinido";
        this.precio = 0;
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
