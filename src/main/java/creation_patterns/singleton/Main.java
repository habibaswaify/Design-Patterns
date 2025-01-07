package creation_patterns.singleton;

public class Main {
    public static void main(String[] args) {
        // Get the Singleton instance
        ConfigurationManager config = ConfigurationManager.getInstance();
        // Load settings from the instance
        config.loadSettings();
        // Print the theme setting
        System.out.println(config.getSetting("theme"));

        // Change the theme
        config.setSetting("theme", "dark");
        System.out.println(config.getSetting("theme"));

        // Validating the singleton pattern:
        ConfigurationManager configurationManager = ConfigurationManager.getInstance();
        System.out.println(configurationManager.equals(config));
    }
}
