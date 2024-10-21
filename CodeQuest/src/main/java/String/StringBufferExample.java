package String;
public class StringBufferExample {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello, World!");
        int codePointCount = sb.codePointCount(0, 12);
        System.out.println("Number of Unicode code points from index 0 to 12: " + codePointCount);
    }
}
