package com.app.objeto.control;

import com.app.objeto.model.entity.Product;
import com.app.objeto.model.repositories.ProductRepository;
import com.app.objeto.view.ProductView;

public class ProductController {
    private ProductRepository productRepository;
    private ProductView productView;

    public ProductController() {
        this.productRepository = new ProductRepository();
        this.productView = new ProductView();
    }

    public ProductRepository getProductRepository() {
        return productRepository;
    }

    public void setProductRepository(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public ProductView getProductView() {
        return productView;
    }

    public void setProductView(ProductView productView) {
        this.productView = productView;
    }

    public void createAndAddProduct(){
        Product product = new Product(productRepository.getIdAssig());
        product.setNombre(getProductView().inNombreProduct());
        product.setPrecio(getProductView().inPrecioProduct());
        this.productRepository.addListProduct(product);
    }

    public void printProductList(){
        int i = 0;
        while(i< this.getProductRepository().getListProduct().size()){
            this.productView.printProduct(this.getProductRepository().getListProduct().get(i));
            i++;
        }

    }

    public void modProduct(){
        int i = this.productRepository.posProductoListProductXNombre(this.productView.inNombreProduct());
        if(i != -1){
            this.productView.printProduct(this.productRepository.getListProduct().get(i));
            System.out.println("Ingrese los nuevos datos");
            this.productRepository.getListProduct().get(i).setNombre(this.productView.inNombreProduct());
            this.productRepository.getListProduct().get(i).setPrecio(this.productView.inPrecioProduct());

        }else{
            System.out.println("No se pudo encontrar");
        }
    }

    public void deleteProductFromListFinal(){
        int i = this.productRepository.posProductoListProductXNombre(this.productView.inNombreProduct());
        if(i != -1){
            this.productRepository.deleteListProduct(i);
        }else{
            System.out.println("No se pudo encontrar");
        }
    }
}
