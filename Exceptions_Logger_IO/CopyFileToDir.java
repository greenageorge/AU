import java.io.*;

import java.nio.file.Files;
public class CopyFileToDir {
	
	/*
	 * private static void copyFiles(File source, File dest) throws IOException {
	 * Files.copy(source.toPath(), dest.toPath()); }
	 */

	public static void main(String args[]) {

		File source = new File("C:\\samplegit\\input.txt");
        File dest = new File("C:\\newfolder\\input.txt");
        try {
        Files.copy(source.toPath(), dest.toPath());
        System.out.println("Filed copied successfully");
        }
        catch(IOException e){
        e.printStackTrace();	
        }

	}
}
