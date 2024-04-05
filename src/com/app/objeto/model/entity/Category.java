package com.app.objeto.model.entity;

import com.app.objeto.control.ProductController;
import com.app.objeto.model.repositories.ProductRepository;
import com.app.objeto.view.ProductView;

public class Category  {

    private String nombreCategoria;


    public Category( ) {

        this.nombreCategoria ="indefinido";
    }
    public Category(String nombreCat ) {

        this.nombreCategoria =nombreCat;
    }



    public String getNombreCategoria() {
        return nombreCategoria;
    }

    public void setNombreCategoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }
}
