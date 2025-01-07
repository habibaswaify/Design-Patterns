package behavioral_patterns.iterator;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        // Array of songs for small playlist
        Song[] songs = {
                new Song("Bohemian Rhapsody", "Queen", "The Greatest Hits", 6),
                new Song("Imagine", "John Lennon", "Imagine", 1),
                new Song("Stairway to Heaven", "Led Zeppelin", "Led Zeppelin IV", 1),
                new Song("Hotel California", "Eagles", "Hotel California", 1),
                new Song("Smells Like Teen Spirit", "Nirvana", "Nevermind", 1),
                new Song("Billie Jean", "Michael Jackson", "Thriller", 2),
                new Song("Like a Rolling Stone", "Bob Dylan", "Highway 61 Revisited", 1),
                new Song("Hey Jude", "The Beatles", "Hey Jude", 1),

        };

        // LinkedList for large playlist
        LinkedList<Song> songsLL = new LinkedList<>();
        songsLL.add(new Song("Blinding Lights", "The Weeknd", "After Hours", 1));
        songsLL.add(new Song("Shape of You", "Ed Sheeran", "÷ (Divide)", 4));
        songsLL.add(new Song("Rolling in the Deep", "Adele", "21", 3));
        songsLL.add(new Song("Uptown Funk", "Mark Ronson ft. Bruno Mars", "Uptown Special", 1));
        songsLL.add(new Song("Lose Yourself", "Eminem", "8 Mile Soundtrack", 1));
        songsLL.add(new Song("Perfect", "Ed Sheeran", "÷ (Divide)", 12));
        songsLL.add(new Song("Bad Guy", "Billie Eilish", "When We All Fall Asleep, Where Do We Go?", 1));
        songsLL.add(new Song("Someone Like You", "Adele", "21", 2));
        songsLL.add(new Song("Let It Be", "The Beatles", "Let It Be", 1));
        songsLL.add(new Song("Purple Haze", "Jimi Hendrix", "Are You Experienced", 1));
        songsLL.add(new Song("Take On Me", "a-ha", "Hunting High and Low", 1));

        // TreeSet for auto-sorting playlist
        TreeSet<Song> songsTS = new TreeSet<>();
        songsTS.add(new Song("Africa", "Toto", "Toto IV", 5));
        songsTS.add(new Song("Bohemian Rhapsody", "Queen", "A Night at the Opera", 11));
        songsTS.add(new Song("Billie Jean", "Michael Jackson", "Thriller", 3));
        songsTS.add(new Song("Back in Black", "AC/DC", "Back in Black", 1));
        songsTS.add(new Song("Don't Stop Believin'", "Journey", "Escape", 8));
        songsTS.add(new Song("Let It Be", "The Beatles", "Let It Be", 1));
        songsTS.add(new Song("Hotel California", "Eagles", "Hotel California", 1));
        songsTS.add(new Song("Sweet Child O' Mine", "Guns N' Roses", "Appetite for Destruction", 1));
        songsTS.add(new Song("Shape of You", "Ed Sheeran", "Divide", 4));
        songsTS.add(new Song("Rolling in the Deep", "Adele", "21", 1));

        // Creating collections for each playlist type
        SmallPlayListCollection smallPlayListCollection = new SmallPlayListCollection(songs);
        LargePlayLists largePlayLists = new LargePlayLists(songsLL);
        AutoSortPlaylistCollection autoSortPlaylistCollection = new AutoSortPlaylistCollection(songsTS);

        // Creating iterators for each playlist collection
        Iterator<Song> smallPlaylistIterator = smallPlayListCollection.createIterator();
        Iterator<Song> largePlaylistIterator = largePlayLists.createIterator();
        Iterator<Song> autoSortPlaylistIterator = autoSortPlaylistCollection.createIterator();

        // Displaying each playlist using its corresponding iterator
        System.out.println("Small Playlist:");
        while (smallPlaylistIterator.hasNext()) {
            System.out.println(smallPlaylistIterator.next().getTitle());
        }
        System.out.println("\nLarge Playlist:");
        while (largePlaylistIterator.hasNext()) {
            System.out.println(largePlaylistIterator.next().getTitle());
        }
        System.out.println("\nAuto-Sort Playlist:");
        while (autoSortPlaylistIterator.hasNext()) {
            System.out.println(autoSortPlaylistIterator.next().getTitle());
        }
    }
}
