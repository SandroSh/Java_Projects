import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class Album {
    private  String title;
    private int relaseYear;

    private Song[] songs= new Song[0];

    public Album(String title, int relaseYear, Song[] songs){
        this.title = title;
        this.relaseYear = relaseYear;
        this.songs = songs;
    }




    public Song[] sortByTitle(boolean isAscending){
        Song[] copyOfSongs = new Song[songs.length];
        for (int i = 0; i <copyOfSongs.length ; i++) {
            copyOfSongs[i] = songs[i];
        }

        for (int outer = 0; outer <copyOfSongs.length ; outer++) {
            for (int inner = outer + 1; inner <copyOfSongs.length ; inner++) {
                if(copyOfSongs[outer].getTitle().compareTo(copyOfSongs[inner].getTitle()) > 0){
                    Song temp = copyOfSongs[outer];
                    copyOfSongs[outer] = copyOfSongs[inner];
                    copyOfSongs[inner] = temp;
                }
            }
        }

        if(isAscending){
            return copyOfSongs;
        }
        return reverse(copyOfSongs);
    }
    public Song[] sortByDuration(boolean isAscending){
        Song[] copyOfSongs = new Song[songs.length];
        for (int i = 0; i <copyOfSongs.length ; i++) {
            copyOfSongs[i] = songs[i];
        }

        for (int outer = 0; outer <copyOfSongs.length ; outer++) {
            for (int inner = outer + 1; inner <copyOfSongs.length ; inner++) {
                if(copyOfSongs[outer].getDuration() > copyOfSongs[inner].getDuration()){
                    Song temp = copyOfSongs[outer];
                    copyOfSongs[outer] = copyOfSongs[inner];
                    copyOfSongs[inner] = temp;
                }
            }
        }


        if(isAscending) return copyOfSongs;
        return reverse(copyOfSongs);
    }
    public Song[] sortByReleaseYear(boolean isAscending){
        Song[] copyOfSongs = new Song[songs.length];
        for (int i = 0; i <copyOfSongs.length ; i++) {
            copyOfSongs[i] = songs[i];
        }

        for (int outer = 0; outer <copyOfSongs.length ; outer++) {
            for (int inner = outer + 1; inner <copyOfSongs.length ; inner++) {
                if(copyOfSongs[outer].getReleaseYear() > copyOfSongs[inner].getReleaseYear()){
                    Song temp = copyOfSongs[outer];
                    copyOfSongs[outer] = copyOfSongs[inner];
                    copyOfSongs[inner] = temp;
                }
            }
        }


        if(isAscending) return copyOfSongs;
        return reverse(copyOfSongs);
    }
    public Song[] sortByPopularity(boolean isAscending){
        Song[] copyOfSongs = new Song[songs.length];
        for (int i = 0; i <copyOfSongs.length ; i++) {
            copyOfSongs[i] = songs[i];
        }

        for (int outer = 0; outer <copyOfSongs.length ; outer++) {
            for (int inner = outer + 1; inner <copyOfSongs.length ; inner++) {
                if(copyOfSongs[outer].getLikes() > copyOfSongs[inner].getLikes()){
                    Song temp = copyOfSongs[outer];
                    copyOfSongs[outer] = copyOfSongs[inner];
                    copyOfSongs[inner] = temp;
                }
            }
        }


        if(isAscending) return copyOfSongs;
        return reverse(copyOfSongs);
    }

    public int totalLikes(){
        int likes = 0;
        for (int i = 0; i <songs.length ; i++) {
            likes += songs[i].getLikes();
        }
        return  likes;
    }


    public Song[] reverse(Song[] songs){
        Song[] reversedArr = new Song[songs.length];
        for (int i = 0, k = songs.length-1; i <songs.length ; i++, k--) {
            reversedArr[i] = songs[k];
        }
        return reversedArr;
    }
    public Song[] shuffle(){
        Random randomNum = new Random();
        Song[] shuffledSongs = this.songs;

        for (int i = 0; i <songs.length; i++) {
            int swapIndex = randomNum.nextInt(songs.length);
            Song tempVariable = shuffledSongs[swapIndex];
            shuffledSongs[swapIndex] = shuffledSongs[i];
            shuffledSongs[i] = tempVariable;
        }
        for (Song shuffledSong : shuffledSongs) {
            System.out.println(shuffledSong.toString());
        }
        return  shuffledSongs;
    }
    public int addSongs(Song[] inputedSongs){
        int counter = 0;
        int secondCounter = 0;
        if(songs.length == 0){
            songs = Arrays.copyOf(songs, songs.length +1);
            songs[songs.length-1] = inputedSongs[0];
            counter++;
        }
        for (Song inputedSong : inputedSongs) {
            for (Song song : songs) {
                if (song.isEqual(inputedSong)) {
                    break;
                }
                secondCounter++;
            }
            if (secondCounter == songs.length) {
                songs = Arrays.copyOf(songs, songs.length + 1);
                songs[songs.length - 1] = inputedSong;
                counter++;

            }
            secondCounter = 0;
        }
        return counter;
    }
    public String getTitle() {
        return title;
    }

    public int getRelaseYear() {
        return relaseYear;
    }

    public Song[] getSongs() {
        return songs;
    }

    public void printSongsArr(){
        for (int i = 0; i < songs.length ; i++) {
            System.out.println(songs[i].toString());
        }
    }
}
