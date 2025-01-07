package behavioral_patterns.chain_of_responsibility;

public class Main {
    public static void main(String[] args) {
        // Create handlers
        Chain juniorHandler = new JuniorSupportHandler();
        Chain seniorHandler = new SeniorSupportHandler();
        Chain expertHandler = new ExpertSupportHandler();

        // Setup chain
        juniorHandler.setNextHandler(seniorHandler);
        seniorHandler.setNextHandler(expertHandler);

        // Create requests
        SupportRequest simpleRequest = new SupportRequest("Issue with login", 1);
        SupportRequest mediumRequest = new SupportRequest("Database connection issue", 2);
        SupportRequest complexRequest = new SupportRequest("Critical system failure", 3);

        // Handled by Junior
        juniorHandler.handleRequest(simpleRequest);
        System.out.println();
        // Handed to Senior
        juniorHandler.handleRequest(mediumRequest);
        System.out.println();
        // Handed to Expert
        juniorHandler.handleRequest(complexRequest);
    }
}