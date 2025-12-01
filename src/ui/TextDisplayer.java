package src.ui;

public class TextDisplayer {
    public static void type(String text, int speed) {
        for (char c : text.toCharArray()) {
            System.out.print(c);
            try { Thread.sleep(speed); } catch (InterruptedException e) {}
        }
        System.out.println();
    }
    
    public static void normalType(String text) {
        type(text, 50);
    }
    
    public static void slowType(String text) {
        type(text, 40);
    }
    
    public static void dramaticType(String text) {
        type(text, 50);
    }
}