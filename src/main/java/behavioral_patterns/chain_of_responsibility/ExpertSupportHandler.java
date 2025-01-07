package behavioral_patterns.chain_of_responsibility;

public class ExpertSupportHandler extends SupportHandler{
    @Override
    public void handleRequest(SupportRequest supportRequest) {
        if(supportRequest.getComplexityLevel() == 3){
            System.out.println("Expert Support handling: " + supportRequest.getDescription());
        } else {
            System.out.println("No handler for this request");

        }
    }
}