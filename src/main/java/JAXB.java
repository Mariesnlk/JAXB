
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class JAXB {

    private static final String JavaToXml_FILE = "javaToXml.xml";

    public static void main(String[] args) {

        Man man1 = new Man("Melnyk Oleksandr Andriyovych", "ex", "melnykxxl@gmail.com",
                "blond", "blue", 182, "2016-02-03", "2017-12-01");
        Man man2 = new Man("Kovalenko Mykhailo Igorovich", "ex", "mykhailo@gmail.com",
                "blond", "green", 185, "2017-12-07", "2017-12-07", "unknown");
        Man man3 = new Man("Tkachenko Andrii Oleksiyovich", "ex", "andrtkach@gmail.com",
                "black", "blue", 186, "2019-11-06", "2020-10-08");
        Man man4 = new Man("Kovalchuk Andrii Olegovich", "current", "kovalchuchka@gmail.com",
                "brown", "green", 180, "2020-12-02");
        Man man5 = new Man("Koval Ihor Andriyovich", "ex", "Koval_Ihor@gmail.com",
                "blond", "grey", 185, "2014-02-06", "2015-01-05", "bad husband");
        Man man6 = new Man("Oliinyk Oleg Sergitovich", "future", "oleg.oliinykchek@gmail.com",
                "blond", "green", 179, 92);
        Man man7 = new Man("Moroz Artem Vladuslavovich", "future", "moroz.artem@gmail.com",
                "brown", "blue", 181);
        Man man8 = new Man("Kostiuk Illia Ruslanovych", "future", "hi_welcom_home@ukr.net",
                "black", "blue", 179, 87);
        Man man9 = new Man("Boiko Andrii Oleksandrovych", "future", "andr.boiko@gmail.com",
                "blond", "grey", 181);

        List<Man> list = new ArrayList<>();
        list.add(man1);
        list.add(man2);
        list.add(man3);
        list.add(man4);
        list.add(man5);
        list.add(man6);
        list.add(man7);
        list.add(man8);
        list.add(man9);

        RegisterEX registerEX = new RegisterEX();

        registerEX.setManList(list);

        try {
            // create JAXB context and instantiate marshaller
            JAXBContext context = JAXBContext.newInstance(RegisterEX.class);

            // (1) Marshaller : Java Object to XML content.
            Marshaller m = context.createMarshaller();
            m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

            // Write to System.out
//            m.marshal(registerEX, System.out);

            // Write to File
            File outFile = new File(JavaToXml_FILE);
            m.marshal(registerEX, outFile);

            System.err.println("Write to file: " + outFile.getAbsolutePath());

            // (2) Unmarshaller : Read XML content to Java Object
            Unmarshaller um = context.createUnmarshaller();

            // find man by his initials and show info about him
            RegisterEX fromFile = (RegisterEX) um.unmarshal(new FileReader(JavaToXml_FILE));
            List<Man> manList = fromFile.getManList();
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the initials of the man");
            String name = scanner.nextLine();
            for (Man man : manList) {
                if (man.getInitials().equals(name)) {
                    System.out.println("Info about " + man.getInitials() + "\n" +
                            "status is " + man.getStatus() + "\n" + "email is " + man.getEmail() + "\n" +
                            "color of hair is " + man.getColor_of_hair() + "\n" + "color of eyes is " +
                            man.getColor_of_eyes() + "\n" + "height is " + man.getHeight() + "\n" +
                            "data marriage is " + man.getDate_marriage() + "\n" + "data divorce is " +
                            man.getDate_divorce() + "\n" + "attractiveness is " + man.getAttractiveness());
                }
//                else{
//                    System.out.println("There is no such man");
//                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}