package br.unesp.rc.lcp.GerenciadorDeMercado.View;

import br.unesp.rc.lcp.GerenciadorDeMercado.Controller.ProductController;
import br.unesp.rc.lcp.GerenciadorDeMercado.Beans.Product;
import br.unesp.rc.lcp.GerenciadorDeMercado.Enumerators.EMenuOption;

import java.util.List;
import java.util.Scanner;

public class Main {
    static ProductController _productController = new ProductController();


    public static void printHeader(){
        System.out.println("--------- UNESP - RIO CLARO ---------");
        System.out.println("------- Gerenciador de Mercados -----\n\n");
    }

    public static int menu(){

        Scanner input = new Scanner(System.in);

        int option;

        System.out.println("Escolha uma opção:\n");
        System.out.println(EMenuOption.valueOf("Cadastrar").ordinal() + " - " + EMenuOption.Cadastrar + "Produto");
        System.out.println(EMenuOption.valueOf("Editar").ordinal() + " - " + EMenuOption.Editar + "Produto");
        System.out.println(EMenuOption.valueOf("Deletar").ordinal() + " - " + EMenuOption.Deletar + "Produto");
        System.out.println(EMenuOption.valueOf("Listar").ordinal() + " - " + EMenuOption.Listar + "Produto");
        System.out.println(EMenuOption.valueOf("Buscar").ordinal() + " - " + EMenuOption.Buscar + "Produto");
        System.out.println(EMenuOption.valueOf("Comprar").ordinal() + " - " + EMenuOption.Comprar + "Produto");
        System.out.println(EMenuOption.valueOf("Vender").ordinal() + " - " + EMenuOption.Vender + "Produto");
        System.out.println(EMenuOption.valueOf("Sair").ordinal() + " - " + EMenuOption.Sair + "Produto");

        System.out.print("\nInforme a opção escolhida: ");

        option = input.nextInt();

        return option;
    }

    public static boolean Create(){
        Product product = new Product();

        Scanner input = new Scanner(System.in);

        System.out.println("\n\nNome: ");
        product.setName(input.nextLine());

        System.out.println("\n\nCódigo de Barras: ");
        product.setBarCode(input.nextInt());

        System.out.println("\nPreço de Venda: ");
        product.setSalePrice(input.nextDouble());

        System.out.println("\nPreço de Compra");
        product.setBuyPrice(input.nextDouble());

        System.out.println("\nQuantidade em estoque: ");
        product.setInStock(input.nextInt());

        System.out.println("\nQuantidade mínima em estoque: ");
        product.setMinStock(input.nextInt());

        return  (_productController.Save(product));
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int option = -1, id = 0;

        while(option != 0){
            option = menu();

            EMenuOption optionEnum = EMenuOption.values()[option];

            switch (optionEnum){
                case Cadastrar:
                    Create();
                    break;
                case Editar:
                    System.out.println("\n\nEdição de Produto\n");
                    System.out.println("Informe o cod. de barras do produto a ser editado: ");
                    id = input.nextInt();

                    Edit(id);
                    break;
                case Deletar:
                    System.out.println("\n\nExclusão de Produto\n");
                    System.out.println("Informe o cod. de barras do produto a ser excluído: ");
                    id = input.nextInt();

                    Delete(id);
                    break;
                case Listar:
                    List();
                    break;
                case Buscar:
                    System.out.println("\n\nBusca de Produto\n");
                    System.out.println("Informe o cod. de barras do produto a ser buscado: ");
                    id = input.nextInt();

                    Search(id);
                    break;
                case Comprar:
                    Buy();
                    break;
                case Vender:
                    Sell();
                    break;
                default:
                    break;
            }
        }


    }

    private static void Sell() {

        Scanner input = new Scanner(System.in);
        int id = 0;

        System.out.println("\n\nVenda de Produto\n");
        System.out.println("Informe o cod. de barras do produto a ser vendido: ");
        id = input.nextInt();

        Product product = Search(id);

        if(product == null)
            return;

        _productController.Sell(product);

    }

    private static void Buy() {
        Scanner input = new Scanner(System.in);
        int id = 0;

        System.out.println("\n\nCompra de Produto\n");
        System.out.println("Informe o cod. de barras do produto a ser adquirido: ");
        id = input.nextInt();

        Product product = Search(id);

        if(product == null)
            return;

        _productController.Buy(product);

    }

    private static Product Search(Integer id) {
        return _productController.GetById(id);
    }

    private static List<Product> List() {
        return _productController.GetAll();
    }

    private static boolean Delete(Integer id) {
        return _productController.Delete(id);
    }

    private static boolean Edit(Integer id) {
        Product product = _productController.GetById(id);

        Scanner input = new Scanner(System.in);

        System.out.println("\n\nNome: ");
        product.setName(input.nextLine());

        System.out.println("\n\nCódigo de Barras: ");
        product.setBarCode(input.nextInt());

        System.out.println("\nPreço de Venda: ");
        product.setSalePrice(input.nextDouble());

        System.out.println("\nPreço de Compra");
        product.setBuyPrice(input.nextDouble());

        System.out.println("\nQuantidade em estoque: ");
        product.setInStock(input.nextInt());

        System.out.println("\nQuantidade mínima em estoque: ");
        product.setMinStock(input.nextInt());

        return _productController.Edit(product);
    }
}
