package creation_patterns.singleton;

import java.util.HashMap;
import java.util.Map;

public class ConfigurationManager {
    private static ConfigurationManager instance = null;
    private final Map<String,String> settings;

    public static ConfigurationManager getInstance() {
        if(instance == null) {
            instance = new  ConfigurationManager();
        }
        return instance;
    }
    private ConfigurationManager(){
        this.settings = new HashMap<>();
    }
    public void loadSettings(){
        this.settings.put("theme","bright");
        this.settings.put("language", "en");
        this.settings.put("font","times new roman");
    }

    public void setSetting(String key, String value) {
        this.settings.put(key,value);
    }
    public String getSetting(String key) {
        return this.settings.get(key);
    }
}
