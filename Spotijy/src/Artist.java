public class Artist {

    private String  firstName;
    private String  lastName;
    private int  birthYear;
    private Album[] albums;
    private Song[] singles;

    public String getFirstName(){
        return this.firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public Album[] getAlbums() {
        return albums;
    }

    public Song[] getSingles() {
        return singles;
    }


    Song mostLikedSong(){
        Song mostLiked = null;

        for (int i = 1; i <albums.length ; i++) {
            if(albums[i].sortByPopularity(false)[0].getLikes() > albums[i-1].sortByPopularity(false)[0].getLikes()){
                mostLiked = albums[i].sortByPopularity(false)[0];
            }
        }

        for (int i = 1; i <singles.length ; i++) {
            if(singles[i].getLikes() > mostLiked.getLikes()){
                mostLiked= singles[i];
            }
        }


        return mostLiked;
    }
    Song leastLikedSong(){
        Song leastLiked = null;
        for (int i = 1; i <albums.length ; i++) {
            if(albums[i].sortByPopularity(false)[0].getLikes() < albums[i-1].sortByPopularity(false)[0].getLikes()){
                leastLiked = albums[i].sortByPopularity(false)[0];
            }
        }

        for (int i = 1; i <singles.length ; i++) {
            if(singles[i].getLikes() < leastLiked.getLikes()){
                leastLiked= singles[i];
            }
        }
        return leastLiked;
    }
    int totalLikes(){
        int total = 0;

        for (int i = 0; i <albums.length ; i++) {
            for (int j = 0; j <albums[i].getSongs().length; j++) {
                total += albums[i].getSongs()[j].getLikes();
            }
        }
        for (int i = 0; i <singles.length ; i++) {
            total += singles[i].getLikes();
        }


        return total;
    }

    boolean isEqual(Artist other){
        if(this.firstName.equals(other.getFirstName()) && this.lastName.equals(other.firstName) && this.birthYear == other.getBirthYear()){
            return true;
        }
        return false;
    }

    public String toString(){
        return "Name" + this.firstName + " " + this.lastName + ", Birth Year" + this.birthYear + ", Total Likes " + this.totalLikes();
    }













}
