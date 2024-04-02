import com.app.objeto.control.ProductController;
import com.app.objeto.model.entity.Product;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ProductController productController = new ProductController();



        Product product = new Product(productController.getProductRepository().getIdAssig());
        product.setNombre("papas");
        product.setPrecio(6);
        productController.getProductRepository().addListProduct(product);

        product = new Product(productController.getProductRepository().getIdAssig());
        product.setNombre("zanahoria");
        product.setPrecio(2);
        productController.getProductRepository().addListProduct(product);

        product = new Product(productController.getProductRepository().getIdAssig());
        product.setNombre("manzana");
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
                    break;
                case 4:
                    productController.deleteProductFromListFinal();
                    break;

            }
            System.out.println("");


        }while(opc != 0);

        scanner.close();
        productController.getProductView().getScanner().close();

    }

}
