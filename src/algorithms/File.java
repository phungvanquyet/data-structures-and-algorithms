package algorithms;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class File {
    public static void main(String[] args) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("BufferedWrite.txt"));
        writer.write("hello world");
        writer.close();
    }
}
