

public class SampleLoggerTest{

        public static void main(String[] args){
        		SampleLogger logger1 = SampleLogger.getInstance();            
               
                logger1.deposit(100);
                logger1.withdraw(200);                
                logger1.getBalance();
            }

}