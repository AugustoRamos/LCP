package br.unesp.rc.lcp.GerenciadorDeMercado.Business;

import br.unesp.rc.lcp.GerenciadorDeMercado.Domain.Business.IProductService;
import br.unesp.rc.lcp.GerenciadorDeMercado.Beans.Product;

import java.util.List;

/**
 * Created by augustochaves on 06/06/16.
 */
public class ProductService implements IProductService {
    @Override
    public boolean Save(Product product) {
        return true;
    }

    @Override
    public boolean Edit(Product product) {
        return true;
    }

    @Override
    public boolean Delete(Integer id) {
        return true;
    }

    @Override
    public Product GetById(Integer id) {
        return null;
    }

    @Override
    public List<Product> GetAll() {
        return null;
    }

    @Override
    public void Sell(Integer id) {

    }

    @Override
    public void Buy(Integer id) {

    }
}
