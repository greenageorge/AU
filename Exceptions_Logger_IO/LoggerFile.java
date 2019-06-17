import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class LoggerFile {
	public static void main(String[] args) {  

	    Logger logger = Logger.getLogger("LogFile");  
	    FileHandler fh;  

	    try {  
  
	        fh = new FileHandler("C:\\samplegit\\LogFile.log");  
	        logger.addHandler(fh);
	        SimpleFormatter formatter = new SimpleFormatter();  
	        fh.setFormatter(formatter);  

	        logger.info("Logging Info");  

	    } catch (SecurityException e) {  
	        e.printStackTrace();  
	    } catch (IOException e) {  
	        e.printStackTrace();  
	    }  

	    logger.warning("First warning");  

	}
}
