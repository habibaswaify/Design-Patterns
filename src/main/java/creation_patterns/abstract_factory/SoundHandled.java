
package creation_patterns.abstract_factory;

public class SoundHandled implements SoundHandling{
    String soundFormat;
    @Override
    public void setWAVHandling() {
        soundFormat = ".wav";
    }

    @Override
    public void setMP3Handling() {
        soundFormat = ".mp3";
    }

    @Override
    public void setOGGHandling() {
        soundFormat = ".ogg";
    }

    @Override
    public String getSoundHandling() {
        return soundFormat;
    }
    
    
}
