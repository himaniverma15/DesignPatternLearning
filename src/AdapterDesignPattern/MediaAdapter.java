package AdapterDesignPattern;

public class MediaAdapter implements MediaPayer {

    AdvanceMediaPlayer advanceMediaPlayer;

    public MediaAdapter(String mediaType) {
        if (mediaType.equalsIgnoreCase("MP4")) {
            advanceMediaPlayer = new Mp4MediaPlayer();
        } else if (mediaType.equalsIgnoreCase("VLC")) {
            advanceMediaPlayer = new VlcMediaPlayer();
        }
    }

    @Override
    public void play(String type, String filename) {
        if (type.equalsIgnoreCase("MP4")) {
            advanceMediaPlayer.playMp4(filename);
        } else if (type.equalsIgnoreCase("VLC")) {
            advanceMediaPlayer.playVlc(filename);
        }
    }
}
