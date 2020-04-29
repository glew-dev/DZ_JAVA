/*Реализовать метод boolean fight(Cat anotherCat):
 * реализовать механизм драки котов в зависимости от их веса, возраста и силы.
 * Нужно сравнить каждый критерий по отдельности, и победителем будет тот, у которого больше "победивших" критериев.
 * Метод должен определять, выиграли ли мы (this) бой или нет, т.е. возвращать true, если выиграли и false - если нет.
 * Если ничья и никто не выиграл, возвращаем либо true либо false, но должно выполняться условие:
 * если cat1.fight(cat2) возвращает true,
 * то cat2.fight(cat1) должен возвращать false. */
public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat(2, 2, 2, true);
        Cat cat2 = new Cat(2, 2, 2, false);

        if (cat1.fight(cat2)) System.out.println("Выиграл cat1");
        else System.out.println("Выиграл cat2");

        if (cat2.fight(cat1)) System.out.println("Выиграл cat2");
        else System.out.println("Выиграл cat1");
    }
}
class Cat {
    public int age;
    public int weight;
    public int strength;
    public boolean cat1;

    public Cat(int age, int weight, int strength, boolean cat1) {
        this.age = age;
        this.weight = weight;
        this.strength = strength;
        this.cat1 = cat1;
    }

    public boolean fight(Cat anotherCat) {
        int i = 0;
        if (this.age > anotherCat.age) i++;
        if (this.age < anotherCat.age) i--;
        if (this.weight > anotherCat.weight) i++;
        if (this.weight < anotherCat.weight) i--;
        if (this.strength > anotherCat.strength) i++;
        if (this.strength < anotherCat.strength) i--;
        if (i > 0) return true;
        if (i < 0) return false;
        if (this.cat1) return true;
        else return false;
    }
}
