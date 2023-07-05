package proxy.image;

// Real Subject
public class RealImage implements Image {

    private String filename;

    public RealImage(String filename) {
        this.filename = filename;
        loadFromDisk();
    }

    private void loadFromDisk() {
        System.out.println("로드된 이미지: " + filename);
    }

    @Override
    public void display() {
        System.out.println("이미지 출력: " + filename);
    }
}
