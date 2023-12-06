import java.util.Objects;

public class GrillThings extends Things {

    private static final int COEFFICIENT = 20;

    public GrillThings(String name) {

        super();
        this.name = name;

    }

    @Override
    protected boolean is_thing_bumped() {

        return (COEFFICIENT * Math.random() + name.length() > LIMIT);
    }
}
