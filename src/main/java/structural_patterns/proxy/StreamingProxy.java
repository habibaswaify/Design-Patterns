package structural_patterns.proxy;

public class StreamingProxy implements StreamingService {
    private final RealStreamingService realStreamingService = new RealStreamingService();
    private Client client;
    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    @Override
    public void stream(String content) {
        if(!client.isSubscribed()){
            System.out.println("You have to subscribe to access our service.");
        }
        else {
            realStreamingService.stream(content);
        }
    }
}
