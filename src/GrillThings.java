import java.util.Objects;

public class GrillThings extends Things implements Bumpable {

    public GrillThings(String name) {

        super();
        this.name = name;

    }

    @Override
    public boolean is_thing_bumped() {

        return (20 * Math.random() + name.length() > 12);
    }

    @Override
    public void fly() {

        System.out.println(name + " летит");

    }

    @Override
    public void bump(Human... humans) {
        for (Human human : humans) {

            if (is_thing_bumped()) {
                System.out.println(name + " врезается в " + human.getName());
                human.react();

            } else {
                System.out.println(name + " не попадает в " + human.getName());
                System.out.println(human.getName() + " всё равно " + human.getReaction().getCondition());

            }
        }

    }

}
