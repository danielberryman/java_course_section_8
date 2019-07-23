package com.LinkedListChallenge;

import java.util.LinkedList;

public class Playlist {
    private String name;
    private LinkedList<Song> songList;

    public Playlist(String name) {
        this.name = name;
        this.songList = new LinkedList<Song>();
    }

    public void addSong(String title, double duration) {
        songList.add(new Song(title, duration));
    }

    public void listSongs() {
        for (int i=0; i<songList.size(); i++) {
            Song song = songList.get(i);
            System.out.println((i+1) + ". " + song.getTitle() + " - " + song.getDuration());
        }
    }

    public String getName() {
        return name;
    }

    public LinkedList<Song> getSongList() {
        return songList;
    }
}
