package Classification.Family;

import Classification.Order.Carnivora;

/**
 * Created by Augusto Chaves Ramos on 10/04/2016.
 */
public abstract class Canidae extends Carnivora {

    public Canidae(){
        super.getDescription();
    }

    @Override
    public String getDescription() {
        descritpion.append("Fámilia Canidae\n");

        return descritpion.toString();
    }
}
