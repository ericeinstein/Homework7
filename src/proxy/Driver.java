package proxy;

import java.util.List;

public class Driver {
    public static void main(String[] args) {
        // Initialize real song service and create proxy
        RealSongService realSongService = new RealSongService();
        SongProxy songProxy = new SongProxy(realSongService);

        // Test search functionality
        System.out.println("Searching for songs by title:");
        List<Song> songsByTitle = songProxy.searchByTitle("Umbrella");
        printSongs(songsByTitle);

        System.out.println("\nSearching for songs by album:");
        List<Song> songsByAlbum = songProxy.searchByAlbum("The Fame");
        printSongs(songsByAlbum);

        System.out.println("\nSearching for songs by title:");
        List<Song> songsByTitle2 = songProxy.searchByTitle("Gold Digger");
        printSongs(songsByTitle2);

        System.out.println("\nSearching for songs by album:");
        List<Song> songsByAlbum2 = songProxy.searchByAlbum("Stankonia");
        printSongs(songsByAlbum2);

        System.out.println("\nSearching for songs by album:");
        List<Song> songsByAlbum3 = songProxy.searchByAlbum("Kamikaze");
        printSongs(songsByAlbum3);
    }

    private static void printSongs(List<Song> songs) {
        if (songs.isEmpty()) {
            System.out.println("No songs found.");
        } else {
            for (Song song : songs) {
                System.out.println(song.getTitle() + " - " + song.getArtist() +
                        " (" + song.getAlbum() + ") [" + song.getDuration() + "s]");
            }
        }
    }
}
