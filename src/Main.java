import com.app.objeto.control.CategoryController;
import com.app.objeto.control.ProductController;
import com.app.objeto.model.entity.Category;
import com.app.objeto.model.entity.Product;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Scanner scanner = new Scanner(System.in);
        CategoryController categoryController = new CategoryController();
        categoryController.createAndAddCategory();
        categoryController.createAndAddCategory();
        categoryController.createAndAddCategory();
        categoryController.printCategoryList();
        String esp = categoryController.getCategoryView().inNombreCategory();
        */


        Scanner scanner = new Scanner(System.in);
        ProductController productController = new ProductController();



        Product product = new Product(productController.getProductRepository().getIdAssig());
        product.setNombre("papas");
        product.getCategoryController().getCategoryRepository().addListCategory(new Category("terror"));
        product.setPrecio(6);
        productController.getProductRepository().addListProduct(product);


        product = new Product(productController.getProductRepository().getIdAssig());
        product.setNombre("zanahoria");
        product.getCategoryController().getCategoryRepository().addListCategory(new Category("accion"));
        product.getCategoryController().getCategoryRepository().addListCategory(new Category("terror"));
        product.setPrecio(2);
        productController.getProductRepository().addListProduct(product);

        product = new Product(productController.getProductRepository().getIdAssig());
        product.setNombre("manzana");
        product.getCategoryController().getCategoryRepository().addListCategory(new Category("suspenso"));
        product.setPrecio(3);
        productController.getProductRepository().addListProduct(product);

        product = new Product(productController.getProductRepository().getIdAssig());
        product.setNombre("mandarina");
        product.getCategoryController().getCategoryRepository().addListCategory(new Category("comedia"));
        product.setPrecio(3);
        productController.getProductRepository().addListProduct(product);

        product = new Product(productController.getProductRepository().getIdAssig());
        product.setNombre("pera");
        product.getCategoryController().getCategoryRepository().addListCategory(new Category("terror"));
        product.getCategoryController().getCategoryRepository().addListCategory(new Category("accion"));
        product.setPrecio(3);
        productController.getProductRepository().addListProduct(product);
        productController.printProductList();

        int opc ;

        do{
            productController.getProductView().menuPrincipal();
            opc = scanner.nextInt();

            switch(opc){
                case 1:
                    productController.createAndAddProduct();
                    break;
                case 2:
                    productController.printProductList();
                    break;
                case 3:
                    productController.modProduct();
                    //mod cat
                    break;
                case 4:
                    productController.deleteProductFromListFinal();
                    break;
                case 5:
                    productController.menuModCategoriasProducto();
                    break;
                case 6:
                    productController.printProductXCategory();
                    break;


            }
            System.out.println("");


        }while(opc != 0);

        scanner.close();
        productController.getProductView().getScanner().close();

    }

}
