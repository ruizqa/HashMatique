import java.util.HashMap;
import java.util.Set;

public class HashMatique{

    public HashMap<String, String> addFirstSong(String title, String lyrics){
        HashMap<String, String> trackList = new HashMap<String, String>();
        trackList.put(title,lyrics);
        return trackList;
    }

    public HashMap<String, String> addNewSong(HashMap<String, String> trackList, String title, String lyrics){
        trackList.put(title,lyrics);
        return trackList;
    }


    public String getSong(String title, HashMap<String, String> album){
        String lyrics = new String();
        lyrics = album.get(title);
        return lyrics;
    }

    public void getAll(HashMap<String, String> album){
        Set <String> songs= album.keySet();
        for (String song:songs){
            System.out.println(String.format("%1$s: %2$s",song,album.get(song)));
        }

    } 
}

