package behavioral_patterns.iterator;

import java.util.Iterator;
import java.util.LinkedList;

public class LargePlayLists implements PlayListIterator{
    private final LinkedList<Song> songs;

    public LargePlayLists(LinkedList<Song> songs) {
        this.songs = songs;
    }
    @Override
    public Iterator<Song> createIterator(){
        return songs.iterator();
    }
    
}
