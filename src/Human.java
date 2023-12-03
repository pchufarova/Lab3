public abstract class Human {

    protected Genders gender;
    protected String name;

    public Human() {}

    public abstract void react();


    public String getName() {

        return name;

    }

    public Genders getGender() {

        return gender;

    }

}
