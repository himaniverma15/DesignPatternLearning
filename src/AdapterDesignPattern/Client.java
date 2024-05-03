package AdapterDesignPattern;

public class Client {
    public static void main(String[] args) {
        MediaPayer mediaPayer = new MediaAdapter("MP4");
        mediaPayer.play("MP4","my.mp4");
    }
}
