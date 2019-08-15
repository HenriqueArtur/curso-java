package app;

public class App {
    public static void main(String[] args) throws Exception {
        int x = 20;

        Object obj = x;
        System.out.println(obj);

        int y = (int)obj;
        System.out.println(y);
    }
}