package Gerard_Fernandez_fe_gc_c4_ta29_4;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class Gerard_Fernandez_fe_gc_c4_ta29_4 extends JFrame {

	private static final long serialVersionUID = 4262793845183802738L;
	private JPanel contentPane;
	JTextArea txtArea = new JTextArea();
	/**
	 * Create the frame.
	 */
	public Gerard_Fernandez_fe_gc_c4_ta29_4() {
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		txtArea.setEditable(false);
		
		contentPane = new JPanel();
		
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Evento");
		lblNewLabel.setBounds(10, 97, 46, 14);
		contentPane.add(lblNewLabel);
		
		
		txtArea.setBounds(83, 11, 341, 167);
		contentPane.add(txtArea);
		
		addWindowListener(new WindowAdapter() { 
			@Override
            public void windowActivated( WindowEvent e ) {
            	txtArea.append( "Ventana activada\n" );
                }
            @Override
            public void windowOpened(WindowEvent e) {
            	txtArea.append("Ventana abierta\n");
            	}
            @Override
            public void windowClosing(WindowEvent e) {
            	txtArea.append("Ventana cerrándose\n");
            	}
            @Override
            public void windowClosed(WindowEvent e) {
            	txtArea.append("Ventana cerrada\n");
            	}
            @Override
            public void windowIconified( WindowEvent e ) {
            	txtArea.append( "Ventana Minimizado\n" );  
                }
            @Override
            public void windowDeiconified( WindowEvent e ) {
            	txtArea.append( "Ventana maximizado\n");
                }
            @Override
            public void windowDeactivated( WindowEvent e ) {
            	txtArea.append( "Ventana Desactivada\n" );
                }
            @Override
            public void windowGainedFocus( WindowEvent e ) {
            	txtArea.append( "Ventana gana atencion usuario\n" );
                }
            @Override
            public void windowLostFocus( WindowEvent e ) {
            	txtArea.append( "Ventana pierde atencion usuario\n" );
                }
            @Override
            public void windowStateChanged( WindowEvent e ) {
            	txtArea.append( "Ventana cambia de estado\n" );
                }
            
        });
	}

}
