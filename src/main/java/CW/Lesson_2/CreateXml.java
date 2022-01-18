package CW.Lesson_2;

import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CreateXml {
    public static void main(String[] args) throws IOException, XMLStreamException {
        XMLOutputFactory factory = XMLOutputFactory.newFactory();
        XMLStreamWriter writer = factory.createXMLStreamWriter(new FileWriter("C:\\Users\\dlexe\\IdeaProjects\\WebServices\\src\\main\\java\\CW\\Lesson_2\\output.xml"));

        writer.writeStartDocument();
        writer.writeStartElement("factory");

        writer.writeStartElement("Candy");
        writer.writeAttribute("id", "01");
        writer.writeStartElement("title");
        writer.writeCharacters("Шоколадные");
        writer.writeEndElement();
        writer.writeStartElement("Manufacturer");
        writer.writeCharacters("Завод1");
        writer.writeEndElement();
        writer.writeEndElement();

        writer.writeStartElement("Candy");
        writer.writeAttribute("id", "02");
        writer.writeStartElement("title");
        writer.writeCharacters("Карамельки");
        writer.writeEndElement();
        writer.writeStartElement("Manufacturer");
        writer.writeCharacters("Завод2");
        writer.writeEndElement();
        writer.writeEndElement();

        writer.writeStartElement("Candy");
        writer.writeAttribute("id", "03");
        writer.writeStartElement("title");
        writer.writeCharacters("Ириски");
        writer.writeEndElement();
        writer.writeStartElement("Manufacturer");
        writer.writeCharacters("Завод3");
        writer.writeEndElement();
        writer.writeEndElement();

        writer.writeEndElement();
        writer.writeEndDocument();

        writer.flush();
        writer.close();
    }
}
