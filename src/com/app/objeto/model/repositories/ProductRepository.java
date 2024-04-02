package com.app.objeto.model.repositories;

import com.app.objeto.model.entity.Product;

import java.util.ArrayList;

public class ProductRepository {
    private ArrayList<Product> listProduct;
    private int idAssig = 0;
    public ProductRepository() {

        this.listProduct = new ArrayList<>();
    }

    public int getIdAssig() {
        return idAssig;
    }

    public ArrayList<Product> getListProduct() {
        return listProduct;
    }

    public void addListProduct(Product product){
        this.listProduct.addLast(product);
        this.idAssig++;
    }

    public int posProductoListProductXNombre(String nombreBus) {

        int pos = -1;

        for (int i = 0; i < this.listProduct.size() && pos == -1; i++) {
            if (this.listProduct.get(i).getNombre().equals(nombreBus)) {
                pos = i;
            }

        }
        return pos;
    }
    public void deleteListProduct(int id){
        int flag=0;


        for (int i=0; i<this.getListProduct().size() && flag==0; i++ ){
            if(this.getListProduct().get(i).getId() == id){
                for (int y = i; y<this.getListProduct().size()-1;y++) {
                    this.getListProduct().set(y,this.getListProduct().get(y + 1)) ;
                }
                this.getListProduct().remove(this.getListProduct().size()-1);
                flag=1;
            }
        }

    }



}
