import java.util.Objects;

public class Girl extends Human implements Seeable {

    public Girl(String name) {

        super();
        super.name = name;
        super.gender = Genders.FEMALE;
        super.reaction = Reactions.FEAR;

    }

    @Override
    public void see() {

        System.out.println(name + ", увидев это, " + reaction.getCondition());
        System.out.print("\n");

    }

    @Override
    public void react() {

        System.out.println(name + " " + reaction.getCondition());

    }

}
