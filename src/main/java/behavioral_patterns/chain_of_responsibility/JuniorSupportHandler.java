package behavioral_patterns.chain_of_responsibility;

public class JuniorSupportHandler extends SupportHandler{
    @Override
    public void handleRequest(SupportRequest supportRequest) {
        if(supportRequest.getComplexityLevel() == 1){
            System.out.println("Junior Support handling: " + supportRequest.getDescription());
        } else if (this.getNextInChain() != null) {
            System.out.println("Junior Support could not handle: " + supportRequest.getDescription());
            this.getNextInChain().handleRequest(supportRequest);

        }
    }
}
