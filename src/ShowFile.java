import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ShowFile {
    public static void main(String[] args) throws IOException {
        FileInputStream fis;
        int bajt;

        try {
            fis = new FileInputStream("test123.txt");
        } catch (FileNotFoundException e){
            System.out.println("File not Found");
            return;
        }

        try {
            do {
                bajt = fis.read();
                if (bajt != -1) System.out.print((char) bajt);
            } while (bajt != 1);
        } catch (IOException e) {
            System.out.println("Error reading file");
            } finally {
            try{
                fis.close();
                System.out.println("File closed");
            }catch (IOException e){
                System.out.println("Error closing file");
            }
        }
    }
}
