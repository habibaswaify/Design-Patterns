package behavioral_patterns.chain_of_responsibility;

public interface Chain {
    void setNextHandler(Chain nextInChain);

    void handleRequest(SupportRequest supportRequest);
}
