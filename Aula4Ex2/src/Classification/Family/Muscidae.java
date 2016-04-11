package Classification.Family;

import Classification.Order.Diptera;

/**
 * Created by Augusto Chaves Ramos on 10/04/2016.
 */
public abstract class Muscidae extends Diptera {

    public Muscidae(){
        super.getDescription();
    }

    @Override
    public String getDescription() {
        descritpion.append("Família Muscidae\n");

        return descritpion.toString();
    }
}
