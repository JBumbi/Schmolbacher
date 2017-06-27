package logic;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JFileChooser;

import gui.Gui2;

public class MediaManager {

	public static Object files;

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

}
