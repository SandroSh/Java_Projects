import java.util.Date;

public class Song {
    private String title;
    private int releaseYear;
    private int duration;
    private int likes;













    public Song(String title, int releaseYear) {
        this.title = title;
        this.releaseYear = releaseYear;
    }
    public Song(String title, int releaseYear, int duration) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.duration = duration;
    }
    public Song(String title, int releaseYear, int duration, int likes) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.duration = duration;
        this.likes = likes;
    }



    boolean changeDuration(int duration){
        if(this.duration == duration || duration > 720 || duration <0 ){
            return  false;
        }
        this.duration = duration;
        return true;
    }
    public void like(){
        this.likes ++;
    }
    public void  unLike(){
        if(this.likes >0){
            this.likes--;
        }

    }

    public String getTitle() {
        return title;
    }
    public int getReleaseYear() {return releaseYear;
    }
    public int getDuration() {return duration;
    }
    public int getLikes() {return likes;
    }
    public void setTitle(String title) {this.title = title;
    }
    public void setReleaseYear(int releaseYear) {this.releaseYear = releaseYear;
    }
    public void setDuration(int duration) {this.duration = duration;
    }
    public void setLikes(int likes) {this.likes = likes;
    }

    public boolean isEqual(Song song2){
        if(this.title.equals(song2.getTitle()) && this.releaseYear == song2.getReleaseYear() && this.duration == song2.getDuration()){
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "title:'" + title + '\'' +
                ",releaseYear:" + releaseYear +
                ",duration:" + duration/60 + " minutes" +
                ",likes:" + likes;
    }
}
