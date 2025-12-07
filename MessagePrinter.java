public class MessagePrinter {
    
    public static String getWelcomeMessage() {
        return "Welcome to Git and GitHub!";
    }
    
    public static String getDateMessage() {
        return "Today is: " + java.time.LocalDate.now();
    }
    
    public static void main(String[] args) {
        System.out.println(getWelcomeMessage());
        System.out.println(getDateMessage());
        System.out.println("Learning remote repositories!");
    }
}
