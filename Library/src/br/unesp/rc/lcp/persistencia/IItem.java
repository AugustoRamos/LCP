package br.unesp.rc.lcp.persistencia;

import br.unesp.rc.lcp.beans.CollectionItem;

import java.util.List;

/**
 * Created by augustochaves on 17/05/16.
 */
public interface IItem {
    boolean insert(CollectionItem item);
    CollectionItem search(CollectionItem item);
    boolean rent(CollectionItem item);
    List<CollectionItem> list();
}
