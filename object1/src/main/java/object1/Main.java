package object1;

import java.util.logging.Logger;

public class Main {

    public static void main(String... args) {
        Logger logger=Logger.getLogger(Main.class.getName());
        logger.info("This is a module-using Hello World!");

        //Made objects from all of the classes
        Person person = new Person("Chaz",178);
        Chair chair = new Chair("wood","brown",4);
        Dog dog = new Dog("fido",3,"wolf");
        Car car = new Car("Chevy","Cruze",2021,67483);

        System.out.println(person.height);
    }



}


