package Classification.Class;

import Classification.Phylum.Chordata;

/**
 * Created by Augusto Chaves Ramos on 10/04/2016.
 */
public abstract class Mammalia extends Chordata {

    public Mammalia(){
        super.getDescription();
    }

    @Override
    public String getDescription() {
        descritpion.append("Classe Mammalia\n");

        return descritpion.toString();
    }

}
