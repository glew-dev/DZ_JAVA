/* Помогите коту обрести имя с помощью метода setName. */
public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setName("Жужик");
        System.out.println(cat.getName()/*cat.name*/);
    }
}
class Cat {
    private String name = "безымянный кот";
    public void setName(String name) {
        //напишите тут ваш код
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
