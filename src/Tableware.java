import java.util.Objects;

public class Tableware implements Fallable, Bumpable {

    protected String name;

    public Tableware(String name) {

        this.name = name;

    }


    public String getName() {

        return name;

    }

    @Override
    public void fall() {

        System.out.println(name + " посыпались");

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
        Tableware tableware = (Tableware) obj;
        return Objects.equals(name, tableware.name);

    }

    @Override
    public String toString() {

        return "Посуда " + name;

    }

}
