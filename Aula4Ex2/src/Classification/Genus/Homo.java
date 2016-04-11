package Classification.Genus;

import Classification.Family.Hominidae;

/**
 * Created by Augusto Chaves Ramos on 10/04/2016.
 */
public abstract class Homo extends Hominidae {

    public Homo(){
        super.getDescription();
    }

    @Override
    public String getDescription() {
        descritpion.append("Gênero Homo\n");

        return descritpion.toString();
    }
}
