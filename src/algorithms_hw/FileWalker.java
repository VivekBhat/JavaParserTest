package algorithms_hw;

import java.io.File;
import java.util.ArrayList;

public class FileWalker {
	/**
	 * Reference Resource: Recursively traverse directories
	 * http://stackoverflow.com/questions/2056221/recursively-list-files-in-java
	 * * modified: for java files and added helper methods
	 */
	public static ArrayList<String> fileList = new ArrayList<String>();

	public void walk(String path) {

		File root = new File(path);
		File[] list = root.listFiles();

		if (list == null)
			return;

		for (File f : list) {
			if (f.isDirectory()) {
				walk(f.getAbsolutePath()); // recursive call on a directory -
											// track
				System.out.println("Dir:" + f.getAbsoluteFile());
			} else {
				System.out.println("File:" + f.getAbsoluteFile());
			}
		}
	}

	/**
	 * Based on the stackeoverflow post walk() method modified to find and add
	 * only java files in a directory
	 * 
	 * @param path
	 *            - the directory to search for java files
	 */
	public void walkJavaFiles(String path) {

		File root = new File(path);
		File[] list = root.listFiles();

		if (list == null)
			return;
		for (File f : list) {
			if (f.isDirectory()) {
				walkJavaFiles(f.getAbsolutePath());
			} else {
				if (f.getName().endsWith(".java")) {
					fileList.add(f.getAbsoluteFile().toString());
				}
			}
		}
	}

	/**
	 * Print out the list of files on the console
	 */
	public void printListFiles() {
		// print out the list of java file - absolute path
		for (String f : fileList) {
			System.out.println(f);
		}

	}

	/**
	 * Returns the list of java files
	 * 
	 * @return fileList - arraylist of java files
	 */
	public ArrayList<String> getListJavaFiles() {
		return fileList;
	}

	/**
	 * Uncomment main method only when want testing this class
	 * 
	 * @param args
	 */
	/*
	 * public static void main(String[] args) { FileWalker fw = new
	 * FileWalker(); // fw.walk("C:/Users/Krishna/workspaceNeon/SamplePrograms"
	 * ); // check and see in the path
	 * fw.walkJavaFiles("C:/Users/Krishna/workspaceNeon/SamplePrograms");
	 * fw.printListFiles();
	 * 
	 * }
	 */
}
