public class Main {

    public static void main(String[] args) {

        GrillThings poker = new GrillThings("Кочерга");
        GrillThings scoop = new GrillThings("Совок");
        GrillThings tongs = new Tongs("Щипцы для угля");
        Tableware cups = new Tableware("Чашки");
        Tableware plates = new Tableware("Тарелки");
        Tableware pans = new Tableware("Сковородки");
        Duchess duchess = new Duchess("Герцогиня");
        Child child = new Child("Ребёночек", Genders.MALE);
        Girl girl = new Girl("Алиса");

        poker.fly();
        poker.bump(duchess, child, girl);
        scoop.fly();
        scoop.bump(duchess, child, girl);
        tongs.fly();
        tongs.bump(duchess, child, girl);
        pans.fall();
        pans.bump(duchess, child, girl);
        plates.fall();
        plates.bump(duchess, child, girl);
        cups.fall();
        cups.bump(duchess, child, girl);

    }

}