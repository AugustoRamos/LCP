package br.unesp.rc.lcp.controlador;


import br.unesp.rc.lcp.beans.Book;
import br.unesp.rc.lcp.beans.CollectionItem;
import br.unesp.rc.lcp.persistencia.BookFile;

import java.util.List;

/**
 * Created by augustochaves on 17/05/16.
 */
public class Library{
    public boolean Create(CollectionItem item){
        BookFile book = new BookFile();
        book.insert(item);

        return true;
    }

}
