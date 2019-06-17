import java.io.File;
 
public class ListFiles {
 
   public static void main(String[] args) {
      dirRec(new File("C:\\samplegit"));
   }
 
   public static void dirRec(File dir) {
      File[] subdirs=dir.listFiles();
      for(File subdir: subdirs) {
         if (subdir.isDirectory()) {
            dirRec(subdir);
         } else {
            printFilePath(subdir);
         }
      }
   }
 
   public static void printFilePath(File file) {
      System.out.println(file.getAbsolutePath());
   }
}
 