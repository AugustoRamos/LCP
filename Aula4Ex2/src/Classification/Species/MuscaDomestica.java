package Classification.Species;

import Classification.Genus.Musca;

/**
 * Created by Augusto Chaves Ramos on 10/04/2016.
 */
public class MuscaDomestica extends Musca {

    public MuscaDomestica(){
        super.getDescription();
    }

    @Override
    public String getDescription() {
        descritpion.append("Epécie Musca Domestica\n");

        return descritpion.toString();
    }
}
