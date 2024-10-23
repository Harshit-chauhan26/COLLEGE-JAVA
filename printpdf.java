import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.*;
public class printpdf {
    public static void main(String[] args) {
        try {
            System.setOut(new PrintStream(C:\Users\Harshit Chauhan\OneDrive\Desktop\CLASSSSSSSSSSSSSS\harshit.txt));
            System.out.println("hello world");
        } catch (FileNotFoundException e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
}