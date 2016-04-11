package Classification.Species;

import Classification.Genus.Canis;

/**
 * Created by Augusto Chaves Ramos on 10/04/2016.
 */
public class CanisFamiliaris extends Canis {

    public CanisFamiliaris(){
        super.getDescription();
    }

    @Override
    public String getDescription() {
        descritpion.append("Espécie Canis Familiaris\n");

        return descritpion.toString();
    }
}
