import java.util.Objects;

public class GrillThings implements Flyable, Bumpable {


    protected String name;

    public GrillThings(String name) {

        this.name = name;

    }


    public String getName() {

        return name;

    }
    @Override
    public void fly() {

        System.out.println(name + " летит");

    }

    @Override
    public void bump(Human... humans) {
        for (int i = 0; i < humans.length; i++) {

            System.out.println(name + " врезается в " + humans[i].getName());
            humans[i].react();


        }

        System.out.println("\n");

    }

    @Override
    public int hashCode() {

        return Objects.hash(name);

    }

    @Override
    public boolean equals(Object obj) {

        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        GrillThings gt = (GrillThings) obj;
        return Objects.equals(name, gt.name);

    }

    @Override
    public String toString() {

        return "Инструмент " + name;

    }

}
