public class Strings {
    public static void main(String[] args) {
        String message = "Nice day";
        System.out.println(message);
        System.out.println("Langth: " + message.length());
        System.out.println("5th index: " + message.charAt(4));
        System.out.println(message.concat(" Helloo!"));
        System.out.println(message.startsWith("N"));
        System.out.println(message.endsWith("y"));
    }
}
