package structural_patterns.proxy;

public class Main {
    public static void main(String[] args) {
         // Create instance of the proxy
         StreamingService streamingService = new StreamingProxy();
         // Create an unsubscribed client
         Client client = new Client(false);
         // Try to stream content without a subscription
        ((StreamingProxy)streamingService).setClient(client);
        streamingService.stream("My Movie");
        // Streaming content after subscribing
        client.setSubscribed(true);
        streamingService.stream("My Movie");
    }

}
