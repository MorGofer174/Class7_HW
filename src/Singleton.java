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
    public static void addText (String text) throws IOException {
        File log =new File("C:\\Users\\MorG\\Desktop\\Log.txt");
        BufferedWriter writer = new BufferedWriter(new FileWriter(log));

        writer.write(text);
        writer.close();

    }}
