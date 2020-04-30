/* Создай класс Human с полями имя(String), пол(boolean), возраст(int), отец(Human), мать(Human).
Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
*
* Примечание:
* Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
*
* Пример вывода:
* Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
* Имя: Катя, пол: женский, возраст: 55
* Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
...*/
public class Main {
    public static void main(String[] args) {
        Human d1 = new Human("Петр", true, 71, null, null);
        Human b1 = new Human("Алена", false, 70, null, null);
        Human d2 = new Human("Илья", true, 69, null, null);
        Human b2 = new Human("Настасия", false, 68, null, null);

        Human f = new Human("Евгений", true, 31, d1, b1);
        Human m = new Human("Ольга", false, 30, d2, b2);

        Human c1 = new Human("Иван", true, 10, f, m);
        Human c2 = new Human("Света", false, 11, f, m);
        Human c3 = new Human("Олег", true, 12, f, m);

        System.out.println(d1.toString());
        System.out.println(b1.toString());
        System.out.println(d2.toString());
        System.out.println(b2.toString());

        System.out.println(f.toString());
        System.out.println(m.toString());
        
        System.out.println(c1.toString());
        System.out.println(c2.toString());
        System.out.println(c3.toString());
    }
    static class Human {
        private String name;
        private boolean sex;
        private int age;
        private Human father;
        private Human mother;

        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null) {
                text += ", отец: " + this.father.name;
            }

            if (this.mother != null) {
                text += ", мать: " + this.mother.name;
            }

            return text;
        }
    }
}
