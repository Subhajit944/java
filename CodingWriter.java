package file;
import java.io.FileWriter;
import java.io.IOException;

public class CodingWriter {
    
    public static void main(String[] args) {
        String fileName = "java-course.txt";
        FileWriter writer = null;
        
        try{
            writer  = new FileWriter(fileName);
            writer.write("This is the best");
            writer.flush();
            System.out.println("File Written Successfully");
        } catch (IOException exception){
            System.out.printf("Exception occurred %s\n" ,
             exception.getMessage());

        }finally{
            if(writer != null){
                
            }
        }
    }
}
