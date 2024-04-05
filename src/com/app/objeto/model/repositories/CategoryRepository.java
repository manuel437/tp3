package com.app.objeto.model.repositories;

import com.app.objeto.model.entity.Product;
import com.app.objeto.model.entity.Category;
import java.util.ArrayList;

public class CategoryRepository {
    private ArrayList<Category> listCategory;

    public CategoryRepository() {

        this.listCategory = new ArrayList<>();
    }



    public ArrayList<Category> getListCategory() {
        return listCategory;
    }

    public void addListCategory(Category category){
        this.listCategory.addLast(category);

    }

    public int posCategoryListXNombre(String nombreBus) {

        int pos = -1;

        for (int i = 0; i < this.listCategory.size() && pos == -1; i++) {
            if (this.listCategory.get(i).getNombreCategoria().equals(nombreBus)) {
                pos = i;
            }

        }
        return pos;
    }
    public void deleteCategoryFromList(String categoryName){
        int flag=0;


        for (int i=0; i<this.getListCategory().size() && flag==0; i++ ){
            if(this.getListCategory().get(i).getNombreCategoria() == categoryName){
                for (int y = i; y<this.getListCategory().size()-1;y++) {
                    this.getListCategory().set(y,this.getListCategory().get(y + 1)) ;
                }
                this.getListCategory().remove(this.getListCategory().size()-1);
                flag=1;
            }
        }

    }


    public int comprobarCategoria(String nomCatBus){
        int i = 0;
        int flag = 0;
        while(i< this.getListCategory().size() && flag == 0){
            if(this.getListCategory().get(i).getNombreCategoria().equals(nomCatBus) == true){
                flag = 1;
            }
            i++;
        }
        return flag;
    }


}
