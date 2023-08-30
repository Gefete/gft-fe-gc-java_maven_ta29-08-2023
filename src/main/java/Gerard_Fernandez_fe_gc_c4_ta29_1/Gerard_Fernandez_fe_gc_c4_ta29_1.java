package Gerard_Fernandez_fe_gc_c4_ta29_1;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Gerard_Fernandez_fe_gc_c4_ta29_1 extends JFrame {

	private static final long serialVersionUID = -445799091626353295L;
	private JPanel contentPane;
	/**
	 * Create the frame.
	 */
	public Gerard_Fernandez_fe_gc_c4_ta29_1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		// Crear una etiqueta
        JLabel etiqueta = new JLabel("¡Hola, esta es una etiqueta!");
        contentPane.add(etiqueta);
        etiqueta.setBounds(100, 100, 450, 300);

		setContentPane(contentPane);
	}

}
