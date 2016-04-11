package Classification.Genus;

import Classification.Family.Canidae;

/**
 * Created by Augusto Chaves Ramos on 10/04/2016.
 */
public class Canis extends Canidae {

    public Canis(){
        super.getDescription();
    }

    @Override
    public String getDescription() {
        descritpion.append("Gênero Canis\n");

        return descritpion.toString();
    }
}
