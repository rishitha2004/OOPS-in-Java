import java.io.FileWriter;
import java.io.IOException;

public class createfile{
    public static void main(String[] args){
    try{
        FileWriter file=new FileWriter("myfile");
        file.write("Rishi is a good girl. Rishi is studying Computer Science. Rishi is from ATP.");
        file.close();
    }
    catch(IOException e){
        System.out.println("Error");
    }
    }        
}
