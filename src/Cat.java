import java.util.Objects;
public class Cat {
    public String name;
    public int age;
    public int weight;
    public String breed;

    public Cat(String name, int age, int weight, String breed) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.breed = breed;
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Cat() {
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", breed='" + breed + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, weight, breed);
    }

    public boolean equals(Object obj) {
        if (obj instanceof Cat) {
            Cat cat = (Cat) obj;
            return this.weight ==cat.weight && this.age == cat.age;
        }
        return false;
    }

    /*public boolean equalsL(Object obj) {
        if (obj instanceof Cat) {
            Cat cat = (Cat) obj;
            return Objects.equals(this.weight, cat.weight) && this.age == cat.age;
        }
        return false;
    }*/
}
