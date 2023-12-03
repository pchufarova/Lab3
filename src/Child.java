import java.util.Objects;

public class Child extends Human {

    public Child(String name, Genders gender) {

        super();
        super.name = name;
        super.gender = gender;

    }

    @Override
    public void react() {

        System.out.println(name + " " + Reactions.CRY.getCondition());

    }

}
