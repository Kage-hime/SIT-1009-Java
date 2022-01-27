public class Main
{
    public static void main(String[] args)
    {
        Dog dog = new Dog("Milo",2,"Brown");
        Cat cat = new Cat("Whiskey",3,"Brown");
        Duck duck = new Duck ("Do",1,"White");
        Pig pig = new Pig ("Po",10,"Pink");

        dog.printinfo();
        cat.printinfo();
        duck.printinfo();
        pig.printinfo();

    }
}
