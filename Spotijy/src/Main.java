public class Main {
    public static void main(String[] args) {

        Song starMan = new Song("bStar Man",1990,350,100000);
        Song starMan2 = new Song("cRapshody",2023,550,105320);
        Song song2 = new Song("dMdevari",2020,350,103400);
        Song song3 = new Song("aModas",2000,450,23000);



        Album newAlbum = new Album("album", 2000, new Song[]{});
        newAlbum.addSongs(new Song[]{starMan2, starMan, song2, song3});
//        newAlbum.shuffle();

        System.out.println("a".compareTo("b"));




    }
}