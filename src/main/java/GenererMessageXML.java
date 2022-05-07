import javax.xml.bind.*;
import java.io.File;

public class GenererMessageXML {
/*
    public static void main(String[] args) throws JAXBException {
        Message message = new Message();
        message.setFrom("Fatma");
        message.setNew(true);
        message.setText("Hello");
        message.setTo("Béji");

        JAXBContext context = JAXBContext.newInstance(Message.class);
        Marshaller marshaller = context.createMarshaller();

        marshaller.setProperty("jaxb.encoding", "UTF-8");
        marshaller.setProperty("jaxb.formatted.output", true);
        marshaller.marshal(message, new File("message.xml"));
    }
 */

    public static void main(String[] args) throws JAXBException {

        JAXBContext context = JAXBContext.newInstance(Message.class);
        Unmarshaller unmarshaller = context.createUnmarshaller();

        Message message = (Message) unmarshaller.unmarshal(new File("message.xml"));

        System.out.println("From: " + message.getFrom());
        System.out.println("To: " + message.getTo());
        System.out.println("Text: " + message.getText());
    }
}
