package Gerard_Fernandez_fe_gc_c4_ta29_2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Gerard_Fernandez_fe_gc_c4_ta29_2 extends JFrame {

	private static final long serialVersionUID = 5401176801279226054L;
	private JPanel contentPane;
	//El label se crea aqui para que los botones puedan apuntar a el ya que dentro del constructor no funcionaba
	private JLabel etiq = new JLabel("Ningún botón ha sido pulsado");
	/**
	 * Create the frame.
	 */
	public Gerard_Fernandez_fe_gc_c4_ta29_2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		
		
		// esta es la etiqueta
	    
	    etiq.setBounds(100, 100, 450, 300);
	    contentPane.add(etiq);
	
	    // botones
	    JButton boton1 = new JButton("Botón 1");
	    boton1.setBounds(100, 100, 450, 300);
	    contentPane.add(boton1);
        
	    JButton boton2 = new JButton("Botón 2");
	    boton2.setBounds(100, 100, 450, 300);
	    contentPane.add(boton2);
	    
	    // Agregar oyentes de acción a los botones
        boton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	etiq.setText("Se ha pulsado el Botón 1");
            }
        });

        boton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                etiq.setText("Se ha pulsado el Botón 2");
            }
        });
	    
		setContentPane(contentPane);
	}

}
