package Gerard_Fernandez_fe_gc_c4_ta28_3;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSlider;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;

public class Gerard_Fernandez_fe_gc_c4_ta28_3 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7095794131472816472L;
	private JPanel contentPane;

	

	/**
	 * Create the frame.
	 */
	public Gerard_Fernandez_fe_gc_c4_ta28_3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//==========================================Creacion Radio button (Group)
		JRadioButton windows = new JRadioButton("Windows");
		windows.setBounds(33, 76, 109, 23);
		contentPane.add(windows);
		
		JRadioButton linux = new JRadioButton("Linux");
		linux.setBounds(33, 102, 109, 23);
		contentPane.add(linux);
		
		JRadioButton mac = new JRadioButton("Mac");
		mac.setBounds(33, 128, 109, 23);
		contentPane.add(mac);
		//==========================================FIN Radio button (Group)
		
		JLabel lblNewLabel = new JLabel("Elige un Sistema Operativo");
		lblNewLabel.setBounds(33, 55, 136, 14);
		contentPane.add(lblNewLabel);
		//==========================================FIN Radio button
		
		JLabel lblEligeTuEspecialidad = new JLabel("Elige tu especialidad");
		lblEligeTuEspecialidad.setBounds(248, 55, 136, 14);
		contentPane.add(lblEligeTuEspecialidad);
		
		//Creacion slider
		JSlider slider = new JSlider();
		slider.setPaintLabels(true);
		slider.setMajorTickSpacing(1);
		slider.setValue(5);
		slider.setMaximum(10);
		slider.setMinimum(0);
		slider.setBounds(33, 205, 200, 45);
		contentPane.add(slider);
		
		JLabel lblNewLabel_1 = new JLabel("Horas dedicadas al ordenador");
		lblNewLabel_1.setBounds(33, 180, 163, 14);
		contentPane.add(lblNewLabel_1);
		
		//Creacion boton
		JButton btnNewButton = new JButton("Enviar");
		btnNewButton.setBounds(270, 190, 89, 23);
		contentPane.add(btnNewButton);
		
		
		//Grupo de botones sistema operativo
		ButtonGroup sistemSelected= new ButtonGroup();
		sistemSelected.add(windows);
		sistemSelected.add(linux);
		sistemSelected.add(mac);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Programación");
		chckbxNewCheckBox.setBounds(248, 76, 97, 23);
		contentPane.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Diseño gráfico");
		chckbxNewCheckBox_1.setBounds(248, 102, 97, 23);
		contentPane.add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("Administración");
		chckbxNewCheckBox_2.setBounds(248, 128, 97, 23);
		contentPane.add(chckbxNewCheckBox_2);
		
		//Evento del boton
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String values="Sitema Operativo Escogido:\n";
				if (windows.isSelected()) {
					values += windows.getText()+"\n";
                } else if (linux.isSelected()) {
                	values += linux.getText()+"\n";
                } else if (mac.isSelected()){
                	values += mac.getText()+"\n";
                }
				
				values +="\nEspeciallidad/es Escogida/s:\n";
				if (chckbxNewCheckBox.isSelected()) {
					values += chckbxNewCheckBox.getText()+"\n";
                } 
				if (chckbxNewCheckBox_1.isSelected()) {
                	values += chckbxNewCheckBox_1.getText()+"\n";
                } 
				if (chckbxNewCheckBox_2.isSelected()){
                	values += chckbxNewCheckBox_2.getText()+"\n";
                }
				
				values +="\nHoras dedicada al ordenador:\n";
				values += slider.getValue();
				
				
				//values+="Sitema Operativo Escogido:\n"+textoSeleccionado;
				JOptionPane.showMessageDialog(null, values);
			}
		});
	}
}
