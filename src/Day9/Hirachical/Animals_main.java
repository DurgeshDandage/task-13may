package Day9.Hirachical;

public class Animals_main {
    public static void main(String[] args) {
        Cat c=new Cat();
        c.sleep();

        System.out.println("___________________________");

        Dog d=new Dog();
        d.sleep();

        System.out.println("___________________________");
        Tiger t=new Tiger();
        t.sleep();

    }
}