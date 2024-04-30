package proxy;

import java.util.List;

public interface SongService {
    List<Song> searchByTitle(String title);

    List<Song> searchByAlbum(String album);
}
