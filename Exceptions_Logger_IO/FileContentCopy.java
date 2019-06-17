import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
 
public class FileContentCopy {
 
	public static void main(String[] args) {
 
		try {
			FileReader fr = new FileReader("C:\\samplegit\\input.txt");
			BufferedReader br = new BufferedReader(fr);
			FileWriter fw = new FileWriter("C:\\samplegit\\output.txt", true);
			String s;
 
			while ((s = br.readLine()) != null) { 
				fw.write(s);
				fw.flush();
			}
			br.close();
			fw.close();
                        System.out.println("Copied Successfully");
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
}