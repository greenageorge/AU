import java.io.File;
import java.io.FileInputStream;
public class Excep {

	
	public static void main(String args[]) {
		try {
			// Arithmetic Exception 
			int a=8/0;}
		catch (Exception e){
			e.printStackTrace();
		
			}
		//Array Index Out Of Bounds
		try {
			int[] arr=new int[20];
			arr[21]=3;}
		catch (Exception e){
			e.printStackTrace();
		
			}
			
			
			//File not found
			try{
				File file = new File("D:/Test.txt");
				FileInputStream f = new FileInputStream(file);
				System.out.println(f.read());}
			catch (Exception e){
					e.printStackTrace();
				
			}
			
			
		}


}
