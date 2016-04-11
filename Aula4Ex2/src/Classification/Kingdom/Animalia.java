package Classification.Kingdom;

/**
 * Created by Augusto Chaves Ramos on 10/04/2016.
 */
public abstract class Animalia {

    public StringBuilder descritpion;

    public Animalia(){
        descritpion =  new StringBuilder();

        descritpion.append("Reino Animalia\n");
    }

    public abstract String getDescription();

}
