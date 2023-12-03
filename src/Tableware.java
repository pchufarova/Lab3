import java.util.Objects;

public class Tableware extends Things {

    public Tableware(String name) {

        super();
        this.name = name;

    }

    @Override
    public boolean is_thing_bumped() {

        return (10 * Math.random() + name.length() > 12);
    }

    @Override
    public void fly() {

        System.out.println(name + " летят");

    }

    @Override
    public void bump(Human... humans) {

        for (Human human : humans) {

            if (is_thing_bumped()) {
                System.out.println(name + " врезаются в " + human.getName());
                human.react();

            } else {
                System.out.println(name + " не попадают в " + human.getName());
                System.out.println(human.getName() + " всё равно " + human.getReaction().getCondition());
            }

        }

    }

}
