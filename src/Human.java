import java.util.Objects;

public abstract class Human {

    protected Genders gender;
    protected String name;
    protected Reactions reaction;

    public Human() {}

    public abstract void react();

    public Reactions getReaction() {

        return reaction;

    }

    public String getName() {

        return name;

    }

    public Genders getGender() {

        return gender;

    }

    @Override
    public int hashCode() {

        return Objects.hash(name, gender);

    }

    @Override
    public boolean equals(Object obj) {

        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        Human human = (Human) obj;
        return (Objects.equals(name, human.name) && Objects.equals(gender, human.gender));

    }

    @Override
    public String toString() {

        return "Human_ " + name;

    }

}
