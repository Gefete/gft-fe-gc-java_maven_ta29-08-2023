package Gerard_Fernandez_fe_gc_c4_ta28_4;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Gerard_Fernandez_fe_gc_c4_ta28_4 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5753012756441328366L;
	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public Gerard_Fernandez_fe_gc_c4_ta28_4() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 425, 242);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel Label_1 = new JLabel("Número 1:");
		Label_1.setBounds(25, 11, 89, 23);
		contentPane.add(Label_1);
		
		JTextField textField1 = new JTextField();
		textField1.setBounds(96, 11, 89, 23);
		contentPane.add(textField1);
		
		JLabel Label_2 = new JLabel("Número 2:");
		Label_2.setBounds(241, 11, 89, 23);
		contentPane.add(Label_2);
		
        JTextField textField2 = new JTextField();
        textField2.setBounds(305, 11, 89, 23);
        contentPane.add(textField2);
        
        JLabel Label_3 = new JLabel("Resultado:");
        Label_3.setBounds(25, 60, 89, 23);
        contentPane.add(Label_3);
        
        JTextField resultField = new JTextField();
        resultField.setBounds(96, 60, 89, 23);
        contentPane.add(resultField);
        resultField.setEditable(false);

        
        JButton sumButton = new JButton("+");
        sumButton.setBounds(305, 60, 89, 23);
        contentPane.add(sumButton);
        
        JButton subtractButton = new JButton("-");
        subtractButton.setBounds(305, 94, 89, 23);
        contentPane.add(subtractButton);
        
        JButton multiplyButton = new JButton("*");
        multiplyButton.setBounds(305, 128, 89, 23);
        contentPane.add(multiplyButton);
        
        JButton divideButton = new JButton("/");
        divideButton.setBounds(305, 162, 89, 23);
        contentPane.add(divideButton);
        
        JButton exitButton = new JButton("Salir");
        exitButton.setBounds(124, 162, 89, 23);
        contentPane.add(exitButton);
        
        JButton aboutButton = new JButton("Acerca de");
        aboutButton.setBounds(25, 162, 89, 23);
        contentPane.add(aboutButton);

        sumButton.addActionListener(new ActionListener() {
        	Calculadora calculate=new Calculadora();
	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	resultField.setText(calculate.calculateAndSetResult(textField1.getText(), textField2.getText(), "+"));
            }
        });

        subtractButton.addActionListener(new ActionListener() {
        	Calculadora calculate=new Calculadora();
            @Override
            public void actionPerformed(ActionEvent e) {
            	resultField.setText(calculate.calculateAndSetResult(textField1.getText(), textField2.getText(), "-"));
            }
        });

        multiplyButton.addActionListener(new ActionListener() {
        	Calculadora calculate=new Calculadora();
            @Override
            public void actionPerformed(ActionEvent e) {
            	resultField.setText(calculate.calculateAndSetResult(textField1.getText(), textField2.getText(), "*"));
            }
        });

        divideButton.addActionListener(new ActionListener() {
        	Calculadora calculate=new Calculadora();
            @Override
            public void actionPerformed(ActionEvent e) {
            	resultField.setText(calculate.calculateAndSetResult(textField1.getText(), textField2.getText(), "/"));
            }
        });

        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        aboutButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "MiniCalculadora v1.0\nAutor: Gerard Fernández", "Acerca de", JOptionPane.INFORMATION_MESSAGE);
            }
        });

	}

}
