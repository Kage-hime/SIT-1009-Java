


class Main {
    public static void main(String[] args) {

        Employee empRef;
        Employee manager = new Manager("Jasmine",45,123,5);
        Employee developer = new Developer("Aldo",30,345,5,2);
        Employee designer = new Designer("Chris", 25,780,4);




        manager.printInfo();
        developer.printInfo();
        designer.printInfo();

    }
}