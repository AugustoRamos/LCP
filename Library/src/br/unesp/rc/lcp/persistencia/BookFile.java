package br.unesp.rc.lcp.persistencia;

import br.unesp.rc.lcp.beans.Book;
import br.unesp.rc.lcp.beans.CollectionItem;

import java.io.*;
import java.util.List;

/**
 * Created by augustochaves on 17/05/16.
 */
public class BookFile implements IItem {

    @Override
    public boolean insert(CollectionItem item) {
        ObjectOutputStream outputStream = null;

        try {

            //Construct the LineNumberReader object
            outputStream = new ObjectOutputStream(new FileOutputStream("books.txt", true));

            outputStream.writeObject(item);

        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
            return false;
        } catch (IOException ex) {
            ex.printStackTrace();
            return false;
        } finally {
            try {
                if (outputStream != null) {
                    outputStream.flush();
                    outputStream.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
                return false;
            }
        }

        return true;
    }

    @Override
    public CollectionItem search(CollectionItem item) {

        try{

            FileInputStream fin = new FileInputStream("books.txt");
            ObjectInputStream ois = new ObjectInputStream(fin);
            item = (CollectionItem) ois.readObject();
            ois.close();

            return item;

        }catch(Exception ex){
            ex.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean rent(CollectionItem item) {
        return false;
    }

    @Override
    public List<CollectionItem> list() {
        return null;
    }
}
