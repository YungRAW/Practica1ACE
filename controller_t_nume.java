package javaapplication_practica;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.sql.*;
import java.util.*;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Attr;
import java.io.File;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import java.io.*;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class controller_t_nume {

	protected ArrayList<t_nume> list_nume = new ArrayList<t_nume>();
	static JPanel err = new JPanel();

	public void loaddata() {
		try {
			ResultSet rs = javaapplication_practica.JavaApplication_Practica.db.execute_query("SELECT * FROM t_nume");
			// iterate through the java result set
			if (rs != null) {
				while (rs.next()) {
					t_nume x = new t_nume();
					x.setAll(rs.getInt("Id"), rs.getString("Nume"), rs.getString("Prenume"));
					list_nume.add(x);
				}
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(err, e, "Got an exception! ", JOptionPane.ERROR_MESSAGE);
		}
	}

	public void afisare_pdf(String filenamefrom, String filenameto) {
		int i;
		try {
			File inputFile = new File(filenamefrom);
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(inputFile);
			doc.getDocumentElement().normalize();
			com.itextpdf.text.Document document = new com.itextpdf.text.Document();
			PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(filenameto));
			writer.setPdfVersion(PdfWriter.VERSION_1_7);
			document.open();
			document.add(new Paragraph("Root element :" + doc.getDocumentElement().getNodeName()));
			NodeList nList = doc.getElementsByTagName("t_nume");
			document.add(new Paragraph("----------------------------"));
			document.add(new Paragraph("\n"));
			for (int temp = 0; temp < nList.getLength(); temp++) {
				Node nNode = nList.item(temp);
				document.add(new Paragraph("Current Element :" + nNode.getNodeName()));
				if (nNode.getNodeType() == Node.ELEMENT_NODE) {
					Element eElement = (Element) nNode;
					document.add(new Paragraph("ID : " + eElement.getAttribute("Id")));
					document.add(new Paragraph("Nume : " + eElement.getElementsByTagName("Nume").item(0).getTextContent()));
					document.add(new Paragraph("Prenume : " + eElement.getElementsByTagName("Prenume").item(0).getTextContent()));
					document.add(new Paragraph("\n"));
				}
			}
			document.close();
		} catch (Exception e) {
			JOptionPane.showMessageDialog(err, e, "Got an exception! ", JOptionPane.ERROR_MESSAGE);
		}
	}

	public void afisare_xml(String filename) {
		try {
			int i;
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.newDocument();
			// root element
			Element rootElement = doc.createElement("t_nume");
			doc.appendChild(rootElement);
			for (i = 0; i < list_nume.size(); i++) {
				
				Element numet = doc.createElement("t_nume");
                rootElement.appendChild(numet);

				// id element
				Attr attr = doc.createAttribute("Id");
                attr.setValue(Integer.toString(list_nume.get(i).getID()));
                numet.setAttributeNode(attr);

				// Nume element
				Element nume = doc.createElement("Nume");
				nume.appendChild(doc.createTextNode(list_nume.get(i).getNume()));
				numet.appendChild(nume);

				// Prenume element
				Element prenume = doc.createElement("Prenume");
				prenume.appendChild(doc.createTextNode(list_nume.get(i).getPrenume()));
				numet.appendChild(prenume);

			}

			// write the content into XML file
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource source = new DOMSource(doc);
			StreamResult result = new StreamResult(new File(filename));
			transformer.transform(source, result);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(err, e, "Got an exception! ", JOptionPane.ERROR_MESSAGE);
		}
	}

	public void sql_adaugare(String filename) {
		String sql = "INSERT INTO `t_nume` (`Id`, `Nume`, `Prenume`) VALUES";
		BufferedReader br = null;
		FileReader fr = null;
		try {

			fr = new FileReader(filename);
			br = new BufferedReader(fr);
			String sCurrentLine;
			br = new BufferedReader(new FileReader(filename));
			while ((sCurrentLine = br.readLine()) != null) {
				sql = sql.concat(" ");
				sql = sql.concat(sCurrentLine);
			}
			int rs = javaapplication_practica.JavaApplication_Practica.db.execute_update(sql);
			if (br != null)
				br.close();
			if (fr != null)
				fr.close();

		} catch (Exception e) {
			JOptionPane.showMessageDialog(err, e, "Got an exception! ", JOptionPane.ERROR_MESSAGE);
		}
	}
}
