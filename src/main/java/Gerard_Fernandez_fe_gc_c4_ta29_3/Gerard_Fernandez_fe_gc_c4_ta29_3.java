package Gerard_Fernandez_fe_gc_c4_ta29_3;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Gerard_Fernandez_fe_gc_c4_ta29_3 extends JFrame {

	private static final long serialVersionUID = 6456833286572320090L;
	private JPanel contentPane;
	private int countClick1=0;
	private int countClick2=0;


	/**
	 * Create the frame.
	 */
	public Gerard_Fernandez_fe_gc_c4_ta29_3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 316, 179);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		final JLabel lbbtn1 = new JLabel("Boton 1:");
		lbbtn1.setBounds(10, 14, 110, 14);
		contentPane.add(lbbtn1);
		
		final JLabel lbbtn2 = new JLabel("Boton 2:");
		
		lbbtn2.setBounds(145, 14, 110, 14);
		contentPane.add(lbbtn2);
		
		JButton btn1 = new JButton("Boton 1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				countClick1++;
				lbbtn1.setText("Boton 1: "+countClick1+" veces");
			}
		});
		btn1.setBounds(10, 49, 89, 23);
		contentPane.add(btn1);
		
		JButton btn2 = new JButton("Boton 2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				countClick2++;
				lbbtn2.setText("Boton 2: "+countClick2+" veces");
			}
		});
		btn2.setBounds(145, 49, 89, 23);
		contentPane.add(btn2);
	}

}
