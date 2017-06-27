/**
 * 
 * @author  Jan Bumbacher, Benjamin Schenkemeyer
 * @version 1.1
 * 
 */





package gui;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Gui extends JFrame implements ActionListener{

	public JFrame frame;
	
	public Gui() {
		initialize();

	}

	/*
	 * Gameframe wirs.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.GRAY);
		
		JButton btnOrdnerAuswhlen = new JButton("Ordner mit Medien ausw\u00E4hlen");
		frame.getContentPane().add(btnOrdnerAuswhlen, BorderLayout.SOUTH);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new BorderLayout(0, 0));
		
		JLabel lblSchmolbacherMusikUnd = new JLabel("Schmolbacher Musik und Film Verwaltungsdienst");
		lblSchmolbacherMusikUnd.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblSchmolbacherMusikUnd, BorderLayout.NORTH);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		
		btnOrdnerAuswhlen.addActionListener(this);
	}

	@Override
	/*
	 *Action Listener Klasse um Gui 2 darzustellen 
	 */
	public void actionPerformed(ActionEvent arg0) {
		Gui2 g2 = new Gui2();
		g2.frame.setVisible(true);
		setVisible(false);
		//System.exit(0);
		
	}

}
