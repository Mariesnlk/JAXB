package RESTful;

import jdk.internal.org.xml.sax.InputSource;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.XML;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.IOException;
import java.io.StringWriter;

public class ConvertXMLToJSON {
    public static String FILE = "src/main/java/RESTful/books.xml";
    public static int INDENTATION = 4;

    public static void main(String[] args) throws TransformerException, ParserConfigurationException, IOException, SAXException {
        File inputFile = new File(FILE);
        DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
        Document doc = docBuilder.parse(inputFile);
        TransformerFactory tf = TransformerFactory.newInstance();
        Transformer t = tf.newTransformer();
        StringWriter sw = new StringWriter();
        DOMSource domSource = new DOMSource(doc);
        StreamResult streamResult = new StreamResult(sw);
        t.transform(domSource, streamResult);
        String xmlToString = sw.toString(); //convert xml file to string
        try {
            JSONObject jsonObj = XML.toJSONObject(xmlToString);
            String json = jsonObj.toString(INDENTATION);

            System.out.println(json);
        } catch (JSONException ex) {
            ex.printStackTrace();
        }
    }
}
