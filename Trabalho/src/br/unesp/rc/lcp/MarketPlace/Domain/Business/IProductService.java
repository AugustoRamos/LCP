package br.unesp.rc.lcp.TrabalhoParcial.Domain.Business;

import br.unesp.rc.lcp.TrabalhoParcial.beans.Product;

import java.util.List;

/**
 * Created by augustochaves on 06/06/16.
 */
public interface IProductService {
    boolean Save(Product product);
    boolean Edit(Product product);
    boolean Delete(long id);
    Product GetById(long id);
    List<Product> GetAll();
}
