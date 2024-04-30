package proxy;

import java.util.ArrayList;
import java.util.List;

public class RealSongService implements SongService {
    private List<Song> songLibrary;

    public RealSongService() {
        songLibrary = new ArrayList<>();
        songLibrary.add(new Song("Ms. Jackson", "OutKast", "Stankonia", 300));
        songLibrary.add(new Song("Umbrella", "Rihanna", "Good Girl Gone Bad", 255));
        songLibrary.add(new Song("Viva La Vida", "Coldplay", "Viva la Vida or Death and All His Friends", 240));
        songLibrary.add(new Song("Poker Face", "Lady Gaga", "The Fame", 210));
        songLibrary.add(new Song("Gold Digger", "Kanye West", "Late Registration", 220));
        songLibrary.add(new Song("Venom", "Eminem", "Kamikaze", 270));
    }

    @Override
    public List<Song> searchByTitle(String title) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        List<Song> result = new ArrayList<>();
        for (Song song : songLibrary) {
            if (song.getTitle().equalsIgnoreCase(title)) {
                result.add(song);
            }
        }
        return result;
    }

    @Override
    public List<Song> searchByAlbum(String album) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        List<Song> result = new ArrayList<>();
        for (Song song : songLibrary) {
            if (song.getAlbum().equalsIgnoreCase(album)) {
                result.add(song);
            }
        }
        return result;
    }
}
