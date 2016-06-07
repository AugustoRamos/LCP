package br.unesp.rc.lcp.beans;

/**
 * Created by augustochaves on 17/05/16.
 */
public class CollectionItem <T> {
    String Name = null;
    String Author = null;
    Integer Pages = 0;
    boolean isRent = false;


    public boolean isRent() {
        return this.isRent;
    }

    public String getName(){
        return this.Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public String getAuthor() {
        return this.Author;
    }

    public void setAuthor(String author) {
        this.Author = author;
    }

    public Integer getPages() {
        return this.Pages;
    }

    public void setPages(Integer pages) {
        this.Pages = pages;
    }

    public void setRent(boolean rent) {
        this.isRent = rent;
    }

    @Override
    public String toString(){
        return new StringBuffer("\nNome: ")
                .append(this.Name)
                .append("\nAuthor: ")
                .append(this.Author)
                .append("\nPages: ")
                .append(this.Pages)
                .append("\nEmprestado: ")
                .append(this.isRent == true ? "Sim" : "Não\n\n").toString();
    }
}
