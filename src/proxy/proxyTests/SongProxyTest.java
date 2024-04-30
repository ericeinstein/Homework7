package proxy.proxyTests;

import static org.junit.Assert.*;
import org.junit.Test;

import proxy.RealSongService;
import proxy.Song;
import proxy.SongProxy;

import java.util.List;

public class SongProxyTest {

    @Test
    public void testSearchByTitle() {
        RealSongService realSongService = new RealSongService();
        SongProxy songProxy = new SongProxy(realSongService);

        List<Song> songs = songProxy.searchByTitle("Viva La Vida");
        assertEquals(1, songs.size());
        assertEquals("Viva La Vida", songs.get(0).getTitle());
    }

    @Test
    public void testSearchByAlbum() {
        RealSongService realSongService = new RealSongService();
        SongProxy songProxy = new SongProxy(realSongService);

        List<Song> songs = songProxy.searchByAlbum("Stankonia");
        assertEquals(1, songs.size());
        assertEquals("Stankonia", songs.get(0).getAlbum());
    }
}
