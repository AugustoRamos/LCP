package br.unesp.rc.lcp.GerenciadorDeMercado.Beans;

/**
 * Created by augustochaves on 06/06/16.
 */
public class Product {

    private String Name;
    private Double BuyPrice;
    private Double SalePrice;
    private Integer InStock;
    private Integer BarCode;
    private Integer MinStock;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Double getBuyPrice() {
        return BuyPrice;
    }

    public void setBuyPrice(Double buyPrice) {
        BuyPrice = buyPrice;
    }

    public Double getSalePrice() {
        return SalePrice;
    }

    public void setSalePrice(Double salePrice) {
        SalePrice = salePrice;
    }

    public Integer getInStock() {
        return InStock;
    }

    public void setInStock(Integer inStock) {
        InStock = inStock;
    }

    public Integer getBarCode() {
        return BarCode;
    }

    public void setBarCode(Integer barCode) {
        BarCode = barCode;
    }

    public Integer getMinStock() {
        return MinStock;
    }

    public void setMinStock(Integer minStock) {
        MinStock = minStock;
    }
}
