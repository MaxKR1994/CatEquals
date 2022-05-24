public class CatMain {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Oscar", 4,7,"Bobtail");
        Cat cat2 = new Cat("Oliver",4,5,"Sphynx");
        Cat cat3 = new Cat();
        cat3.name = "Pumpkin";
        cat3.age = 7;
        cat3.weight = 8;
        cat3.breed = "Persian";
        Cat cat4 = new Cat("Buster",4,5,"Siamese");
        System.out.println("Cat for age and weight comparison:");
        System.out.println(cat1);
        System.out.println(cat2);
        System.out.println(cat4);
        System.out.println(cat2.equals(cat4));
        System.out.println(cat2 == cat4);
        System.out.println(cat2.equals(cat1));
        System.out.println(cat1.equals(cat4));
        System.out.println(cat2.hashCode());
        System.out.println(cat4.hashCode());
    }
}
