package dog;

public class Dog {
    String name;
    String says;

    public static void main(String[] args) {
        Dog d1 = new Dog();
        Dog d2 = new Dog();
        d1.name = "spot";
        d1.says = "Ruff!";
        d2.name = "scruffy";
        d2.says = "Wurf!";
        System.out.println("名字：" + d1.name + ",叫声：" + d1.says);
        System.out.println("名字：" + d2.name + ",叫声：" + d2.says);
    }
}
