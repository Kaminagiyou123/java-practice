package com.company.Interface.LinkedListChallenge;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs=new ArrayList<Song>();
    }

    public boolean addSong(String songTitle, double songDuration){
        Song newSong= new Song(songTitle,songDuration);
        if (findSong(songTitle)==null){
            this.songs.add(newSong);
            System.out.println("new song "+songTitle +"is added to album "+this.name);
            return true;
        }
        System.out.println("new song "+songTitle +"is already in album "+this.name);
        return false;
    }
    private Song findSong(String songTitle){
        for (int i=0;i<this.songs.size();i++){
            if (this.songs.get(i).getTitle().equals(songTitle)){
                return this.songs.get(i);
            }
        } return null;
    }

    List<Song> playList=new ArrayList<Song>();
    public  boolean addToPlayList(int trackNumber, LinkedList<Song> playList){
        if (trackNumber>=this.songs.size()||trackNumber<0){
            System.out.println("Tracknumber "+trackNumber+ " is out of range");
            return false;
        }
        Song foundSong=this.songs.get(trackNumber);

            playList.add(foundSong);
            System.out.println("Song number "+trackNumber+ " of the album "+ this.name+" has been added to playlist");
            return true;

    }

    public  boolean addToPlayList(String songTitle, List<Song> playList){
        Song foundSong=findSong(songTitle);
        if (foundSong!=null){
            playList.add(foundSong);
            System.out.println("Song number "+songTitle+ "of the album "+ this.name+" has been added to playlist");
            return true;
        }

        System.out.println("Song number "+songTitle+ "couldn't be found in the album "+this.name);
        return false;
    }


}
