package test1;

public class ClassesObjects {
    public static void main(String[] args) {

       Cat tom = new Cat();
        tom.setName("tom");

        Cat meow = new Cat();
        meow.setName("Meow");

        System.out.println(tom.getName());

        String meowName = meow.getName();

        System.out.println("Meow's name is: " + meowName);

    }
}
