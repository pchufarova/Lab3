import java.util.Objects;

public class Tableware extends Things {

    private static final int COEFFICIENT = 10;

    public Tableware(String name) {

        super();
        this.name = name;
    }

    @Override
    public boolean is_thing_bumped() {

        return ((name.length() + COEFFICIENT) * Math.random() > LIMIT);
    }
}
