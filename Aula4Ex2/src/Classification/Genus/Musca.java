package Classification.Genus;

import Classification.Family.Muscidae;

/**
 * Created by Augusto Chaves Ramos on 10/04/2016.
 */
public abstract class Musca extends Muscidae {

    public Musca(){
        super.getDescription();
    }

    @Override
    public String getDescription() {
        descritpion.append("Gênero Musca\n");

        return descritpion.toString();
    }
}
