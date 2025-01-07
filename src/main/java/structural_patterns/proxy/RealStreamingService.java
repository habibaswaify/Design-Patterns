package structural_patterns.proxy;

public class RealStreamingService implements StreamingService{
    @Override
    public void stream(String content) {
        System.out.println("Streaming: "+content);
    }
}
