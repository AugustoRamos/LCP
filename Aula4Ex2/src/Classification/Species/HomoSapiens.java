package Classification.Species;

import Classification.Genus.Homo;

/**
 * Created by Augusto Chaves Ramos on 10/04/2016.
 */
public class HomoSapiens extends Homo {

    public HomoSapiens(){
        super.getDescription();
    }

   @Override
    public String getDescription() {
        descritpion.append("Espécie Homo Sapiens\n");

        return descritpion.toString();
    }
}
