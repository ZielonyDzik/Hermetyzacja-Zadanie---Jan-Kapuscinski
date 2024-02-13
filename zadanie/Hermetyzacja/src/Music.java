public class Music {
    public String musicTitle;
    public String musicAuthor;
    public double songDuration;
    public String dayNameOfPlay;
    public String hourOfPlay;
    public String musicType;
    public int priceForSong;
    public int defaultVolume;


    public Music(String musicTitle, String musicAuthor, double songDuration, String dayNameOfPlay, String hourOfPlay, String musicType, int priceForSong, int defaultVolume) {
        this.musicTitle = musicTitle;
        this.musicAuthor = musicAuthor;
        this.songDuration = songDuration;
        this.dayNameOfPlay = dayNameOfPlay;
        this.hourOfPlay = hourOfPlay;
        this.musicType = musicType;
        this.priceForSong = priceForSong;
        this.defaultVolume = defaultVolume;
    }

    public String getMusicTitle() {

        return musicTitle;
    }

    public void setMusicTitle(String musicTitle) {
        this.musicTitle = musicTitle;
    }

    public String getMusicAuthor() {
        return musicAuthor;
    }

    public void setMusicAuthor(String musicAuthor) {
        this.musicAuthor = musicAuthor;
    }

    public double getSongDuration() {
        return songDuration;
    }

    public void setSongDuration(double songDuration) {
        this.songDuration = songDuration;
    }

    public String getDayNameOfPlay() {
        return dayNameOfPlay;
    }

    public void setDayNameOfPlay(String dayNameOfPlay) {
        this.dayNameOfPlay = dayNameOfPlay;
    }

    public String getHourOfPlay() {
        return hourOfPlay;
    }

    public void setHourOfPlay(String hourOfPlay) {
        this.hourOfPlay = hourOfPlay;
    }

    public String getMusicType() {
        return musicType;
    }

    public void setMusicType(String musicType) {
        this.musicType = musicType;
    }

    public int getPriceForSong() {
        return priceForSong;
    }

    public void setPriceForSong(int priceForSong) {
        this.priceForSong = priceForSong;
    }

    public int getDefaultVolume() {
        return defaultVolume;
    }

    public void setDefaultVolume(int defaultVolume) {
        this.defaultVolume = defaultVolume;
    }

    /********************************************************
     * nazwa funkcji: getMusicInfo
     * parametry wejściowe: -
     * wartość zwracana: Opis piosenki lecącej w banku [w konsoli]
     * autor: Jan Kapuściński
     * ****************************************************/
    public void getMusicInfo(){
        System.out.println("Music Title: " + musicTitle + "\n" +
                "Music Author: " + musicAuthor + "\n" +
                "Song Duration: " + songDuration + "\n" +
                "Day when playing: " + dayNameOfPlay);
        System.out.println("Hour when playing: " + hourOfPlay + "\n" +
                "Music Type: " + musicType + "\n" +
                "Price for song: " + priceForSong + "$\n" +
                "Default Volume: " + defaultVolume + "%\n");
    }
}