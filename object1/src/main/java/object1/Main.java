package object1;

import java.util.logging.Logger;

public class Main {

    public static void main(String... args) {
        Person person1 = new Person("tevin",30,67);
        Logger logger=Logger.getLogger(Main.class.getName());
        logger.info("This is a module-using Hello World!");
        logger.info(person1.getHeight() + "");
    }

}