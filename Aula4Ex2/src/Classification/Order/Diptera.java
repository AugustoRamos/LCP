package Classification.Order;

import Classification.Class.Insecta;

/**
 * Created by Augusto Chaves Ramos on 10/04/2016.
 */
public abstract class Diptera extends Insecta {

    public Diptera(){
        super.getDescription();
    }

    @Override
    public String getDescription() {
        descritpion.append("Ordem Díptera\n");

        return descritpion.toString();
    }


}
