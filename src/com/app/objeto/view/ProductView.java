package com.app.objeto.view;

import com.app.objeto.model.entity.Product;

import java.util.Scanner;

public class ProductView {
      private Scanner scanner;

    public ProductView() {
        this.scanner = new Scanner(System.in);
    }

    public Scanner getScanner() {
        return scanner;
    }

    public void printProduct(Product product){
        //System.out.println("Producto: " + product.getNombre() + " -------- $: " + product.getPrecio());
        System.out.println("id " + product.getId() + "|Producto: " + product.getNombre() + " -------- $: " + product.getPrecio());
        System.out.println("categorias pertenecientes:");
        product.getCategoryController().printCategoryList();
        System.out.println("");
    }

    public float inPrecioProduct(){

        System.out.println("Ingrese precio del producto");
        float precioProduct = scanner.nextFloat();
        this.getScanner().nextLine();
        return precioProduct;
    }
    public String inNombreProduct(){
        System.out.println("Ingrese nombre del producto");
        return scanner.nextLine();

    }
    /*
    public String inNombreCategoria(){
        System.out.println("Ingrese nombre de la categoria");
        return scanner.nextLine();
    }
    */
    public void menuPrincipal(){
        System.out.println("");
        System.out.println("Menu");
        System.out.println("1- Agregar producto");
        System.out.println("2- Mostrar productos");
        System.out.println("3- Modificar precio producto");
        System.out.println("4- Eliminar producto");
        System.out.println("5- Modificar categorias de un producto");
        System.out.println("6- Buscar productos bajo una categoria");
        System.out.println("0- Salir");
    }
    public void menuModCategoria(){
        System.out.println("");
        System.out.println("Menu");
        System.out.println("1- Agregar categoria");
        System.out.println("2- Quitar categoria");
        System.out.println("3- Modificar categoria");
        System.out.println("0- Atras");
    }
}

