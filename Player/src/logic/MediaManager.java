/**
 * Diese Klasse öffnen den JFilechooser und speichert die Pfade ind dem ausgewähltem Ordner in einer Arraylist.
 * 
 * @author  Jan Bumbacher
 * @version 1.1
 * 
 */


package logic;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;

public class MediaManager {
	static JFrame frame;


	public static Object files;

	/*
	 * Klasse für den FileChooser. Hier wird der Pfad mitgegeben und die einzelnen Dateien in der Console ausgegeben.
	 */
	
	public static void choose() {
		JFileChooser chooser = new JFileChooser();
		chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
		chooser.showOpenDialog(null);

		String path = (chooser.getSelectedFile().getAbsolutePath());
		System.out.println(path);

		String verzName = path;
		ArrayList<File> files = getPaths(new File(verzName), new ArrayList<File>());
		if (files == null)
			return;
		try {
			for (int i = 0; i < files.size(); i++)
				System.out.println(files.get(i).getCanonicalPath());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/*
	 * Hier werden die Dateien in eine ArrayList gefüllt.
	 */
	public static ArrayList<File> getPaths(File file, ArrayList<File> list) {
		if (file == null || list == null || !file.isDirectory())
			return null;
		File[] fileArr = file.listFiles();
		for (File f : fileArr) {
			if (f.isDirectory()) {
				getPaths(f, list);
			}

			list.add(f);
		}
		return list;
	}
	
	/*
	 * Hier wird das Frame initialisiert.
	 */
	public static void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(1, 0, 0, 0));
		
		
		
	}
}
