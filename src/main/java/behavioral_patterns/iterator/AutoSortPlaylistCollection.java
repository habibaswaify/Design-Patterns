package behavioral_patterns.iterator;

import java.util.Iterator;
import java.util.TreeSet;

public class AutoSortPlaylistCollection implements PlayListIterator{
    private final TreeSet<Song> songs;

    public AutoSortPlaylistCollection(TreeSet<Song> songs) {
        this.songs = songs;
    }
    @Override
    public Iterator<Song> createIterator(){
        return songs.iterator();
    }
       
    
}
