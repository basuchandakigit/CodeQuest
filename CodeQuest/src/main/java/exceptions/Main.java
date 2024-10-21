package exceptions;
public class Main {
    public static void main(String[] args) {
        try {
            Class.forName("com.example.MissingClass");  // Will throw ClassNotFoundException
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
