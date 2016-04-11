package Classification.Order;

import Classification.Class.Mammalia;

/**
 * Created by Augusto Chaves Ramos on 10/04/2016.
 */
public abstract class Carnivora extends Mammalia {

    public Carnivora(){
        super.getDescription();
    }

    @Override
    public String getDescription() {
        descritpion.append("Ordem Carnívora\n");

        return descritpion.toString();
    }
}
