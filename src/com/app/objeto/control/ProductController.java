package com.app.objeto.control;

import com.app.objeto.model.entity.Category;
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
        product.setNombre(this.getProductView().inNombreProduct());
        product.setPrecio(this.getProductView().inPrecioProduct());

        product.getCategoryController().createAndAddCategory();
        this.productRepository.addListProduct(product);
    }

    public void printProductList(){
        int i = 0;
        while(i< this.getProductRepository().getListProduct().size()){
            this.productView.printProduct(this.getProductRepository().getListProduct().get(i));
            i++;
        }
        if(i == 0){
            System.out.println("No hay productos cargados");
        }
    }

    public void modProduct(){
        int i = this.productRepository.posProductoListProductXNombre(this.productView.inNombreProduct());
        if(i != -1){
            this.productView.printProduct(this.productRepository.getListProduct().get(i));
            int opc = 0;
            do{
                this.productView.menuMod();
                opc = this.productView.getScanner().nextInt();
                this.productView.getScanner().nextLine();
                switch(opc){
                    case 1:
                        this.productRepository.getListProduct().get(i).setNombre(this.productView.inNombreProduct());
                        break;
                    case 2:
                        this.productRepository.getListProduct().get(i).setPrecio(this.productView.inPrecioProduct());
                        break;
                    case 3:
                        this.addCatProduct();
                        break;
                    case 4:
                        this.modCatProduct();
                        break;
                    case 5:
                        this.deleteCatProduct();
                        break;
                }
                System.out.println("");


            }while(opc != 0);


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

    public void addCatProduct(){
        int pos = this.productRepository.posProductoListProductXNombre(this.productView.inNombreProduct());
        if(pos == -1){
            System.out.println("No se encontro el producto a agregar");
        }else{
            this.productRepository.getListProduct().get(pos).getCategoryController().createAndAddCategory();
        }

    }
    public void deleteCatProduct(){
        int pos = this.productRepository.posProductoListProductXNombre(this.productView.inNombreProduct());
        if(pos == -1){
            System.out.println("No se encontro el producto a agregar");
        }else{
            this.productRepository.getListProduct().get(pos).getCategoryController().deleteCategoryFromList();
        }

    }
    public void modCatProduct(){
        int pos = this.productRepository.posProductoListProductXNombre(this.productView.inNombreProduct());
        if(pos == -1){
            System.out.println("No se encontro el producto a agregar");
        }else{
            this.productRepository.getListProduct().get(pos).getCategoryController().modCategory();
        }

    }
    public void menuModCategoriasProducto(){
        int opc = 0;
        do{
            this.productView.menuMod();
            opc = this.productView.getScanner().nextInt();
            this.productView.getScanner().nextLine();
            switch(opc){
                case 1:
                    this.addCatProduct();
                    break;
                case 2:
                    this.deleteCatProduct();
                    break;
                case 3:
                    this.modCatProduct();
                    break;
            }
            System.out.println("");


        }while(opc != 0);

    }
    public void printProductXCategory(){
        String nomCatBus = this.productRepository.getListProduct().getFirst().getCategoryController().getCategoryView().inNombreCategory();
        int flag = 0;
        int i = 0;

        while(i < this.getProductRepository().getIdAssig()){
            if(this.productRepository.getListProduct().get(i).getCategoryController().getCategoryRepository().comprobarCategoria(nomCatBus) == 1) {
                 flag = 1;

                this.productView.printProduct(this.getProductRepository().getListProduct().get(i));

            }
            i++;
        }
        if(flag != 1){
            System.out.println("No se encontro ninguna categoria que coincida con la ingresada");
        }


    }
    public void cargaEjemplos(){
        Product product = new Product(this.getProductRepository().getIdAssig());
        product.setNombre("Heladera Rd-49wrb");
        product.getCategoryController().getCategoryRepository().addListCategory(new Category("color negro"));
        product.getCategoryController().getCategoryRepository().addListCategory(new Category("filtro anti olor"));
        product.getCategoryController().getCategoryRepository().addListCategory(new Category("freezer superior"));
        product.getCategoryController().getCategoryRepository().addListCategory(new Category("hisense"));
        product.getCategoryController().getCategoryRepository().addListCategory(new Category("380Lts"));
        product.setPrecio(1000);
        this.getProductRepository().addListProduct(product);


        product = new Product(this.getProductRepository().getIdAssig());
        product.setNombre("Heladera Black Steel Hdr320f00n");
        product.getCategoryController().getCategoryRepository().addListCategory(new Category("314Lts"));
        product.getCategoryController().getCategoryRepository().addListCategory(new Category("drean"));
        product.getCategoryController().getCategoryRepository().addListCategory(new Category("color negro"));
        product.getCategoryController().getCategoryRepository().addListCategory(new Category("freezer superior"));
        product.setPrecio(1200);
        this.getProductRepository().addListProduct(product);

        product = new Product(this.getProductRepository().getIdAssig());
        product.setNombre("Heladera Rt38k5932sl Color Inox");
        product.getCategoryController().getCategoryRepository().addListCategory(new Category("freezer superior"));
        product.getCategoryController().getCategoryRepository().addListCategory(new Category("samsung"));
        product.getCategoryController().getCategoryRepository().addListCategory(new Category("382Lts"));
        product.getCategoryController().getCategoryRepository().addListCategory(new Category("color inox"));
        product.setPrecio(1100);
        this.getProductRepository().addListProduct(product);

        product = new Product(this.getProductRepository().getIdAssig());
        product.setNombre("Heladera HDR320F00");
        product.getCategoryController().getCategoryRepository().addListCategory(new Category("302Lts"));
        product.getCategoryController().getCategoryRepository().addListCategory(new Category("color blanco"));
        product.getCategoryController().getCategoryRepository().addListCategory(new Category("drean"));
        product.getCategoryController().getCategoryRepository().addListCategory(new Category("oferta"));
        product.setPrecio(700);
        this.getProductRepository().addListProduct(product);
    }
}
