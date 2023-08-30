package Gerard_Fernandez_fe_gc_c4_ta28_2;



import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Gerard_Fernandez_fe_gc_c4_ta28_2 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3440023162890685500L;
	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Create the frame.
	 */
	public Gerard_Fernandez_fe_gc_c4_ta28_2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 234);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Añadir");
		btnNewButton.setBounds(36, 143, 89, 23);
		contentPane.add(btnNewButton);
		
		//Se añade el comboBox
		JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.setBounds(265, 95, 110, 22);
		contentPane.add(comboBox);
		
		JLabel lblNewLabel_1 = new JLabel("Escribe el titulo de una pelicula");
		lblNewLabel_1.setBounds(10, 52, 158, 14);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(22, 96, 149, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Peliculas");
		lblNewLabel.setBounds(297, 52, 46, 14);
		contentPane.add(lblNewLabel);
		
		//En el evento hacemos un addItem al combobox y 
		//llamamos al contenido del textfield
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				comboBox.addItem(textField.getText());
			}
		});
	}

}
