public class MessagePrinter {
    
    public static String getWelcomeMessage() {
    return "Welcome! Learning GitHub is fun and easy!";
}
    
    public static String getDateMessage() {
        return "Today is: " + java.time.LocalDate.now();
    }
    
    public static void main(String[] args) {
    System.out.println(getWelcomeMessage());
    System.out.println(getDateMessage());
    System.out.println("Learning remote repositories!");
    System.out.println(getGoodbyeMessage());
}

    public static String getGoodbyeMessage() {
    return "Thank you for using MessagePrinter!";
    }
    
}
