package parserXML;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import java.io.File;

public class ReadXMLFile {
	
	public static void main(String args[]) {
		try {			
			File fXmlFile = new File("C:/Users/kevin/workplace/javaTutorial/src/parserXML/2.5_week.atom");
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(fXmlFile);
			
			doc.getDocumentElement().normalize();
			
			System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
			
			NodeList nList = doc.getElementsByTagName("entry");
			
			System.out.println("----------------------------");
			
			for (int i = 0; i< nList.getLength(); i ++) {
				Node nNode = nList.item(i);
				
				System.out.println("\nCurrent Element :" + nNode.getNodeName());
				
				if (nNode.getNodeType() == Node.ELEMENT_NODE) {
					
					Element eElement = (Element) nNode;
					
					System.out.println("Id : " + eElement.getElementsByTagName("id"));
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
