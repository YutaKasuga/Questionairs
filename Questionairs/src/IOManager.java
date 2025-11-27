import java.io.File;
import java.io.IOException;

public class IOManager {
    /**
     * Check if there is already file for save.
     * if not, create new file as questions.txt to src folder.
     */
    public void checkHasFile(){
        String path = ".\\src\\questions.txt"; // need to debug
        try {
            File file = new File(path);
            if (!file.exists()){
                if (file.createNewFile()){
                    System.out.println("New save has created");
                }
            }
        } catch(IOException e){
            System.out.println("Error: checkHasFile" + e);
        }
    }
}
