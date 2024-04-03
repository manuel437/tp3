package com.app.objeto.view;

import com.app.objeto.model.entity.Category;
import com.app.objeto.model.entity.Product;

import java.util.Scanner;

public class CategoryView {
    private Scanner scanner;

    public CategoryView() {
        this.scanner = new Scanner(System.in);
    }

    public Scanner getScanner() {
        return scanner;
    }

    public void printCategory(Category category){

        System.out.println("id: " + category.getIdCategory() + "|Categoria: " + category.getNombreCategoria());

    }


    public String inNombreCategory(){
        System.out.println("Ingrese nombre de la categoria");
        return scanner.nextLine();

    }

    public void menuPrincipal(){
        System.out.println("");
        System.out.println("Menu");
        System.out.println("1- Agregar categoria");
        System.out.println("2- Mostrar categorias");
        System.out.println("3- Modificar nombre categoria");
        System.out.println("4- Eliminar categoria");
        System.out.println("0- Salir");
    }
}

