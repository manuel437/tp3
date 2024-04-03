package com.app.objeto.model.repositories;

import com.app.objeto.model.entity.Product;
import com.app.objeto.model.entity.Category;
import java.util.ArrayList;

public class CategoryRepository {
    private ArrayList<Category> listCategory;
    private int idAssig = 0;
    public CategoryRepository() {

        this.listCategory = new ArrayList<>();
    }

    public int getIdAssig() {
        return idAssig;
    }

    public ArrayList<Category> getListCategory() {
        return listCategory;
    }

    public void addListCategory(Category category){
        this.listCategory.addLast(category);
        this.idAssig++;
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
    public void deleteCategoryFromList(int id){
        int flag=0;


        for (int i=0; i<this.getListCategory().size() && flag==0; i++ ){
            if(this.getListCategory().get(i).getIdCategory() == id){
                for (int y = i; y<this.getListCategory().size()-1;y++) {
                    this.getListCategory().set(y,this.getListCategory().get(y + 1)) ;
                }
                this.getListCategory().remove(this.getListCategory().size()-1);
                flag=1;
            }
        }

    }


}
