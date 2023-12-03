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

    @Override
    public int hashCode() {

        return Objects.hash(name, gender);

    }

    @Override
    public boolean equals(Object obj) {

        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        Girl girl = (Girl) obj;
        return Objects.equals(name, girl.name);

    }

    @Override
    public String toString() {

        return "Девочка " + name;

    }

}
