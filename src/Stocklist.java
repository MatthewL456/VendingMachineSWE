import java.io.File;  // Import the File class
import java.io.FileWriter;
import java.io.IOException;  // Import the IOException class to handle errors

public class Stocklist {
    public static void createFile() {
        try {
            File stocklist = new File("stocklist.txt");
            if (stocklist.createNewFile()) {
                System.out.println("File created: " + stocklist.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    public static void writeFile(String selectionUpdate) {
        try {
            FileWriter stocklistWriter = new FileWriter("stocklist.txt");
            stocklistWriter.write(selectionUpdate);
            stocklistWriter.close();
            System.out.println("Wrote to file.");
        } catch (IOException e) {
            System.out.println("An Error.");
            e.printStackTrace();
        }
    }
}

