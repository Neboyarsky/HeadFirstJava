package Ch4ObjectsBehave;

public class Song {
    private String title;
    private String artist;

    public void play() {
        System.out.println("Playing " + getTitle() + " by " + getArtist());
    }

    public void playTimes(Song song, int times) {
        int i = 0;
        while (i < times) {
            song.play();
            i++;
        }
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }
}
