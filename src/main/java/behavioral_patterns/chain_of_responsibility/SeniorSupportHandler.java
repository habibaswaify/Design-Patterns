package behavioral_patterns.chain_of_responsibility;

public class SeniorSupportHandler extends SupportHandler{
    @Override
    public void handleRequest(SupportRequest supportRequest) {
        if(supportRequest.getComplexityLevel() == 2){
            System.out.println("Senior Support handling: " + supportRequest.getDescription());
        } else if (this.getNextInChain() != null) {
            System.out.println("Senior Support could not handle: " + supportRequest.getDescription());
            this.getNextInChain().handleRequest(supportRequest);

        }
    }
}