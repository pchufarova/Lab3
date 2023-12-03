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

    @Override
    public int hashCode() {

        return Objects.hash(name, gender);

    }

    @Override
    public boolean equals(Object obj) {

        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        Duchess duchess = (Duchess) obj;
        return Objects.equals(name, duchess.name);

    }

    @Override
    public String toString() {

        return "Герцогиня " + name;

    }
}
