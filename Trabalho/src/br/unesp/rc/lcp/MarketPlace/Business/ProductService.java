package br.unesp.rc.lcp.TrabalhoParcial.Business;

import br.unesp.rc.lcp.TrabalhoParcial.Domain.Business.IProductService;
import br.unesp.rc.lcp.TrabalhoParcial.beans.Product;

import java.util.List;

/**
 * Created by augustochaves on 06/06/16.
 */
public class ProductService implements IProductService {
    @Override
    public boolean Save(Product product) {
        System.out.print(product.getName());
        return false;
    }

    @Override
    public boolean Edit(Product product) {
        return false;
    }

    @Override
    public boolean Delete(long id) {
        return false;
    }

    @Override
    public Product GetById(long id) {
        return null;
    }

    @Override
    public List<Product> GetAll() {
        return null;
    }
}
