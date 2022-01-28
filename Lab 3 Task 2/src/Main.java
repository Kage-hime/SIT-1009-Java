    import java.util.ArrayList;

    public class Main
    {
        public static void main(String[] args)
        {
            ArrayList<Animal> AnimalArrayList = new ArrayList<Animal>();

            Animal newann = new Dog("Milo",2,"Brown");
            AnimalArrayList.add(newann);
            newann = new Cat("Whiskey",3,"Brown");
            AnimalArrayList.add(newann);
            newann = new Duck ("Do",1,"White");
            AnimalArrayList.add(newann);
            newann = new Pig ("Po",10,"Pink");
            AnimalArrayList.add(newann);

            for(Animal ann: AnimalArrayList)
            {
                ann.printinfo();
            }


        }
    }
