
import com.app.objeto.control.ProductController;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ProductController productController = new ProductController();
        productController.cargaEjemplos();

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
                    productController.printProductXCategory();
                    break;
                case 4:
                    productController.modProduct();
                    break;
                case 5:
                    productController.deleteProductFromListFinal();
                    break;

            }
            System.out.println("");


        }while(opc != 0);

        scanner.close();
        productController.getProductView().getScanner().close();
        if(productController.getProductRepository().getIdAssig() <0){
            productController.getProductRepository().getListProduct().getFirst().getCategoryController().getCategoryView().getScanner().close();
        }

    }

}
