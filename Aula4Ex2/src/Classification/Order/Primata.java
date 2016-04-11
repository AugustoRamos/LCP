package Classification.Order;

import Classification.Class.Mammalia;

/**
 * Created by Augusto Chaves Ramos on 10/04/2016.
 */
public abstract class Primata extends Mammalia {

    public Primata(){
        super.getDescription();
    }

    @Override
    public String getDescription() {
        descritpion.append("Ordem Primata\n");

        return descritpion.toString();
    }
}
