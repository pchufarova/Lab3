import java.util.Objects;

public class Girl extends Human {

    public Girl(String name) {

        super();
        super.name = name;
        super.gender = Genders.FEMALE;

    }


    @Override
    public void react() {

        System.out.println(name + " " + Reactions.FEAR.getCondition());

    }

}
