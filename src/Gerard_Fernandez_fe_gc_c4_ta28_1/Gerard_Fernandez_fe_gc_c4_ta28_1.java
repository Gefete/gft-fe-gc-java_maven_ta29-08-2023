package Gerard_Fernandez_fe_gc_c4_ta28_1;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Gerard_Fernandez_fe_gc_c4_ta28_1 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4223773468752343334L;
	
	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Create the frame.
	 */
	public Gerard_Fernandez_fe_gc_c4_ta28_1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(80, 116, 283, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("¡Saludar!");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "¡ Hola "+textField.getText()+" !");
			}
		});
		btnNewButton.setBounds(181, 186, 89, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Escribe un nombre para saludar");
		lblNewLabel.setBounds(149, 42, 195, 14);
		contentPane.add(lblNewLabel);
	}
}
