
package creation_patterns.abstract_factory;

public interface SoundHandling {
    void setWAVHandling();
    void setMP3Handling();
    void setOGGHandling();
    String getSoundHandling();
    
}
