package com.LinkedListChallenge;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        MusicLibrary myLibrary = new MusicLibrary("Daniel's Music Library");
        MusicLibrary herLibrary = new MusicLibrary("Grace's Music Library");

        myLibrary.addAlbum("Vista", "David Wilcox", 1990);
        myLibrary.addSongToAlbum("Vista", "Song 1", 3.05);
        myLibrary.addSongToAlbum("Vista", "Song 2", 4.05);
        myLibrary.addSongToAlbum("Vista", "Song 3", 3.00);
        myLibrary.addSongToAlbum("Vista", "Song 4", 2.58);
        myLibrary.addSongToAlbum("Vista", "Song 5", 4.10);

        myLibrary.addAlbum("TSwift", "Taylor Swift", 2008);
        myLibrary.addSongToAlbum("TSwift", "Song 6", 3.05);
        myLibrary.addSongToAlbum("TSwift", "Song 7", 4.05);
        myLibrary.addSongToAlbum("TSwift", "Song 8", 3.00);
        myLibrary.addSongToAlbum("TSwift", "Song 9", 2.58);
        myLibrary.addSongToAlbum("TSwift", "Song 10", 4.10);

        myLibrary.addAlbum("London", "The Beatles", 1980);
        myLibrary.addSongToAlbum("London", "Song 11", 3.05);
        myLibrary.addSongToAlbum("London", "Song 12", 4.05);
        myLibrary.addSongToAlbum("London", "Song 13", 3.00);
        myLibrary.addSongToAlbum("London", "Song 14", 2.58);
        myLibrary.addSongToAlbum("London", "Song 15", 4.10);

        herLibrary.addAlbum("Crazy", "Dove Cameron", 2013);
        herLibrary.addAlbum("Beautiful", "U2", 1971);
        herLibrary.addAlbum("This Feeling", "JT", 2017);

//        actionProgram(myLibrary);

    }

    private static void actionProgram(MusicLibrary musicLibrary) {
        actionList();
        Scanner scanner = new Scanner(System.in);
        String albumName;
        String artist;
        String title;
        String playlistName;
        double duration;
        boolean quit = false;
        while(!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.println("Enter an album name:\n");
                    albumName = scanner.nextLine();
                    System.out.println("Enter an artist name:\n");
                    artist = scanner.nextLine();
                    System.out.println("Enter a release year:\n");
                    int releaseYear = scanner.nextInt();
                    scanner.nextLine();
                    addAlbum(musicLibrary, albumName, artist, releaseYear);
                    break;
                case 2:
                    System.out.println("Enter an album name:\n");
                    albumName = scanner.nextLine();
                    System.out.println("Enter a song title:\n");
                    title = scanner.nextLine();
                    System.out.println("Enter the song duration (0.00 format):\n");
                    duration = scanner.nextDouble();
                    scanner.nextLine();
                    addSongToAlbum(musicLibrary, albumName, title, duration);
                    break;
                case 3:
                    System.out.println("Enter a playlist name:");
                    playlistName = scanner.nextLine();
                    createPlaylist(musicLibrary, playlistName);
                    break;
                case 4:
                    System.out.println("Enter an album name:\n");
                    albumName = scanner.nextLine();
                    System.out.println("Enter a playlist name:\n");
                    playlistName = scanner.nextLine();
                    System.out.println("Enter a song title:\n");
                    title = scanner.nextLine();
                    System.out.println("Enter the song duration (0.00 format):\n");
                    duration = scanner.nextDouble();
                    scanner.nextLine();
                    addSongToPlaylist(musicLibrary, albumName, playlistName, title, duration);
                    break;
                case 5:
                    System.out.println("Enter a playlist name:\n");
                    playlistName = scanner.nextLine();
                    playPlaylist(musicLibrary, playlistName);
                    break;
                case 6:
                    actionList();
                    break;
            }
        }

    }

    public static void playlistProgram(LinkedList<Song> playlist) {
        playlistActionList();
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true;
        ListIterator<Song> listIterator = playlist.listIterator();

        while(!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    if(playlist.isEmpty()) {
                        System.out.println("No songs in this playlist. Exiting playlist program.");
                        quit = true;
                    } else {
                        System.out.println("Now playing " + listIterator.next());
                        playlistActionList();
                    }
                    break;
                case 2:
                    if(!goingForward) {
                        if(listIterator.hasNext()) {
                            listIterator.next();
                        }
                        goingForward = true;
                    }
                    if(listIterator.hasNext()) {
                        System.out.println("Now playing " + listIterator.next());
                    } else {
                        System.out.println("Reached the end of the playlist");
                        goingForward = false;
                    }
                    break;
                case 3:
                    if(goingForward) {
                        if(listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        goingForward = false;
                    }
                    if(listIterator.hasPrevious()) {
                        System.out.println("Now playing " + listIterator.previous());
                    } else {
                        System.out.println("We are at the start of the playlist");
                        goingForward = true;
                    }
                    break;
                case 4:
                    playlistActionList();
                    break;
            }
        }
    }

    private static void addAlbum(MusicLibrary musicLibrary, String albumName, String artistName, int releaseYear) {
        musicLibrary.addAlbum(albumName, artistName, releaseYear);
    }

    private static void addSongToAlbum(MusicLibrary musicLibrary, String albumName, String title, double duration) {
        musicLibrary.addSongToAlbum(albumName, title, duration);
    }

    private static void createPlaylist(MusicLibrary musicLibrary, String playlistName) {
        musicLibrary.createPlaylist(playlistName);
    }

    private static void addSongToPlaylist(MusicLibrary musicLibrary, String albumName, String playlistName, String title, double duration) {
        musicLibrary.addSongToPlaylist(albumName, playlistName, title, duration);
    }

    private static void playPlaylist(MusicLibrary musicLibrary, String playlistName) {
        LinkedList<Song> playlist = musicLibrary.playPlaylist(playlistName);
        playlistProgram(playlist);
    }

    private static void actionList() {
        System.out.println("Please choose from the following actions:\npress");
        System.out.println("0 - quit\n"
                + "1 - add album\n"
                + "2 - add song to album\n"
                + "3 - add playlist\n"
                + "4 - add song to playlist (song must be add to an album before it can be added to a playlist)\n"
                + "5 - play playlist\n"
                + "6 - show actions");
    }

    private static void playlistActionList() {
        System.out.println("Please choose from the following actions:\npress");
        System.out.println("0 - quit\n"
                + "1 - play current song\n"
                + "2 - play next song\n"
                + "3 - play previous\n"
                + "4 - show actions");
    }

}
