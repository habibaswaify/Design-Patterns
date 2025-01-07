package structural_patterns.facade;

public class Main {
    public static void main(String[] args) {
        // Create an instance of the facade
        SmartHomeFacade smartHomeFacade = new SmartHomeFacade();
        // Apply settings
        System.out.println("Applying settings...");
        smartHomeFacade.prepareHome(18,60);
        // Reset settings
        System.out.println("Resetting...");
        smartHomeFacade.reset();
    }
}
