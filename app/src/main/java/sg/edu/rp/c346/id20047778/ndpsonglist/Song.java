package sg.edu.rp.c346.id20047778.ndpsonglist;


import java.io.Serializable;

public class Song implements Serializable {

    private int id;
    private String songContent;

    public Song(int id, String songContent) {
        this.id = id;
        this.songContent = songContent;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSongContent() {
        return songContent;
    }

    public void setSongContent(String songContent) {
        this.songContent = songContent;
    }

    @Override
    public String toString() {
        return "ID:" + id + ", " + songContent;
    }

}
