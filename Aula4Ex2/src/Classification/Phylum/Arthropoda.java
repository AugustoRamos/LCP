package Classification.Phylum;

import Classification.Kingdom.Animalia;

/**
 * Created by Augusto Chaves Ramos on 10/04/2016.
 */
public abstract class Arthropoda extends Animalia {

    @Override
    public String getDescription() {
        descritpion.append("Filo Arthropoda\n");

        return descritpion.toString();
    }
}
