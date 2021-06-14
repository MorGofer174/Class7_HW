import java.io.*;

public class Singleton {

    private static Singleton instance = null;

    private Singleton() throws IOException {}

    public static Singleton getInstance() throws IOException {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    //adds Text to file
    public void addText (String text) throws IOException {

        FileWriter writer = new FileWriter("C:\\Users\\MorG\\Desktop\\Log.txt",true);

        writer.write("\n"+text);
        writer.close();

    }}
