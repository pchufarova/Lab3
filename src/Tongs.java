import java.io.PrintStream;

public class Tongs extends GrillThings {

    public Tongs(String name) {

        super(name);
        super.name = name;
    }

    @Override
    public void fly() {

        System.out.println(name + " летят");

    }

    @Override
    public void bump(Human... humans) {
        for (int i = 0; i < humans.length; i++) {

            System.out.println(name + " врезаются в " + humans[i].getName());
            humans[i].react();

        }

        System.out.println("\n");

    }
}
