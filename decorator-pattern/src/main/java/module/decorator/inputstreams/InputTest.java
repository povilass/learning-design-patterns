package module.decorator.inputstreams;

import java.io.*;

/**
 * Created by Povilas on 2015.08.05.
 */
public class InputTest {

    public static void main(String[] args) throws IOException {
        int c;
        try {
            InputStream in = new LowerCaseInputStream(ClassLoader.getSystemResourceAsStream(("test.txt")));
            while ((c = in.read()) >= 0) {
                System.out.print((char) c);
            }
            in.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
