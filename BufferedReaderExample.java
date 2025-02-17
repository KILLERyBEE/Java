import java.io.*;

public class BufferedReaderExample {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter your name: ");
        String name = br.readLine(); // Reads a line of text

        System.out.print("Enter your age: ");
        int age = Integer.parseInt(br.readLine()); // Convert string to integer

        System.out.println("Hello, " + name + "! You are " + age + " years old.");
    }
}
