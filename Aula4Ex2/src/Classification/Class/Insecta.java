package Classification.Class;

import Classification.Phylum.Arthropoda;

/**
 * Created by Augusto Chaves Ramos on 10/04/2016.
 */
public abstract class Insecta extends Arthropoda {

    public Insecta(){
        super.getDescription();
    }

    @Override
    public String getDescription() {
        descritpion.append("Classe Insecta\n");

        return descritpion.toString();
    }
}
