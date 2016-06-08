package br.unesp.rc.lcp.GerenciadorDeMercado.Domain.Business;

import br.unesp.rc.lcp.GerenciadorDeMercado.Beans.Product;

import java.util.List;

/**
 * Created by augustochaves on 06/06/16.
 */
public interface IProductService {
    boolean Save(Product product);
    boolean Edit(Product product);
    boolean Delete(Integer id);
    Product GetById(Integer id);
    List<Product> GetAll();
    void Sell(Integer id);
    void Buy(Integer id);
}
