package Gerard_Fernandez_fe_gc_c4_ta29_5;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;

public class Gerard_Fernandez_fe_gc_c4_ta29_5 extends JFrame {

	private static final long serialVersionUID = 7284027993576156016L;
	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public Gerard_Fernandez_fe_gc_c4_ta29_5() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		final JTextArea textArea = new JTextArea();
		textArea.setBounds(0, 41, 434, 220);
		contentPane.add(textArea);
		
		//Creacion del boton
		JButton btnClear = new JButton("limpiar");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("");
			}
		});
		
		//Se añade los eventos del raton
		addMouseListener(new MouseAdapter() {
			//presionado
			@Override
			public void mousePressed(MouseEvent me) { 
				textArea.append("Raton presionado \n");
		    } 
			//clica
			@Override
			public void mouseClicked(MouseEvent me) { 
				textArea.append("Raton clica \n");
		    } 
			//soltado
			@Override
			 public void mouseReleased(MouseEvent me) { 
				textArea.append("Raton suelta \n");
		    } 
			//entra
			@Override
			public void mouseEntered(MouseEvent me) { 
				textArea.append("Raton entra \n");
		    } 
			//sale
			@Override
			public void mouseExited(MouseEvent me) { 
				textArea.append("Raton sale \n");
		    } 
		});
		btnClear.setBounds(171, 11, 89, 23);
		contentPane.add(btnClear);
	}
}
