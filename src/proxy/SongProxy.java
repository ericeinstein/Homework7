package proxy;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SongProxy implements SongService {
    private RealSongService realSongService;
    private Map<String, List<Song>> cache;

    public SongProxy(RealSongService realSongService) {
        this.realSongService = realSongService;
        this.cache = new HashMap<>();
    }

    @Override
    public List<Song> searchByTitle(String title) {
        if (cache.containsKey(title)) {
            System.out.println("Retrieving '" + title + "' from cache...");
            return cache.get(title);
        }
        List<Song> result = realSongService.searchByTitle(title);
        cache.put(title, result);
        return result;
    }

    @Override
    public List<Song> searchByAlbum(String album) {
        if (cache.containsKey(album)) {
            System.out.println("Retrieving songs from album '" + album + "' from cache...");
            return cache.get(album);
        }
        List<Song> result = realSongService.searchByAlbum(album);
        cache.put(album, result);
        return result;
    }
}
