package flyweight.music;

import java.util.HashMap;
import java.util.Map;

// Flyweight Factory
public class MusicFactory {

    private Map<String, Music> musicPool;

    public MusicFactory() {
        musicPool = new HashMap<>();
    }

    public Music getMusic(String file) {
        Music music = musicPool.get(file);
        if (music == null) {
            music = new Audio(file);
            musicPool.put(file, music);
        }
        return music;
    }

}
