package com.company.InnerClass.Challenge;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Album {
    private String name;
    private String artist;
    private SongList songs;

    //constructor
    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs=new SongList();
    }

    public boolean addSong(String songTitle, double songDuration){
        Song newSong= new Song(songTitle,songDuration);
      return this.songs.add(newSong);
    }

    public Song findSong(String songTitle){
      return this.songs.findSong(songTitle);
    }


        public boolean addToPlayList(int trackNumber, LinkedList<Song> playList) {
        Song foundSong=this.songs.findSong(trackNumber);
        if (foundSong!=null){
            playList.add(foundSong);
            return true;
        }
        return false;
        }

        public boolean addToPlayList(String songTitle, LinkedList<Song> playList) {
            Song foundSong = this.songs.findSong(songTitle);
            if (foundSong != null) {
                playList.add(foundSong);
                System.out.println("Song number " + songTitle + "of the album " + this.name + " has been added to playlist");
                return true;
            }

            System.out.println("Song number " + songTitle + "couldn't be found in the album " + this.name);
            return false;
        }



    //inner class
    private class SongList {
        private List<Song> songs;
        public SongList() {
            this.songs= new ArrayList<Song>();
        }

        public boolean add(Song song) {
            if (findSong(song.getTitle()) != null) {
                System.out.println("song " + song.getTitle() + " already exists");
                return false;
            }
            System.out.println("song " + song.getTitle() + " added");
            return true;
        }
        private Song findSong(String songTitle) {
            for (int i = 0; i <= this.songs.size(); i++) {
                if (this.songs.get(i).equals(songTitle)) {
                    return this.songs.get(i);
                }
            }
            return null;
        }
        private Song findSong(int trackNumber) {
            if (trackNumber >= 0 && trackNumber < this.songs.size()) {

                return this.songs.get(trackNumber);
            }
            return null;
        }
    }
    }

