package com.app.objeto.model.entity;

import com.app.objeto.control.ProductController;
import com.app.objeto.model.repositories.ProductRepository;
import com.app.objeto.view.ProductView;

public class Category  {

    private String nombreCategoria;
    private int idCategory;

    public Category(int idCategory) {
        this.idCategory = idCategory;
        this.nombreCategoria ="indefinido";
    }

    public int getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(int idCategory) {
        this.idCategory = idCategory;
    }

    public String getNombreCategoria() {
        return nombreCategoria;
    }

    public void setNombreCategoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }
}
