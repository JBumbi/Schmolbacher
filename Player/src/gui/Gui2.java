package gui;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;

import logic.MediaManager;

public class Gui2 implements ActionListener{

	JFrame frame;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the application.
	 */
	JButton btnNeuerOrdnerWhlen = new JButton("Neuer Ordner w\u00E4hlen");
	JButton btnBeenden = new JButton("Beenden");
	public Gui2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(1, 0, 0, 0));
		
		JList list = new JList();
		panel.add(list);
		
		JPanel panel_1 = new JPanel();
		panel.add(panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		
		panel_1.add(btnBeenden, BorderLayout.SOUTH);
		
		
		panel_1.add(btnNeuerOrdnerWhlen, BorderLayout.NORTH);
		
		
		btnNeuerOrdnerWhlen.addActionListener(this);
		btnBeenden.addActionListener(this);
		
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btnNeuerOrdnerWhlen)
		{
			MediaManager.choose();
		
		
		
		}
		if(e.getSource() == btnBeenden)
		{
			System.exit(0);
		}
	}
	

}
