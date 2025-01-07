package behavioral_patterns.iterator;

import java.util.Arrays;
import java.util.Iterator;

public class SmallPlayListCollection implements PlayListIterator{
    private final Song[] songs;
    public SmallPlayListCollection(Song[] songs){
        this.songs = songs;
    }
    @Override
    public Iterator<Song> createIterator(){
        return Arrays.asList(songs).iterator();
    }
    
}
