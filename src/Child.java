import java.util.Objects;

public class Child extends Human {

    public Child(String name, Genders gender) {

        super();
        super.name = name;
        super.gender = gender;
        super.reaction = Reactions.CRY;

    }

    @Override
    public void react() {

        System.out.println("А " + name + " и без того " + reaction.getCondition());

    }

}
