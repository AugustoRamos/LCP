package br.unesp.rc.lcp.GerenciadorDeMercado.Controller;

import br.unesp.rc.lcp.GerenciadorDeMercado.Domain.Business.IProductService;
import br.unesp.rc.lcp.GerenciadorDeMercado.Business.ProductService;
import br.unesp.rc.lcp.GerenciadorDeMercado.Beans.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by augustochaves on 06/06/16.
 */
public class ProductController {

    IProductService productService = new ProductService();

     public boolean Save(Product product){
        if(productService.Save(product))
            return true;
        else
            return false;
    }

    public boolean Edit(Product product){
        return true;
    }

    public boolean Delete(long id){
      return true;
    }

    public List<Product> GetAll(){
        List<Product> products = new ArrayList<Product>();

        return products;
    }

    public Product GetById(long id){
        Product product = new Product();

        return product;
    }

    public void Sell(Product product){
        productService.Sell(product.getBarCode());
    }

    public void Buy(Product product){
        productService.Buy(product.getBarCode());
    }

}
