package br.unesp.rc.lcp.TrabalhoParcial.Controller;

import br.unesp.rc.lcp.TrabalhoParcial.Domain.Business.IProductService;
import br.unesp.rc.lcp.TrabalhoParcial.Business.ProductService;
import br.unesp.rc.lcp.TrabalhoParcial.beans.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by augustochaves on 06/06/16.
 */
public class ProductController {
    private  IProductService _productService;

    public ProductController(ProductService productService){
        _productService = productService;
    }

    public boolean Save(Product product){
        if(_productService.Save(product))
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


}
