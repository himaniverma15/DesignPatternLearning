package AdapterDesignPattern;

public class Mp4MediaPlayer implements AdvanceMediaPlayer{
    @Override
    public void playVlc(String fileName) {
// do nothing
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing MP4 file: " + fileName);
    }
}
