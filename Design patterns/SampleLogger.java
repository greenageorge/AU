
import java.util.logging.*;
import java.io.*;

 public class SampleLogger{
    private final String logFile = "file.txt";
    private static Logger logger = Logger.getLogger("clientLogger");
    private static SampleLogger sampleLogger = null;
    FileHandler fh;
    SimpleFormatter formatter = new SimpleFormatter();  
    private static int balance = 500;
    
    private SampleLogger() {
        try {
            fh = new FileHandler(logFile);
            logger.addHandler(fh);
        } catch (IOException e) {}
    }
    public void deposit (int amount) {
        balance += amount;
        logger.info("balance after deposit " + balance );
    }
    public void withdraw (int amount) {
    	balance -= amount;
        logger.info("Balance after withdrawal " + balance);
        
    }
    public void getBalance () {
    	 logger.info(" Balance " + balance );   
    }
    public static synchronized SampleLogger getInstance(){
    if(sampleLogger == null)
        sampleLogger = new SampleLogger();
    return sampleLogger;
    }
    
}