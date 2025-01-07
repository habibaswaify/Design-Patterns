package behavioral_patterns.iterator;

public class Song implements Comparable<Song>{
    private String title;
    private String artist;
    private String album;
    private int durationMins;

    public Song(String title, String artist, String album, int durationMins) {
        this.title = title;
        this.artist = artist;
        this.album = album;
        this.durationMins = durationMins;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public int getDurationMins() {
        return durationMins;
    }

    public void setDurationMins(int durationMins) {
        this.durationMins = durationMins;
    }

    @Override
    public int compareTo(Song otherSong) {
        return this.title.compareTo(otherSong.getTitle());
    }
    
    
    
    
}
