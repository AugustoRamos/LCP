package br.unesp.rc.lcp.view;

import br.unesp.rc.lcp.beans.Book;
import br.unesp.rc.lcp.beans.CollectionItem;
import br.unesp.rc.lcp.controlador.Library;
import br.unesp.rc.lcp.persistencia.BookFile;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.Scanner;

public class ViewLibrary {

    public static void main(String[] args) {

        System.out.println("\n------Biblioteca-----------\n\n");
        System.out.println("---------Menu--------------");
        System.out.println("1 - Inserir");
        System.out.println("2 - Buscar");
        System.out.println("3 - Emprestar");
        System.out.println("4 - Listar");
        Integer option = new Scanner(System.in).nextInt();

        switch (option){
            case 1:
                System.out.println("---------Inserir--------------");
                System.out.println("1 - Livro");
                System.out.println("2 - Arquivo");
                System.out.println("3 - Mída");
                Integer optionInsert = new Scanner(System.in).nextInt();
                switch (optionInsert){
                    case 1:
                        insertBook();
                        break;
                    case 2:
                        //inserFile();
                        break;
                    case 3:
                        //insertMedia();
                        break;
                }
                break;
            case 2:
                System.out.println("---------Buscar--------------");
                System.out.println("1 - Livro");
                System.out.println("2 - Arquivo");
                System.out.println("3 - Mída");
                Integer optionSearch = new Scanner(System.in).nextInt();
                switch (optionSearch){
                    case 1:
                        searchBook();
                        break;
                    case 2:
                        //searchFile();
                        break;
                    case 3:
                        //searchMedia();
                        break;
                }
                break;
            case 3:
                System.out.println("---------Emprestar--------------");
                System.out.println("1 - Livro");
                System.out.println("2 - Arquivo");
                System.out.println("3 - Mída");
                Integer optionRent = new Scanner(System.in).nextInt();
                switch (optionRent){
                    case 1:
                        //rentBook();
                        break;
                    case 2:
                        //rentFile();
                        break;
                    case 3:
                        //rentMedia();
                        break;
                }
                break;
            case 4:
                System.out.println("---------Listar--------------");
                System.out.println("1 - Livro");
                System.out.println("2 - Arquivo");
                System.out.println("3 - Mída");
                Integer optionList = new Scanner(System.in).nextInt();
                switch (optionList){
                    case 1:
                        //listBook();
                        break;
                    case 2:
                        //listFile();
                        break;
                    case 3:
                        //listMedia();
                        break;
                }
                break;
            default:
                break;

        }

        System.out.println(option);


    }

    static void insertBook(){
        Scanner scanner = new Scanner(System.in);
        CollectionItem<Book> book = new Book();

        System.out.println("---------Inserir Livro--------------");
        System.out.println("\nNome:");
        String name = scanner.nextLine();
        book.setName(name);

        System.out.println("\nAutor:");
        String author = scanner.nextLine();
        book.setAuthor(author);

        System.out.println("\nPáginas: ");
        Integer pages = scanner.nextInt();
        book.setPages(pages);

        System.out.println("\nEstá emprestado?('1' para sim e '0' para não) ");
        Integer isRent = scanner.nextInt();
        book.setRent(isRent == 1);

        Library library = new Library();

        library.Create(book);


    }

    static void searchBook(){
        try{

            FileInputStream fin = new FileInputStream("books.txt");
            ObjectInputStream ois = new ObjectInputStream(fin);
            CollectionItem item1 = (CollectionItem) ois.readObject();
            CollectionItem item2 = (CollectionItem) ois.readObject();
            ois.close();

            System.out.println(item2.toString());

        }catch(Exception ex){
            ex.printStackTrace();
        }
    }

}
