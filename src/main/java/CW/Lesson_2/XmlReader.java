package CW.Lesson_2;

import CW.Lesson_2.entity.Candy;

import javax.xml.stream.*;
import javax.xml.stream.events.Attribute;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class XmlReader {

    private static String idCandy;
    private static String title;
    private static String Manufacturer;

    public static void main(String[] args) throws FileNotFoundException, XMLStreamException {

        XMLInputFactory factory = XMLInputFactory.newFactory();
        Reader reader = new FileReader("C:\\Users\\dlexe\\IdeaProjects\\WebServices\\src\\main\\java\\CW\\Lesson_2\\output.xml");


        List<Candy> candyList = new ArrayList<>();

        XMLEventReader xmlEventReader = factory.createXMLEventReader(reader);

        while (xmlEventReader.hasNext()) {
            XMLEvent event = xmlEventReader.nextEvent();

            switch (event.getEventType()) {

                case XMLStreamReader.START_ELEMENT:
                    StartElement startElement = event.asStartElement();

                    String elem = startElement.getName().toString();

                    switch (elem) {
                        case "Candy":
                            Iterator<Attribute> iterator = startElement.getAttributes();

                            while (iterator.hasNext()) {
                                Attribute attribute = iterator.next();
                                idCandy = attribute.getValue();
                            }
                            break;
                        case "title":
                            title = xmlEventReader.getElementText();
                            break;
                        case "Manufacturer":
                            Manufacturer = xmlEventReader.getElementText();
                            candyList.add(new Candy(idCandy, title, Manufacturer));
                            break;
                    }
                    break;
                case XMLStreamReader.END_ELEMENT:
                    break;
            }
        }
        candyList.stream().forEach(System.out::println);
    }
}
