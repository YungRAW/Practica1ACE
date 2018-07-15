package javaapplication_practica;
import java.awt.Dimension;
import java.awt.Toolkit;



public class JavaApplication_Practica {

	public static d_manager db = new d_manager();

	public static void main(String[] args) {
		ButtonFrame frm = new ButtonFrame("RIB XML/PDF Converter for Databases");
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		frm.setSize(420,175);
		frm.setResizable(false);
		frm.setLocation(dim.width / 2 - frm.getSize().width / 2, dim.height / 2 - frm.getSize().height / 2);
		frm.setVisible(true);
	}

}
