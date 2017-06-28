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

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

import logic.MediaManager;

/**
 * Diese Klasse ist für das zweite Gui zuständig mit dem Beenden Button und dem filechooser.
 * @author  Jan Bumbacher, Benjamin Schenkemeyer
 * @version 1.1
 */
public class Gui2 implements ActionListener{

	JFrame frame;
	JButton btnNeuerOrdnerWhlen = new JButton("Neuer Ordner w\u00E4hlen");
	JButton btnBeenden = new JButton("Beenden");
	JList list = new JList();
	


	/**
	 * gui2 initialisieren.
	 * @author Jan Bumbacher, Benjamin Schenkemeyer
	 */
	public Gui2() {
		initialize();
	}

	/**
	 * Klasse um Frame von Gui 2 erstellen.
	 * @author Jan Bumbacher, Benjamin Schenkemeyer
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(1, 0, 0, 0));
		

		panel.add(list);
		
		JPanel panel_1 = new JPanel();
		panel.add(panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		
		panel_1.add(btnBeenden, BorderLayout.SOUTH);
		
		
		panel_1.add(btnNeuerOrdnerWhlen, BorderLayout.NORTH);
		
		
		btnNeuerOrdnerWhlen.addActionListener(this);
		btnBeenden.addActionListener(this);
		
		
		
	}
	/**
	 * Actionlistener Klasse für das Beenden unf für den Neuen Ordner zum auswählen.
	 * @author Jan Bumbacher
	 * @param e
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btnNeuerOrdnerWhlen)
		{
			MediaManager.choose();
			MediaManager.initialize();
			list.add("Test", btnBeenden);	
			
		}
		if(e.getSource() == btnBeenden)
		{
			System.exit(0);
		}
	}
	

}
