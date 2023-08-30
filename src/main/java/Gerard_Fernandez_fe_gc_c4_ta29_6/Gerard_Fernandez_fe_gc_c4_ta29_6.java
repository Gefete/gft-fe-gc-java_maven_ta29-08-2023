package Gerard_Fernandez_fe_gc_c4_ta29_6;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;

public class Gerard_Fernandez_fe_gc_c4_ta29_6 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4117266741229321317L;
	private JPanel contentPane;
	private JTextField pesoNum;
	private JTextField textField_2;
	private JTextField alturaNum;
	/**
	 * Create the frame.
	 */
	public Gerard_Fernandez_fe_gc_c4_ta29_6() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 128);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Altura (metros)");
		lblNewLabel.setBounds(17, 11, 91, 14);
		contentPane.add(lblNewLabel);
		
		alturaNum = new JTextField();
		alturaNum.setBounds(118, 8, 86, 20);
		contentPane.add(alturaNum);
		alturaNum.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Peso(kg)");
		lblNewLabel_1.setBounds(228, 11, 63, 14);
		contentPane.add(lblNewLabel_1);
		
		pesoNum = new JTextField();
		pesoNum.setBounds(301, 8, 86, 20);
		contentPane.add(pesoNum);
		pesoNum.setColumns(10);
		
		JButton btnNewButton = new JButton("Calcular IMC");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 DecimalFormat formatoDecimal = new DecimalFormat("#.##");
				 try {
                    double peso = Double.parseDouble(pesoNum.getText());
                    double altura = Double.parseDouble(alturaNum.getText());

                    double imc = peso / (altura * altura);

                    
                    textField_2.setText(formatoDecimal.format(imc));
                } catch (Exception e1) {
                	textField_2.setText("Error");
                }
			}
		});
		btnNewButton.setBounds(75, 39, 142, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("IMC");
		lblNewLabel_2.setBounds(245, 43, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setBounds(301, 40, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
	}
}
