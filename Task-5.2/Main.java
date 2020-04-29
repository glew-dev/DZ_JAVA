/* Создать класс Cat. У кота должно быть имя (name, String), возраст (age, int), вес (weight, int), сила (strength, int).
 * Создайте объект класса Сat*/
public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Жужик", 2, 2, 2);
        System.out.println(cat.getName()/*cat.name*/);
    }
}
class Cat {
    private String name;
    private int age;
    private int weight;
    private int strength;

    public Cat(String name, int age, int weight, int strength) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.strength = strength;
    }
    public String getName() {
        return name;
    }
}
