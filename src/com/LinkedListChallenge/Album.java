package com.LinkedListChallenge;

import java.util.ArrayList;

public class Album {
    private String name;
    private String artistName;
    private int releaseYear;
    private ArrayList<Song> songList;

    public Album(String name, String artistName, int releaseYear) {
        this.name = name;
        this.artistName = artistName;
        this.releaseYear = releaseYear;
        this.songList = new ArrayList<Song>();
    }

//    add song to album
    public boolean addSong(String title, double duration) {
        if(doesSongExist(title) == null) {
            songList.add(new Song(title, duration));
            return true;
        }
        return false;
    }

//    remove song from album
    public boolean removeSong(String title) {
        Song song = doesSongExist(title);
        if(song != null) {
            songList.remove(songList.get(i));
            return true;
        }
        return false;
    }

//    check if song has already been added
    private Song doesSongExist(String title) {
        for (Song checkedSong: this.songList) {
            if(checkedSong.getTitle().equals(title)) {
                return checkedSong;
            }
        }
        return null;
    }

    public String getName() {
        return name;
    }

}
