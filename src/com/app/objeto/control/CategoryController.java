package com.app.objeto.control;

import com.app.objeto.model.entity.Category;
import com.app.objeto.model.entity.Product;
import com.app.objeto.model.repositories.CategoryRepository;

import com.app.objeto.view.CategoryView;

import java.util.Locale;

public class CategoryController {
    private CategoryRepository categoryRepository;
    private CategoryView categoryView;

    public CategoryController() {
        this.categoryRepository = new CategoryRepository();
        this.categoryView = new CategoryView();
    }

    public CategoryRepository getCategoryRepository() {
        return categoryRepository;
    }

    public void setCategoryRepository(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public CategoryView getCategoryView() {
        return categoryView;
    }

    public void setCategoryView(CategoryView categoryView) {
        this.categoryView = categoryView;
    }


    public void createAndAddCategory(){
        Category category = new Category();
        category.setNombreCategoria(getCategoryView().inNombreCategory());

        this.categoryRepository.addListCategory(category);
    }

    public void printCategoryList(){
        int i = 0;
        while(i< this.getCategoryRepository().getListCategory().size()){
            this.categoryView.printCategory(this.getCategoryRepository().getListCategory().get(i));

            i++;
        }

    }

    public void modCategory(){
        int i = this.categoryRepository.posCategoryListXNombre(this.categoryView.inNombreCategory());
        if(i != -1){
            this.categoryView.printCategory(this.categoryRepository.getListCategory().get(i));
            System.out.println("Ingrese el nuevo nombre");
            this.categoryRepository.getListCategory().get(i).setNombreCategoria(this.categoryView.inNombreCategory());

        }else{
            System.out.println("No se pudo encontrar");
        }
    }

    public void deleteCategoryFromList(){
        String nom = this.categoryView.inNombreCategory();
        int i = this.categoryRepository.posCategoryListXNombre(nom);
        if(i != -1){
            this.categoryRepository.deleteCategoryFromList(nom);
        }else{
            System.out.println("No se pudo encontrar");
        }
    }

}
