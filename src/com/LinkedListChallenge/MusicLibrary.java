package com.LinkedListChallenge;

import java.util.ArrayList;
import java.util.LinkedList;

public class MusicLibrary {
    private String name;
    private ArrayList<Album> albums;
    private LinkedList<Playlist> playLists;

    public MusicLibrary(String name) {
        this.name = name;
        this.albums = new ArrayList<Album>();
    }

    //    add song to album
    public boolean addSongToAlbum(String albumName, String title, double duration) {
        int i = doesAlbumExist(albumName);
        if(i != -1) {
            this.albums.get(i).addSong(title, duration);
            return true;
        }
        return false;
    }

    //    create playlist
    public boolean createPlaylist(String name) {
        System.out.println(name);
        if(doesPlaylistExist(name) != -1) {
            playLists.add(new Playlist(name));
            return true;
        }
        return false;
    }

    //    add song to playlist
    public boolean addSongToPlaylist(String albumName, String playlistName, String title, double duration) {
        System.out.println(albumName);
        int ia = doesAlbumExist(albumName);
        int ip = doesPlaylistExist(playlistName);
        if(ia != -1) {
            if(ip != -1) {
                this.playLists.get(ip).addSong(title, duration);
                return true;
            } else {
                System.out.println("The playlist you enter named " + playlistName + "does not exist.");
            }
        } else {
            System.out.println("The album you enter named " + albumName + "does not exist.");
        }
        return false;
    }

    //    get a playlist
    public LinkedList<Song> playPlaylist(String playlistName) {
        int i = doesPlaylistExist(name);
        if(i != -1) {
            return playLists.get(i).getSongList();
        }
        return null;
    }

    //    add album
    public boolean addAlbum(String name, String artistName, int releaseYear) {
        if(doesAlbumExist(name) != -1) {
            albums.add(new Album(name, artistName, releaseYear));
            return true;
        }
        return false;
    }

    //    remove album
    public boolean removeAlbum(String name) {
        int i = doesAlbumExist(name);
        if(i != -1) {
            albums.remove(albums.get(i));
            return true;
        }
        return false;
    }

    //    check if album has already been added
    private int doesAlbumExist(String name) {
        System.out.println(this.albums);
        for (int i=0; i<this.albums.size(); i++) {
            Album album = this.albums.get(i);
            if(album.getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    //    check if playlist has already been created
    private int doesPlaylistExist(String name) {
        if(this.playLists != null) {
            for (int i = 0; i < this.playLists.size(); i++) {
                Playlist playlist = this.playLists.get(i);
                if (playlist.getName().equals(name)) {
                    return i;
                }
            }
        }
        return -1;
    }
}
