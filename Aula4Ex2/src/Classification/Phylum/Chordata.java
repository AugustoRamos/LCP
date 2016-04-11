package Classification.Phylum;

import Classification.Kingdom.Animalia;

/**
 * Created by Augusto Chaves Ramos on 10/04/2016.
 */
public abstract class Chordata extends Animalia {

    @Override
    public String getDescription() {
        descritpion.append("Filo Chordata\n");

        return descritpion.toString();
    }
}
