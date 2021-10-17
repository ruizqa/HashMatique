import java.util.HashMap;

public class HashMatiqueTest{

    public static void main(String args[]){
        HashMatique test = new HashMatique();
        HashMap<String,String> album = new HashMap<String,String> ();
        album = test.addFirstSong("Hello","HelloLyrics");
        album = test.addNewSong(album,"Second","SecondLyrics");
        album = test.addNewSong(album,"Third","ThirdLyrics");
        album = test.addNewSong(album,"Final","FinalLyrics");
        System.out.println(test.getSong("Second", album));
        test.getAll(album);
    }

}