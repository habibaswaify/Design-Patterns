package behavioral_patterns.chain_of_responsibility;

public abstract class SupportHandler implements Chain {
    private Chain nextInChain;

    public Chain getNextInChain() {
        return nextInChain;
    }

    @Override
    public void setNextHandler(Chain nextInChain) {
        this.nextInChain = nextInChain;
    }

    @Override
    public abstract void handleRequest(SupportRequest supportRequest);
}
