package flyweight.music;

// Concrete Flyweight
public class Audio implements Music {

    private String file;

    public Audio(String file) {
        this.file = file;
        loadAudio();
    }

    private void loadAudio() {
        System.out.println("로드된 음원: " + file);
    }

    @Override
    public void play() {
        System.out.println("재생 중: " + file);
    }
}
