package Classification.Family;

import Classification.Order.Primata;

/**
 * Created by Augusto Chaves Ramos on 10/04/2016.
 */
public abstract class Hominidae extends Primata {

    public Hominidae(){
        super.getDescription();
    }

    @Override
    public String getDescription() {
        descritpion.append("Fámilia Hominidae\n");

        return descritpion.toString();
    }
}
