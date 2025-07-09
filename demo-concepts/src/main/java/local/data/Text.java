package local.data;

public class Text {
    
    void useString(){
        String text = "Hello World!";
        System.out.println(text);
        System.out.println("Length: " + text.length());
        System.out.println("Uppercase: " + text.toUpperCase());
        System.out.println("Lowercase: " + text.toLowerCase());
        System.out.println("Substring (0, 5): " + text.substring(0, 5));
        System.out.println("Contains: 'World': " + text.contains("World"));
    }

    void useStringBuffer() {
        
    }

    public static void main(String[] args) {
        Text text = new Text();
        text.useString();
    }
}
