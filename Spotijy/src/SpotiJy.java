import java.util.Arrays;

public class SpotiJy {
    private Artist[] artists;

    public SpotiJy(){
        this.artists = new Artist[0];
    }

    public Artist[] getArtists() {
        return artists;
    }

    void addArtists(Artist[] artists2){
        int counter = 0;
        for (int i = 0; i < artists2.length ; i++) {
            for (int j = 0; j < artists.length ; j++) {
                if(artists[j].isEqual(artists2[i])){
                    counter++;
                }
            }
            if(counter == 0){
                artists = Arrays.copyOf(artists, artists.length +1);
                artists[artists.length-1] = artists2[i];
            }
            counter = 0;
        }
    }
    String [] getTopTrendingArtist(){
        Artist top  = artists[1];
        for (int i = 0; i < artists.length ; i++) {
            if(artists[i-1].totalLikes() > artists[i].totalLikes()){
                top = artists[i-1];
            }

        }


        return new String[]{top.getFirstName(), top.getLastName()};
    }
    String getTopTrendingAlbum(){
        Album top = artists[0].getAlbums()[1];
        for (int i = 0; i <artists.length; i++) {
            for (int j = 1; j <artists[i].getAlbums().length ; j++) {
                if(artists[i].getAlbums()[j-1].totalLikes() > artists[i].getAlbums()[j].totalLikes()){
                        top = artists[i].getAlbums()[j-1];
                }
            }
        }
        return top.getTitle();
    }
    String getTopTrendingSong(){
        Song top = artists[1].mostLikedSong();
        for (int j = 1; j <artists.length ; j++) {
            if(artists[j-1].mostLikedSong().getLikes() > artists[j].mostLikedSong().getLikes()){
                top = artists[j-1].mostLikedSong();
            }
        }
        return top.getTitle();
    }
}
