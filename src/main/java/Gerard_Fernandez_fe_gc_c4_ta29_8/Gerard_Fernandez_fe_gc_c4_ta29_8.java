package Gerard_Fernandez_fe_gc_c4_ta29_8;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Gerard_Fernandez_fe_gc_c4_ta29_8 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6235752435702761165L;
	private JPanel contentPane;
	private char indicador='e';
	/**
	 * Create the frame.
	 */
	public Gerard_Fernandez_fe_gc_c4_ta29_8() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 523, 209);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
        JLabel etiquetaPesetas = new JLabel("Cantidad a convertir");
        etiquetaPesetas.setBounds(34, 14, 108, 14);
        
        
        final JTextField datos = new JTextField(10);
        datos.setBounds(152, 11, 86, 20);

        JLabel etiquetaEuros = new JLabel("Resultado");
        etiquetaEuros.setBounds(262, 14, 62, 14);
        
        
        final JTextField resultado = new JTextField(10);
        resultado.setEditable(false);
        resultado.setBounds(322, 11, 86, 20);

        // Este es el boton de la conversion
        final JButton botonConvertir = new JButton("Pesetas a euros");
        botonConvertir.setBounds(152, 54, 160, 23);
        botonConvertir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	double cantidadPesetas =0;
    			double cantidadEuros =0;
            	DecimalFormat formatoDecimal = new DecimalFormat("#.##");
            	//Si el char indica e de pesetas a euros
                if(indicador=='e') {
	                try {
	                    cantidadPesetas = Double.parseDouble(datos.getText());
	                    if(cantidadPesetas>0) {
		                    cantidadEuros = cantidadPesetas / 166.386;
		                    resultado.setText(formatoDecimal.format(cantidadEuros));
	                    }else {
	                    	resultado.setText("Num. negativo");
	                    }
	                } catch (Exception e2) {
	                	resultado.setText("Error");
	                } 
                    
                //indica de euros a pesetas    
                }else {
                	try { 
                		
                		cantidadEuros = Double.parseDouble(datos.getText());
                		if(cantidadEuros>0) {
	 	                    cantidadPesetas = cantidadEuros / 0.0060;
	 	                    resultado.setText(formatoDecimal.format(cantidadPesetas));
 	                    }else {
 	                    	resultado.setText("Num. negativo");
 	                    }
 	                } catch (Exception e1) {
 	                	resultado.setText("Error");
 	                }
                    
                }
            }
        });
        contentPane.setLayout(null);

        // se añaden los componentes al panel
        contentPane.add(etiquetaPesetas);
        contentPane.add(datos);
        contentPane.add(etiquetaEuros);
        contentPane.add(resultado);
        contentPane.add(botonConvertir);
		
		setContentPane(contentPane);
		
		//Este boton controla el tipo de conversion que se realiza
		JButton btnNewButton = new JButton("Cambiar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (indicador=='e') {
					indicador='p';
					botonConvertir.setText("Euros a pesetas");
				}else {
					indicador='e';
					botonConvertir.setText("Pesetas a euros");
					
				}
			}
		});
		btnNewButton.setBounds(322, 54, 86, 23);
		contentPane.add(btnNewButton);
		
		JButton btnLimpiar = new JButton("Borrar");
		btnLimpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				datos.setText("");
				resultado.setText("");
			}
		});
		btnLimpiar.setBounds(290, 99, 118, 23);
		contentPane.add(btnLimpiar);
	}

}