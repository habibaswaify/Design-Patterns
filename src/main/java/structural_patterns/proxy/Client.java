package structural_patterns.proxy;

public class Client {
    private boolean isSubscribed;

    public Client(boolean isSubscribed) {
        this.isSubscribed = isSubscribed;
    }

    public boolean isSubscribed() {
        return isSubscribed;
    }

    public void setSubscribed(boolean subscribed) {
        isSubscribed = subscribed;
    }
}
