package br.unesp.rc.lcp.persistencia;

import br.unesp.rc.lcp.beans.CollectionItem;

import java.util.List;

/**
 * Created by augustochaves on 17/05/16.
 */
public class MediaFile implements IItem {
    @Override
    public boolean insert(CollectionItem item) {
        return false;
    }

    @Override
    public CollectionItem search(CollectionItem item) {
        return null;
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
