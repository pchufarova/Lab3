import java.util.Objects;

public abstract class Things implements Flyable, Bumpable {

    protected String name;

    public Things() {}

    public abstract boolean is_thing_bumped();

    public String getName() {

        return name;

    }

    @Override
    public int hashCode() {

        return Objects.hash(name);

    }

    @Override
    public boolean equals(Object obj) {

        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        Things things = (Things) obj;
        return Objects.equals(name, things.name);

    }

    @Override
    public String toString() {

        return "Things_ " + name;

    }

}
