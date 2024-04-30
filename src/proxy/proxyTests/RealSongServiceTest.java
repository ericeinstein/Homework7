package proxy.proxyTests;

import static org.junit.Assert.*;
import org.junit.Test;

import proxy.RealSongService;
import proxy.Song;

import java.util.List;

public class RealSongServiceTest {

    @Test
    public void testSearchByTitle() {
        RealSongService realSongService = new RealSongService();
        List<Song> songs = realSongService.searchByTitle("Umbrella");
        assertEquals(1, songs.size());
        assertEquals("Umbrella", songs.get(0).getTitle());
    }

    @Test
    public void testSearchByAlbum() {
        RealSongService realSongService = new RealSongService();
        List<Song> songs = realSongService.searchByAlbum("Late Registration");
        assertEquals(1, songs.size());
        assertEquals("Late Registration", songs.get(0).getAlbum());
    }
}
