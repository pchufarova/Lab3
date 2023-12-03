import java.util.Objects;

public class Duchess extends Human {

    public Duchess(String name) {

        super();
        super.name = name;
        super.gender = Genders.FEMALE;
        super.reaction = Reactions.IGNORE;

    }


    @Override
    public void react() {

        System.out.println("Правда " + name + ", кажется,  " + reaction.getCondition());

    }

}
