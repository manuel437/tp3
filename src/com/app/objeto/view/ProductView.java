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
    public Product cargarProduct(int id){
        Product productDevol = new Product(id);

        System.out.println("Ingrese nombre del producto");
        String nombreProduct = scanner.nextLine();
        productDevol.setNombre(nombreProduct);

        System.out.println("Ingrese precio del producto");
        float precioProduct = scanner.nextFloat();
        this.getScanner().nextLine();
        productDevol.setPrecio(precioProduct);

        return productDevol;
    }
    */
    public void menuPrincipal(){
        System.out.println("");
        System.out.println("Menu");
        System.out.println("1- Agregar producto");
        System.out.println("2- Mostrar productos");
        System.out.println("3- Modificar precio producto");
        System.out.println("4- Eliminar producto");
        System.out.println("0- Salir");
    }
}

