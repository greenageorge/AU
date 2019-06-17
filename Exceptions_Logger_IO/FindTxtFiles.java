import java.io.File;
import java.io.FilenameFilter;


public class FindTxtFiles {
	public static void main(String[] args) {
		File dir = new File("C:\\samplegit");
		
		
		File[] files=dir.listFiles(new FilenameFilter() {
			@Override
			public boolean accept(File dir, String name) {
				return name.endsWith(".txt");
			}
		});
		
		for (File file : files) {
			System.out.println(file.getName());
		}
	}
}