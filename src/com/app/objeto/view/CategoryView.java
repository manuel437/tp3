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

        System.out.println( "|Categoria: " + category.getNombreCategoria());

    }


    public String inNombreCategory(){
        System.out.println("Ingrese nombre de la categoria");
        return scanner.nextLine();

    }


}

