import java.util.Objects;

public class Child extends Human {

    public Child(String name, Genders gender) {

        super();
        super.name = name;
        super.gender = gender.getGender();

    }

    @Override
    public void react() {

        System.out.println(name + " " + Reactions.CRY.getCondition());

    }

    @Override
    public int hashCode() {

        return Objects.hash(name, gender);

    }

    @Override
    public boolean equals(Object obj) {

        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        Child child = (Child) obj;
        return (Objects.equals(name, child.name) && Objects.equals(gender, child.gender));

    }

    @Override
    public String toString() {

        return "Ребёнок " + name;

    }

}
