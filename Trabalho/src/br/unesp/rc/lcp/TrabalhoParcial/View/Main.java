package br.unesp.rc.lcp.TrabalhoParcial.View;

import br.unesp.rc.lcp.TrabalhoParcial.Controller.ProductController;
import br.unesp.rc.lcp.TrabalhoParcial.beans.Product;

/**
 * Created by augustochaves on 06/06/16.
 */
public class Main {
    private static ProductController productController;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Product product = new Product();

        product.setName("merda");
        product.setBarCode(123123);
        product.setBuyPrice(4.00);
        product.setInStock(4);
        product.setMinStock(1);
        product.setSalePrice(10.00);

        productController.Save(product);

    }

}