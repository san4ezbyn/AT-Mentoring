package xml;

import cooking.salad.CookSalad;
import entities.Vegetable;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.ParserFactory;


import javax.swing.text.html.parser.Parser;
import javax.xml.parsers.*;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public class XMLparser extends CookSalad {


    public static void runPARSER() {


        try {

            File file = new File("atMentoring.xml");

            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();

            DocumentBuilder db = dbf.newDocumentBuilder();

            Document doc = db.parse(file);

            doc.getDocumentElement().normalize();

            System.out.println("Root element - " + doc.getDocumentElement().getNodeName());

            NodeList nodeLst = doc.getElementsByTagName("vegs");

            System.out.println("Information of all vegs for the SALAD:");


            for (int s = 0; s < nodeLst.getLength(); s++) {


                Node fstNode = nodeLst.item(s);


                if (fstNode.getNodeType() == Node.ELEMENT_NODE) {


                    Element fstElmnt = (Element) fstNode;

                    NodeList fstNmElmntLst = fstElmnt.getElementsByTagName("name");

                    Element fstNmElmnt = (Element) fstNmElmntLst.item(0);

                    NodeList fstNm = fstNmElmnt.getChildNodes();

                    System.out.println("Name : " + ((Node) fstNm.item(0)).getNodeValue());

                    NodeList lstNmElmntLst = fstElmnt.getElementsByTagName("weight");

                    Element lstNmElmnt = (Element) lstNmElmntLst.item(0);

                    NodeList lstNm = lstNmElmnt.getChildNodes();

                    System.out.println("Weight : " + ((Node) lstNm.item(0)).getNodeValue());


                    NodeList typeNmElmntLst = fstElmnt.getElementsByTagName("type");

                    Element typeNmEl = (Element) typeNmElmntLst.item(0);

                    NodeList typeNm = typeNmEl.getChildNodes();

                    System.out.println("Type : " + ((Node) typeNm.item(0)).getNodeValue());

                }

            }

        } catch (Exception e) {

            e.printStackTrace();

        }
    }
}





/*
COPY
package xml;

import com.sun.org.apache.xerces.internal.parsers.SAXParser;
import org.xml.sax.DocumentHandler;
import org.xml.sax.ErrorHandler;
import org.xml.sax.Parser;
import org.xml.sax.helpers.ParserFactory;
import utils.ConsolePrinter;


//=====================================
//Обработка xml-документа
//=====================================
public class SaxExample {

    private static String FILE_PATH = "example.xml";

    public static void main(String argv[]) {

        try {
            SAXParser sample = new SAXParser(FILE_PATH);

            Parser parser = ParserFactory
                    .makeParser("com.ibm.xml.parser.SAXDriver");
            parser.setDocumentHandler((DocumentHandler) sample);
            parser.setErrorHandler((ErrorHandler) sample);

            parser.parse(FILE_PATH);
            ConsolePrinter consolePrinter=new ConsolePrinter();
            sample.printInfo();
        } catch (Exception e) {
            e.printStackTrace(System.err);
        }
    }
*/
