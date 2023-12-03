import java.util.Objects;

public class Duchess extends Human {

    public Duchess(String name) {

        super();
        super.name = name;
        super.gender = Genders.FEMALE;

    }


    @Override
    public void react() {

        System.out.println(name + " " + Reactions.IGNORE.getCondition());

    }

}
