package javaapplication_practica;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ButtonFrame extends JFrame implements ActionListener{
	JButton b1 ; // reference to the button object
    JButton b2 ;
    JButton b3 ;
    JButton b4 ;
    JButton b5 ;
    JButton b6 ;
    JButton b7 ;
    JButton b8 ;
    JButton b9 ;
    JButton b10 ;
    JButton b11 ;	
    JButton b12 ;
    JPanel pMeasure = new JPanel();
    controller_t_nume t_nume  = new controller_t_nume();
    controller_t_products t_products = new controller_t_products();
    controller_t_systems t_systems = new controller_t_systems();
    controller_t_tool t_tool = new controller_t_tool();
    

    ButtonFrame(String title)
    {
        super( title );                   // invoke the JFrame constructor
        setLayout( new FlowLayout() );    // set the layout manager
        JLabel l1 = new JLabel("NameTable:");
        JLabel l2 = new JLabel("ProductsTable:");
        JLabel l3 = new JLabel("SystemsTable:");
        JLabel l4 = new JLabel("ToolsTable:");

        b1 = new JButton("XML");
        b1.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });
        
        b2 = new JButton("XML to PDF");
        b2.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });
        
        b3 = new JButton("SQL Addition");
        b3.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });
        
        b4 = new JButton("XML");
        b4.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });
        
        b5 = new JButton("XML to PDF");
        b5.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5ActionPerformed(evt);
            }
        });
        
        b6 = new JButton("SQL Addition");
        b6.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
                b6ActionPerformed(evt);
            }
        });
        
        b7 = new JButton("XML");
        b7.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
                b7ActionPerformed(evt);
            }
        });
        
        b8 = new JButton("XML to PDF");
        b8.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
                b8ActionPerformed(evt);
            }
        });
        
        b9 = new JButton("SQL Addition");
        b9.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
                b9ActionPerformed(evt);
            }
        });
        
        b10 = new JButton("XML");
        b10.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
                b10ActionPerformed(evt);
            }
        });
        
        b11 = new JButton("XML to PDF");
        b11.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
                b11ActionPerformed(evt);
            }
        });
        
        b12 = new JButton("SQL Addition");
        b12.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
                b12ActionPerformed(evt);
            }
        });
        
        t_nume.loaddata();
        t_products.loaddata();
        t_systems.loaddata();
        t_tool.loaddata();
        
        add(l1);
        add( b1 );
        add( b2 );
        add( b3 );
        
        add(l2);
        add( b4 );
        add( b5 );
        add( b6 );
        
        add(l3);
        add( b7 );
        add( b8 );
        add( b9 );
        
        add(l4);
        add( b10 );
        add( b11 );
        add( b12 );
       
        setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
    }
    
    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        t_nume.afisare_xml("t_nume.xml");
    }
    
    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        t_nume.afisare_pdf("t_nume.xml","t_nume.pdf");
    }
    
    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        t_nume.sql_adaugare("t_nume.txt");
        t_nume.loaddata();
    }
    
    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        t_products.afisare_xml("t_products.xml");
    }
    
    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        t_products.afisare_pdf("t_products.xml","t_products.pdf");
    }
    
    private void b6ActionPerformed(java.awt.event.ActionEvent evt) {                                         
    	t_products.sql_adaugare("t_products.txt");
    	t_products.loaddata();
    }
    
    private void b7ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        t_systems.afisare_xml("t_systems.xml");
    }
    
    private void b8ActionPerformed(java.awt.event.ActionEvent evt) {                                         
    	t_systems.afisare_pdf("t_systems.xml","t_systems.pdf");
    }
    
    private void b9ActionPerformed(java.awt.event.ActionEvent evt) {                                         
    	t_systems.sql_adaugare("t_systems.txt");
    	t_systems.loaddata();
    }

    private void b10ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        t_tool.afisare_xml("t_tool.xml");
    }
    
    private void b11ActionPerformed(java.awt.event.ActionEvent evt) {                                         
    	t_tool.afisare_pdf("t_tool.xml","t_tool.pdf");
    }
    
    private void b12ActionPerformed(java.awt.event.ActionEvent evt) {                                         
    	t_tool.sql_adaugare("t_tool.txt");
    	t_tool.loaddata();
    }
    

public void actionPerformed(ActionEvent e) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
}
}



