package edu.bsuir.general;

import edu.bsuir.driver.WebDriverSingleton;
import edu.bsuir.web.page.LoginPage;
import jdk.internal.org.xml.sax.SAXException;
import org.openqa.selenium.WebDriver;
import org.w3c.dom.*;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public class Parser {

    public static User ParserXml(String role) throws InterruptedException {
        User list = new User();
        try {
            File inputFile = new File("file.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();
            NodeList nList = doc.getElementsByTagName("Role");

            for (int temp = 0; temp < nList.getLength(); temp++) {
                Node nNode = nList.item(temp);

                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element eElement = (Element) nNode;

                    NamedNodeMap attributes = eElement.getAttributes();
                    Node nameAttrib1 =  attributes.getNamedItem("Name");
                    String name = nameAttrib1.getNodeValue();

                    if (name.equals(role)) {
                        String Login1 =eElement.getElementsByTagName("Login").item(0).getTextContent();
                        String Password1 =eElement.getElementsByTagName("Password").item(0).getTextContent();
                        list.setLogin(Login1);
                        list.setPassword(Password1);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

}
